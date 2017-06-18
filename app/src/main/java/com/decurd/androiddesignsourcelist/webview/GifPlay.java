package com.decurd.androiddesignsourcelist.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.decurd.androiddesignsourcelist.R;

public class GifPlay extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_play);

        webView = (WebView) findViewById(R.id.webview);

        webView.loadUrl("file:///android_asset/gifplay.html");
    }
}
