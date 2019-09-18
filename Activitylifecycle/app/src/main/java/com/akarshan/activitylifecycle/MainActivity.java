package com.akarshan.activitylifecycle;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity



{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"oncreate is working",Toast.LENGTH_SHORT).show();

//it work when app is launched


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start is working", Toast.LENGTH_SHORT).show();
        //it woek when app is open or activity open



    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "this app start", Toast.LENGTH_SHORT).show();
        //when it resume from home to start


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, " this app is pause now", Toast.LENGTH_SHORT).show();
        //when pause or press back button
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "this is stop process", Toast.LENGTH_SHORT).show();
        //after app is stop it tell when app is closed
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, " destroy", Toast.LENGTH_SHORT).show();
    }


}

