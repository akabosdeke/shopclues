package com.akarshan.alertdailogue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    AlertDialog.Builder ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            ab=new  AlertDialog.Builder(MainActivity.this);

                ab.setTitle("tufani");
                ab.setMessage("aaj kuch toofani krte hai");
                ab.setIcon(R.drawable.welcome);
                ab.setCancelable(false);//to hold the scree other wise the screen is back or off while clicking anywhere
              //  ab.setPositiveButton("Yes",null);
                //you can work as above code.when we need null
                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Please Wait.Your works is in progress", Toast.LENGTH_SHORT).show();
                    }
                });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Stay at Home.Have a nice Day.", Toast.LENGTH_SHORT).show();
                    }
                });

                ab.show();

            }
        });
    }
}
