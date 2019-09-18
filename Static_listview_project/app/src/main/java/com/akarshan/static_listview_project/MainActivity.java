package com.akarshan.static_listview_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lv;
    String[] writername, writerdetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.list);
        writername = getResources().getStringArray(R.array.author);
        writerdetails = getResources().getStringArray(R.array.details);
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,writername);
        lv.setAdapter(arr);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(MainActivity.this,Second.class);

                i.putExtra("name",writername[position]);
                i.putExtra("detail",writerdetails[position]);
                startActivity(i);
            }
        });


    }
}
