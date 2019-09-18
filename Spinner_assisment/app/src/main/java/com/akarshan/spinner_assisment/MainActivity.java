package com.akarshan.spinner_assisment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String[] place;
    String[] places;
    Spinner s1,s2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1= (Spinner) findViewById(R.id.spinner);
        s2= (Spinner) findViewById(R.id.spinner2);

        btn= (Button) findViewById(R.id.button);
        place=getResources().getStringArray(R.array.state);

        ArrayAdapter<String> adapter=new<String> ArrayAdapter(this,android.R.layout.simple_list_item_1,place);
        s1.setAdapter(adapter);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data=s1.getSelectedItem().toString();
                ArrayAdapter<String> araay=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });



    }
}
