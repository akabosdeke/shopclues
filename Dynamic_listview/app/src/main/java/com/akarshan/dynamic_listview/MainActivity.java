package com.akarshan.dynamic_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    Button btn1,btn2;
    ArrayList<String>   arrayList;
    ArrayAdapter<String> Array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);
        arrayList=new ArrayList<String>();
        btn1= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String phone = e2.getText().toString();
                arrayList.add(name+"\n"+phone);

            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Sec.class);
                i.putExtra("namee",arrayList);
                startActivity(i);

            }
        });


    }
}
