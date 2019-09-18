package com.akarshan.radiobutton_assisment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    RadioButton r1,r2;
    EditText e1;
    TextView t1;
    String result ,resullt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1= (RadioButton) findViewById(R.id.radioButton);
        r2= (RadioButton) findViewById(R.id.radioButton2);
        e1= (EditText) findViewById(R.id.editText);
        //t1= (TextView) findViewById(R.id.textView);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()){
                    result=r1.getText().toString();
                    resullt=e1.getText().toString();


                }
                else if(r2.isChecked())
                {
                    result=r2.getText().toString();
                    resullt=e1.getText().toString();

                }
                //here its used for the toast wheather iyts male or female;
               if(r1.isSelected()){
                   Toast.makeText(MainActivity.this, "welcome to ducate mr "+resullt, Toast.LENGTH_SHORT).show();
                }
                else if(r2.isChecked()){
                   Toast.makeText(MainActivity.this, "welcome to ducate mrs "+resullt, Toast.LENGTH_SHORT).show();
               }
            }
        });


    }
}
