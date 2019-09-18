package com.akarshan.webview_assisment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listview;
    String writer[];
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview= (ListView) findViewById(R.id.listview);
        writer=getResources().getStringArray(R.array.writer);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,writer);
        listview.setAdapter(adapter);

     listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Intent i=new Intent(MainActivity.this,Secondwebview.class);

             i.putExtra("name",writer[position]);

             startActivity(i);
         }
     });

    }
}
