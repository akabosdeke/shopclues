package com.akarshan.who;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        e1= (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String agee=e1.getText().toString();
                int age=Integer.parseInt(agee);
                if(age>=1&&5>=age)
                {
                    Toast.makeText(MainActivity.this, "go to counter number 1 for poilio drop", Toast.LENGTH_SHORT).show();

                }
                else if(age>=5&&10>=age){
                    Toast.makeText(MainActivity.this, "go to counter number 2 for Injection", Toast.LENGTH_SHORT).show();

                }
                else if(age>=10&&15>=age){
                    Toast.makeText(MainActivity.this, "go to counter number 3 for taking pills of vitamin and ,miniral", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "ghar ja beta", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
