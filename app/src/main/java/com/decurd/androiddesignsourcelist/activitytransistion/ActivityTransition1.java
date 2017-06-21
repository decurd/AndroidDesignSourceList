package com.decurd.androiddesignsourcelist.activitytransistion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.decurd.androiddesignsourcelist.R;

public class ActivityTransition1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition2);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.not_move_activity,R.anim.rightout_activity);
    }
}
