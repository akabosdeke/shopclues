package com.akarshan.autocomplete_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import static com.akarshan.autocomplete_textview.R.id.autoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView Actv;
    String[] array;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Actv= (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        array=getResources().getStringArray(R.array.places);
        Actv.setAdapter(adapter);
        Actv.setThreshold(1);



    }
}
