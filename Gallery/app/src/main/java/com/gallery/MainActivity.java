package com.gallery;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        imageView=findViewById(R.id.ImageView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setType("Image/");
                //this line is use to take image anywhere
                i.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(i,0);

             /**
              this code is use for OPEN GALLERY
                Intent ii=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(ii);
              **/

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==RESULT_OK && data!=null)
        {
            //we have already the data in the phone so we pick it out thatswhy we r not using
            Uri filepath=data.getData();
            imageView.setImageURI(filepath);
        }else {
            Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
        }


        super.onActivityResult(requestCode, resultCode, data);
    }
}
