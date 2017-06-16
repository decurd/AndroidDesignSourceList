package com.decurd.androiddesignsourcelist.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.decurd.androiddesignsourcelist.R;

public class CustomView1Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view1_main);
    }

    public void showDialog(View view) {
        Intent intent = new Intent(this, CustomView1Page1.class);
        intent.putExtra("data", "ㅋㅋㅋㅋㅋㅋ");
        intent.putExtra("image", "zzzzzzzzzzzzz");
        startActivity(intent);
    }

    public void showAlertDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this,
                R.style.Theme_AppCompat_Dialog);

        View layoutView = getLayoutInflater().inflate(R.layout.activity_custom_view1_page1, null, false);

        ((TextView)layoutView.findViewById(R.id.text_view)).setText("ㅋㅋㅋ");
        ((ImageView)layoutView.findViewById(R.id.image_view)).setImageResource(R.drawable.iron_man);

        builder.setView(layoutView);
        builder.show();
    }
}
