package com.akarshan.static_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lv;
    String places[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.listview);
        places=getResources().getStringArray(R.array.places);
        ArrayAdapter<String> Array=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);
            lv.setAdapter(Array);
        //to perfromm the event on static loistview
       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this, "welcome"+places[position], Toast.LENGTH_SHORT).show();
           }
       });

    }
}
