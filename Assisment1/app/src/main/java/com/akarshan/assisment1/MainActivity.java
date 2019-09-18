package com.akarshan.assisment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    EditText e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        e2= (EditText) findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this, "enter your age", Toast.LENGTH_SHORT).show();

                String age=e2.getText().toString();
                int agee=Integer.parseInt(age);
                if(agee>=19)
                {
                    Toast.makeText(MainActivity.this, "vote for modi", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "ghar ja beta", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
