package com.decurd.androiddesignsourcelist.transition;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeImageTransform;
import android.transition.TransitionSet;
import android.view.Window;

import com.decurd.androiddesignsourcelist.R;

public class Transition2Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // 화면 전환 기능 켜기(위치 중요 super위에 반드시 있어야 함)
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition2_page1);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            TransitionSet set = new TransitionSet();
            set.addTransition(new ChangeImageTransform());
            getWindow().setExitTransition(set);
            getWindow().setEnterTransition(set);

        }
    }
}
