package com.decurd.androiddesignsourcelist.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.decurd.androiddesignsourcelist.R;

public class ToggleButtons extends AppCompatActivity {
    CustomSwitch mCustomSwitch = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        mCustomSwitch = (CustomSwitch)findViewById(R.id.setting_alram_push_switch);
        mCustomSwitch.setOnClickListener(mSwitchOnClickListener);
    }

    View.OnClickListener mSwitchOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            switch(v.getId()) {
                case R.id.setting_alram_push_switch :
                    mCustomSwitch.startSwitchAnimation(ToggleButtons.this);
                    Toast.makeText(getBaseContext(), "The current state of the switch is " + mCustomSwitch.getSwitchOnOff() + ".", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
