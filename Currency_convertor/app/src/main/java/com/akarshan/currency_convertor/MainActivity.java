package com.akarshan.currency_convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner s1,s2;
    TextView tv;
    Button btn;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        s1= (Spinner) findViewById(R.id.spinner);
        s2= (Spinner) findViewById(R.id.spinner2);
        e1= (EditText) findViewById(R.id.editText);
        tv= (TextView) findViewById(R.id.textView);



    }
}
