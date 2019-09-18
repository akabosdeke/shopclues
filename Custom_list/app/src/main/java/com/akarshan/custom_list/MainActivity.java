package com.akarshan.custom_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView ls;
Integer image[]={
        //picture name
        R.drawable.t,
        R.drawable.s,
        R.drawable.o,
        R.drawable.n,
        };

        String text[]={"alpha","beta","gamaa","lamda"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls= (ListView) findViewById(R.id.list);
        mynewadapterclass adapter=new  mynewadapterclass(this,text,image);
        ls.setAdapter(adapter);


    }
}
//if you want to get the content  or any layout content in bussiness logic page so u must be use layout inflater class;