package com.decurd.androiddesignsourcelist.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.decurd.androiddesignsourcelist.R;

public class CustomView1Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);   // 액션바 없애기
        setContentView(R.layout.activity_custom_view1_page1);

        if (getIntent() != null) {
            String data = getIntent().getStringExtra("data");
            ((TextView)findViewById(R.id.text_view)).setText(data);

            String image = getIntent().getStringExtra("image");
            if (image != null) {
                ((ImageView)findViewById(R.id.image_view)).setImageResource(R.drawable.iron_man);
            }
        }
    }
}
