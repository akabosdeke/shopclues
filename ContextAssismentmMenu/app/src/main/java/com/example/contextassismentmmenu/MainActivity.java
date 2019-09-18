package com.example.contextassismentmmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    ArrayAdapter adapter;
    ArrayList Arraylist;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list);
        // places=getResources().getStringArray(R.array.places);
        Arraylist = new ArrayList();
        Arraylist.add("alpha");
        Arraylist.add("beta");
        Arraylist.add("gamaa");
        Arraylist.add("torque");
        Arraylist.add("pie");
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arraylist);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        menu.add("Delete");
        menu.add("Rename");
        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    public boolean onContextItemSelected(@NonNull final MenuItem item) {
        AdapterView.AdapterContextMenuInfo information = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        final int index = information.position;

        String title = item.getTitle().toString();
        if (title.equals("Delete")) {
            Arraylist.remove(index);
            adapter.notifyDataSetChanged();

        } else {

            Dialog dialog=new Dialog(this);
            dialog.setContentView(R.layout.custom);
            dialog.show();

            Button bt=dialog.findViewById(R.id.button);
            e=dialog.findViewById(R.id.editText);

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    Arraylist.set(index,e.getText().toString());
                    adapter.notifyDataSetChanged();

                }
            });
        }


        return super.onContextItemSelected(item);
    }
}
