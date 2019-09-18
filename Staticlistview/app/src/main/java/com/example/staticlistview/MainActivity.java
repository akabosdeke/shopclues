package com.example.staticlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1);
String[] Li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Li=getResources().getStringArray(R.array.ListV);
        lv.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add("Delete");

                contextMenu.add("Rename");
            }
        });



    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        String title=item.getTitle().toString();
        if (title.equals("Delete"))
        {
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
            }
        else
        {
            Toast.makeText(this, "Rename", Toast.LENGTH_SHORT).show();

        }

        return super.onContextItemSelected(item);
    }
}
