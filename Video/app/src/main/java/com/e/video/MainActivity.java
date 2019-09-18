package com.e.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide toolbar
        getSupportActionBar().hide();
        //now hide stuts bar
        View v=getWindow().getDecorView();
        int ui=v.SYSTEM_UI_FLAG_FULLSCREEN;
        v.setSystemUiVisibility(ui);

        view=findViewById(R.id.videoView);
        view.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.a));
view.setMediaController(new MediaController(this));
view.start();


    }
}
