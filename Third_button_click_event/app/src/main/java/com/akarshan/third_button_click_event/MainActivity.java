package com.akarshan.third_button_click_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button2);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "long press button", Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        );

    }

    //create a new method to perform event directly
//call through method to perform button event

    public void jadu(View v)
    {

        Toast.makeText(this, "this is button event directly perform", Toast.LENGTH_SHORT).show();

    }
}
