package com.akarshan.events_on_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import static com.akarshan.events_on_spinner.R.id.spinner;

public class MainActivity extends AppCompatActivity {
Spinner sp;
    TextView tv;
    String[] places;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        tv= (TextView) findViewById(R.id.textView);
        places=getResources().getStringArray(R.array.state);
        //add array in any component
        ArrayAdapter<String> adapter=new<String> ArrayAdapter(this,android.R.layout.simple_list_item_1,places);

        //for set the adaptor.here sp is obeject of spinner
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //jo item select honge wahi usi position par dikhai denge
                tv.setText(""+places[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
