package com.akarshan.myfrist_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    Button btun,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btun = (Button) findViewById(R.id.aka);
        button3=(Button)findViewById(R.id.button3);
        btn.setOnClickListener(this);
        btun.setOnClickListener(this);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public void onClick(View v) {
        if (btn == v) {
            Toast.makeText(this, "welcome to onclick listner", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "welcome ducat", Toast.LENGTH_SHORT).show();
        }
    }
}
