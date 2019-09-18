package com.akarshan.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btn;
    TextView counter,score,auto;
    int c,s;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter= (TextView) findViewById(R.id.textView);
        score= (TextView) findViewById(R.id.textView2);
        auto= (TextView) findViewById(R.id.textView3);
        // auto=findViewById(R.id.textView2)
        //final Random myrandom=new Random();
        btn= (Button) findViewById(R.id.button);
        e1= (EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c++;

                if(c<=5)
                {
                    counter.setText("counter:- "+c);
                    Random r=new Random();
                    int number=r.nextInt(10);
                    auto.setText("auto genetrated number:-"+number);
                    int usernum=Integer.parseInt(e1.getText().toString());


                    if(number==usernum)
                    {
                        s++;
                        score.setText();

                    }



                }
                else{
                    c=0;
                    counter.setText("counter:- "+c);
                    s=0;
                    score.setText("score:- "+s);
                    auto.setText("auto genetrated number:-"+number);

                }

            }

        });

    }
}
