package com.akarshan.radio_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    RadioButton r1,r2,r3;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        r1= (RadioButton) findViewById(R.id.radio2);
        r2= (RadioButton) findViewById(R.id.radio3);
        r3= (RadioButton) findViewById(R.id.radio);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked())
                {
                    result=r1.getText().toString();
                }
                else if(r2.isChecked())
                {
                    result =r2.getText().toString();
                }
                else if(r3.isChecked())
                {
                    result=r3.getText().toString();

                }
                Toast.makeText(MainActivity.this, "your faviourate os is:-"+result, Toast.LENGTH_SHORT).show();


            }
        });

    }
}
