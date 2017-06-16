package com.decurd.androiddesignsourcelist.transition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.decurd.androiddesignsourcelist.R;

public class Transition2Main extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition2_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Transition2Main.this, Transition2Page1.class);

                startActivity(intent,
                        ActivityOptions.makeSceneTransitionAnimation(Transition2Main.this, view, "image").toBundle());
                // "image" = xml.transitionName, 트랜지션이 시작하는 곳의 이름과 받는 곳의 이름이 같아야 한다
            }
        });
    }
}
