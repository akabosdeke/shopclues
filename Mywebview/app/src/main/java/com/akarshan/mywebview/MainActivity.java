package com.akarshan.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
WebView webview;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview= (WebView) findViewById(R.id.webView);
        btn1= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button2);
        //javascript feature is by default is false here,so pas true here
        webview.getSettings().setJavaScriptEnabled(true);
//to open the all link so we write here   webview.setWebViewClient(new WebViewClient());
        webview.setWebViewClient(new WebViewClient());
        //method to load url
        webview.loadUrl("https://www.ducatindia.com");
        //if you want to back and forword functionality to mamke button and call the function webview.gofforwaed andwebView.goback
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this is use to forward function
                webview.goForward();
            }
        });
   btn2.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           //this is used to goback function on  click
           webview.goBack();
       }
   });
    }
}
