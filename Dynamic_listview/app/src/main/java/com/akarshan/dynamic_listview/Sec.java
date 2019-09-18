package com.akarshan.dynamic_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Sec extends AppCompatActivity {
ListView l;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //show the content
setContentView(R.layout.activity_sec);
        l= (ListView) findViewById(R.id.listview);
        arrayList=getIntent().getStringArrayListExtra("namee");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
    l.setAdapter(adapter);


    }
}
