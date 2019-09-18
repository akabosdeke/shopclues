package com.e.camra;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageButton b1,b2;
ImageView view;
Bitmap bmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.camra1);
        b2=findViewById(R.id.camra2);
        view=findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    @Nullable Intent data)
    {
     if(data!=null &&resultCode==RESULT_OK )
     {

     }
     else
         {
          Bundle b=data.getExtras();
          bmp= (Bitmap)b.get("data");
          view.setImageBitmap(bmp);

     }


        super.onActivityResult(requestCode, resultCode, data);
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             try {
                 getApplicationContext().setWallpaper(bmp);
             }
             catch (Exception e)
             {

             }
         }
     });
    }

}
