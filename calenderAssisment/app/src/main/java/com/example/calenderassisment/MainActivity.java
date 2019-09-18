package com.example.calenderassisment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    int y,m,d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText);
        Calendar calendar=  Calendar.getInstance();
        y=calendar.get(Calendar.YEAR);
        m=calendar.get(Calendar.MONTH);
        d= calendar.get(Calendar.DAY_OF_MONTH);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this,listener,y,m,d).show();
                //
                //to open the current date to the system
            }
        });
    }
    DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int dayofMonth, int month, int year)
        {
            e1.setText(dayofMonth+"/"+(month+1)+ "/"+year);



        }
    };



}

