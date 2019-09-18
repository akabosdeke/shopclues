package com.akarshan.new_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {
TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        //t1= (TextView) findViewById(R.id.textView2);
        t1= (TextView) findViewById(R.id.textView3);
       t3= (TextView) findViewById(R.id.textView4);
        Bundle b=getIntent().getExtras();
        String n=b.getString("name");
        String p=b.getString("phone");


        t1.setText(n+"\n"+p);

    }
}
