package com.decurd.androiddesignsourcelist.activitytransistion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.decurd.androiddesignsourcelist.R;

public class ActivityTransition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

    }

    public void btnClick(View view) {
        //overridePendingTransition(int showAnim, int hideAnim);
        //다른 액티비티 호출 시
        Intent intent = new Intent(this, ActivityTransition1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rightin_activity,R.anim.not_move_activity);
    }

    public void btnClose(View view) {
        //overridePendingTransition(int showAnim, int hideAnim);
        //현재 액티비티 종료 시
        finish();
        overridePendingTransition(R.anim.not_move_activity,R.anim.rightout_activity);
    }
}
