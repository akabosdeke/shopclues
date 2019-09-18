package com.akarshan.text_inspection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.input;

public class MainActivity extends AppCompatActivity {
Button btn;
    EditText e1;
    char ch;
    String te="";
   int lower=0;
    int upper=0;

    int i,numbercount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        e1.findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=e1.getText().toString();

            }
        });
    }
}
