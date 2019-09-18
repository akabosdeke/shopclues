package com.akarshan.login_assisment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1= (TextView) findViewById(R.id.textView);
        tv1= (TextView) findViewById(R.id.textView);
        //to fetech the data which is send by intent (by use the methid(getIntent().getExtras();))
        Bundle b =getIntent().getExtras();
        //all data store in bundle now,extract the data from bundle
        String n=  b.getString("name");
        String p=  b.getString("phone");
        tv1.setText(n+"\n" +p);
    }
}
