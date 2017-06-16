package com.decurd.androiddesignsourcelist.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.decurd.androiddesignsourcelist.R;

public class Animation1 extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation1);

        mImageView = (ImageView) findViewById(R.id.image_view);
    }

    public void animation1(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        mImageView.startAnimation(animation);
    }

    public void animation2(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
        mImageView.startAnimation(animation);
    }
}
