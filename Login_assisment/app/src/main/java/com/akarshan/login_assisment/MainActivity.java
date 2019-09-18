package com.akarshan.login_assisment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,phn;
    Button btn;
    Spinner sp1;
    TextView tv;
    RadioButton radio1,radio2;
    Switch e1;
    CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText) findViewById(R.id.editText);
        phn= (EditText) findViewById(R.id.editText2);
      btn= (Button) findViewById(R.id.button);
        sp1= (Spinner) findViewById(R.id.spinner);
        radio1= (RadioButton) findViewById(R.id.r2);
        radio2= (RadioButton) findViewById(R.id.radioButton2);
        tv= (TextView) findViewById(R.id.textView);
        e1= (Switch) findViewById(R.id.switch1);
check= (CheckBox) findViewById(R.id.checkBox);
        sp1.setEnabled(true);
        String[] crs=getResources().getStringArray(R.array.course);
        ArrayAdapter<String> ar=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,crs);
        sp1.setAdapter(ar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s1= name.getText().toString();
                String s2= phn.getText().toString();
              if (radio1.isChecked())
              {
                 String l= radio1.getText().toString();


              }
              else if (radio2.isChecked()){
                  String r=radio2.getText().toString();

              }
              if (e1.isChecked())
              {
                  Toast.makeText(MainActivity.this, "this is on", Toast.LENGTH_SHORT).show();
              }
              else {
                  Toast.makeText(MainActivity.this, "this is off", Toast.LENGTH_SHORT).show();
              }
if (check.isChecked())
{
    String z=check.getText().toString();
}

                    String o=name.getText().toString();
                String op=phn.getText().toString();
                Intent inti=new Intent(MainActivity.this,Second.class);
                inti.putExtra("name",o);
                inti.putExtra("phone",op);
                startActivity(inti);

                sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                       /** String data=s1.getSelectedItem().toString();

                        if (data.equals("java"))
                        {
                          trainer name +mr or miss
                        }
                        **/
                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

        });
    }
}
