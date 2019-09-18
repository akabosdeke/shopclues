package com.akarshan.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
GridView gv;
    String place[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv= (GridView) findViewById(R.id.grid);
        //checkn this line and correction in autocomplte textview
        place=getResources().getStringArray(R.array.data);
        ArrayAdapter<String> Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, place);

        gv.setAdapter(Adapter);

    }
}
