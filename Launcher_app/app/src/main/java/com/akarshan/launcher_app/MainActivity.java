package com.akarshan.launcher_app;
//third use of intent
//launch app internak or external via app
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //camra
               // Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                //Intent i=
               //(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);this code is for open the gallery.
                //to launch the contacts(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI)
                //to open the browser through the link(Intent.ACTION_VIEW,
                //Uri.parse("https;//www.google.com")
                //to open phone settings(Settings.ACTION_SETTINGS)
               // Intent i=new Intent(Settings.ACTION_SETTINGS);
                //startActivity(i);
                        //
                //provider is a subpackage
                //class=mediastore
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //to use & lauch external app,this code is working
                PackageManager pk=getPackageManager();
                Intent i=pk.getLaunchIntentForPackage("com.whatsapp");

                if (i==null){
                    Intent o=pk.getLaunchIntentForPackage("com.android.vending");
                    startActivity(o);
                }
               //com.android.vending




            }
        });
    }
}
