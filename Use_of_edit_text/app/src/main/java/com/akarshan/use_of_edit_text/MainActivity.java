package com.akarshan.use_of_edit_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // create instans variable
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
                //get data from edit text by "get method"
                //data convvert into string bu use"tostring method"
                //and store into "name" in string type variable name
                String name=e1.getText().toString();

                if(name.isEmpty())
                {
                 //to set the error& & to use for validation
                    e1.setError("please enter the name");
                }

                else {
                    Toast.makeText(MainActivity.this, "get the text from edit text", Toast.LENGTH_SHORT).show();
                    //blank and enter new name
                }
e1.setText("");

            }
        });
    }

}
