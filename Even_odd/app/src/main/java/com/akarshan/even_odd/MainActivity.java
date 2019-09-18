package com.akarshan.even_odd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
Button btn;
    EditText vehicle_number;
    EditText date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button)findViewById(R.id.button2);
        vehicle_number= (EditText) findViewById(R.id.editText);
        date= (EditText) findViewById(R.id.editText3);
        final String data= vehicle_number.getText().toString();
         final String data2=date.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(data);
                int num2=Integer.parseInt(data2);
                if(num%2==0)
                {
                    if(num2 >=1&& num2<=15)
                    {
                        Toast.makeText(MainActivity.this, "vehicle move on 1-15", Toast.LENGTH_SHORT).show();

                    }
                    if(num2>=15){
                        Toast.makeText(MainActivity.this, "vehicle  cant move on 1-15", Toast.LENGTH_SHORT).show();
                    }
                }
                else{

                    if(num>=16 && num2<=30)
                    {
                        Toast.makeText(MainActivity.this, "vehicle move on 15-30", Toast.LENGTH_SHORT).show();
                    }
                   if(num2<16)
                   {
                       Toast.makeText(MainActivity.this, "vehicle can't move on 15-30", Toast.LENGTH_SHORT).show();
                   }
                }


            }
        });

    }
}
