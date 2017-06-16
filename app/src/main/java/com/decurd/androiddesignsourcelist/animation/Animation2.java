package com.decurd.androiddesignsourcelist.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;

import com.decurd.androiddesignsourcelist.R;

public class Animation2 extends AppCompatActivity {

    EditText mEditText;

    Animation mShakeAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);

        mShakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake);
        mShakeAnimation.setInterpolator(new CycleInterpolator(7)); // 7=흔들림정보

        mEditText = (EditText) findViewById(R.id.edit_text);

        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mEditText.startAnimation(mShakeAnimation);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
