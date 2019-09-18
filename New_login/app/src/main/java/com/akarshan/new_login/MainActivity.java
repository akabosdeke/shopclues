package com.akarshan.new_login;

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
EditText e1,e2;
    Spinner sp;
 String[] palce;
    TextView t;
Switch s1;
    Button btn;
    CheckBox check;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);
        sp= (Spinner) findViewById(R.id.spinner);
        btn= (Button) findViewById(R.id.button);
        t= (TextView) findViewById(R.id.textView);
        s1= (Switch) findViewById(R.id.switch1);
        r1= (RadioButton) findViewById(R.id.radioButton);
        r2= (RadioButton) findViewById(R.id.radioButton2);
        check= (CheckBox) findViewById(R.id.checkBox2);

        palce=getResources().getStringArray(R.array.course);
        ArrayAdapter<String> Array=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,palce);
        sp.setAdapter(Array);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data=sp.getSelectedItem().toString();
                sp.setEnabled(true);
                if (data.equals("java")){

                    t.setText("mukesh");

                }
                else if (data.equals("kotlin"))
                {
                    t.setText("kapil");

                }
                else if (data.equals("python"))
                {
                    t.setText("harsh");


                }
                else if (data.equals("data_science"))
                {

                    t.setText("ashu");


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

 if (r1.isChecked())
 {
      String re=r1.getText().toString();
     //Toast.makeText(MainActivity.this, "FEmale", Toast.LENGTH_SHORT).show();
 }
 else if (r2.isChecked())
 {
      String res=r2.getText().toString();
     //Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
 }
 btn.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         if (s1.isChecked())
         {
             String l=s1.getText().toString();
             Toast.makeText(MainActivity.this, "oonn", Toast.LENGTH_SHORT).show();

         }
         else {
             String x=s1.getText().toString();
             // i.putExtra("male",x);
             Toast.makeText(MainActivity.this, "off", Toast.LENGTH_SHORT).show();
         }
         if (check.isChecked())
         {
           String ch=check.getText().toString();
             //Toast.makeText(MainActivity.this, "checed `box is check", Toast.LENGTH_SHORT).show();

         }
         else
         {
             String che=check.getText().toString();
             //Toast.makeText(MainActivity.this, "checed box is not check", Toast.LENGTH_SHORT).show();

         }
         Intent i=new Intent(MainActivity.this,SecActivity.class);
         String namee=e1.getText().toString();
         String phone=e2.getText().toString();
         //String techers=teacher_name.getText().toString();
         String che=check.getText().toString();

         i.putExtra("name",namee);

         i.putExtra("phone",phone);
         //i.putExtra("check",che);
         //startActivity(i);
     }
 });
    }


}
