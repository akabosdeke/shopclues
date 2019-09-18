package com.akarshan.progressdailogue;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
ProgressDialog pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            pb=new ProgressDialog(MainActivity.this);
            pb.setIcon(R.drawable.welcome);
            pb.setTitle("this is for shaoo");
            pb.setMessage("Message:-Please wait and Keep Calm!!! ");
            pb.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);//this is change style and show downloading in horizontal
            pb.show();
         pb.setCancelable(false);
           pb.setCanceledOnTouchOutside(false);//this is to go back the dailogue
        }
    });

    }
}
