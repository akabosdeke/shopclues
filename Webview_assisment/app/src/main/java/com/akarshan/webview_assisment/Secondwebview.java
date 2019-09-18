package com.akarshan.webview_assisment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Secondwebview extends AppCompatActivity {
    WebView webview;
String n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondwebview);
        webview= (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        Bundle b  = getIntent().getExtras();
         n=b.getString("name");
         webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://en.wikipedia.org/wiki/"+n);


    }
}
