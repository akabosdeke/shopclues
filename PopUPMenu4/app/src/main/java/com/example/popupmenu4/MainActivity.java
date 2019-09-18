package com.example.popupmenu4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.text);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(MainActivity.this, "is it working", Toast.LENGTH_SHORT).show();
                PopupMenu p=new PopupMenu(MainActivity.this,t);
                p.getMenuInflater().inflate(R.menu.pop_menu,p.getMenu());
                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(MainActivity.this, ""+ menuItem, Toast.LENGTH_SHORT).show();
                        String choice=menuItem.toString();
                        if (choice.equals("green"))
                        {
                            t.setTextColor(Color.GREEN);
                        }
                        menuItem.getItemId();
                        return false;

                    }
                });
                p.show();
            }
        });
    }
}
