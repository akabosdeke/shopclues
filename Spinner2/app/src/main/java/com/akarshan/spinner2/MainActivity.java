package com.akarshan.spinner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b;
    TextView tv;
    Spinner sp1,sp2;
    String[] States;
    String[] citi;
    String[] cit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.B);
        sp1= (Spinner) findViewById(R.id.S);
        sp2= (Spinner) findViewById(R.id.S2);


        States=getResources().getStringArray(R.array.state);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,States);
        sp1.setAdapter(adapter);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// selected data is given from the string.xml and store in string data;
                String Data=sp1.getSelectedItem().toString();
                //Toast.makeText(MainActivity.this, "data"+Data, Toast.LENGTH_LONG).show();
                if(Data.equals("delhi")){
                    sp2.setEnabled(true);
                    citi=getResources().getStringArray(R.array.delhi_cities);
                    ArrayAdapter<String> ap=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,citi);
                    sp2.setAdapter(ap);
                }
                else if(Data.equals("uttar pradesh"))
                {
                    sp2.setEnabled(true);
                    cit=getResources().getStringArray(R.array.uttarpradesh_cities);
                    ArrayAdapter<String> a=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,cit);
                    sp2.setAdapter(a);


                }
                else if (Data.equals("madhya pradesh"))
                {
                    sp2.setEnabled(true);
                   String[] ci=getResources().getStringArray(R.array.madhyapradesh_cities);
                    ArrayAdapter<String> a=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,ci);
                    sp2.setAdapter(a);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
sp2.setEnabled(false);

            }

        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String n=   sp1.getSelectedItem().toString();
                String p=sp2.getSelectedItem().toString();

                tv.setText(" "+n +" "+p);
            }
        });

    }
}
