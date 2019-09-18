package com.akarshan.second_use_of_intent;
//to transfer data from one activity to another activity
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the data from the string
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Intent i=new Intent(MainActivity.this,Secondactivity.class);
                //use method of intent class this is putExtra(through putextra method)send data in form of key n valu
                i.putExtra("name_key",s1);
                i.putExtra("phone_name",s2);
                startActivity(i);



            }
        });
    }
}
