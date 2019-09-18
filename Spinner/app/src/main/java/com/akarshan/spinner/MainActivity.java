package com.akarshan.spinner;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static com.akarshan.spinner.R.id.spinner;

public class MainActivity extends AppCompatActivity {
String[] palaces;
    Spinner s;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       s=(Spinner)findViewById(spinner);
        btn= (Button) findViewById(R.id.button);
        palaces=getResources().getStringArray(R.array.jadu);
        ArrayAdapter<String> array=new <String>ArrayAdapter(this,R.layout.apna_layout,palaces);
        s.setAdapter(array);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item=s.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, ""+item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
































































