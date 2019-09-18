package com.akarshan.static_listview_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1= (TextView) findViewById(R.id.textView);
        tv2= (TextView) findViewById(R.id.textView2);
        Bundle b  = getIntent().getExtras();
        String n=b.getString("name");
        String p=b.getString("detail");
        tv1.setText(n);
        tv2.setText(p);


    }
}
