package com.akarshan.spinner_pratice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import static com.akarshan.spinner_pratice.R.array.delhi_city;
import static com.akarshan.spinner_pratice.R.array.state;

public class MainActivity extends AppCompatActivity {
Spinner s1,s2;
    TextView tv;
    Button btn;
    String[] place;
    String[] citi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1= (Spinner) findViewById(R.id.spinner);
        s2= (Spinner) findViewById(R.id.spinner2);
        btn= (Button) findViewById(R.id.button);
        place=getResources().getStringArray(state);
        ArrayAdapter <String>array=new <String>ArrayAdapter(this,android.R.layout.simple_list_item_1,place);
        s1.setAdapter(array);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data=s1.getSelectedItem().toString();
                if (data.equals("haryana"))
                {
                    s2.setEnabled(true);

                    citi=getResources().getStringArray(R.array.haryana_city);
                   ArrayAdapter<String> ar=new<String> ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,citi);
                  s2.setAdapter(ar);

                }
                else if (data.equals("uttar pradesh")){
                    s2.setEnabled(true);
                    String[] cit=getResources().getStringArray(R.array.uttar_pradesh);
                    ArrayAdapter<String> a=new<String> ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,cit);
                    s2.setAdapter(a);
                }
                else if (data.equals("delhi"))
                {  s2.setEnabled(true);
                    String[] c=getResources().getStringArray(R.array.delhi_city);
                    ArrayAdapter arr=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,c);
                    s2.setAdapter(arr);
                }
                else if (data.equals("bihar"))
                {
                    s2.setEnabled(true);
                    String[] r=getResources().getStringArray(R.array.bihar_city);
                    ArrayAdapter<String> o=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,r);
                    s2.setAdapter(o);
                }
                else if (data.equals("jammu and  kashmir"))
                {
                    s2.setEnabled(true);
                    String[] t1=getResources().getStringArray(R.array.jammu_kashmir_city);
                    ArrayAdapter<String> tx=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,t1);
                    s2.setAdapter(tx);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
