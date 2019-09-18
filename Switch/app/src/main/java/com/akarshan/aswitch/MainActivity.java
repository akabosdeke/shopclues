//switch is used to (like toggle button which can perform too event togeather & it use oncheckedchangelistner)

package com.akarshan.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Switch e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is switch button on or off
        e1= (Switch) findViewById(R.id.switch1);
        e1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this, "switch on", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "switch off", Toast.LENGTH_SHORT).show();

                }
            }
        });
        //isko complete krne ke baad if else b lagana h
    }
}
