package com.decurd.androiddesignsourcelist.transition;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.decurd.androiddesignsourcelist.R;

public class Transition1 extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition1);

        mImageView = (ImageView) findViewById(R.id.image_view);
    }

    public void transition(View view) {
        TransitionDrawable transitionDrawable = (TransitionDrawable) mImageView.getDrawable();
        transitionDrawable.startTransition(500);
    }
}
