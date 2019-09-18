package com.akarshan.second_use_of_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        tv= (TextView) findViewById(R.id.textView);
        //to fetech the data which is send by intent (by use the methid(getIntent().getExtras();))
       Bundle b =getIntent().getExtras();
        //all data store in bundle now,extract the data from bundle
      String n=  b.getString("name_key");
        String p=  b.getString("phone_name");
        tv.setText(n+"\n" +p);
    }
}
