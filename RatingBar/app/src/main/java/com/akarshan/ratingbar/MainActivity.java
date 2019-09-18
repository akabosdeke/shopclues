package com.akarshan.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    RatingBar rt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        rt= (RatingBar) findViewById(R.id.ratingBar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double star= rt.getRating();
                Toast.makeText(MainActivity.this, star+"star", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
//use ratijg bar liatner
//onratingbarchangelistner
