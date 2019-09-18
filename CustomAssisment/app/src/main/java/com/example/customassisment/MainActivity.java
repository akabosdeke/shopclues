package com.example.customassisment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button btn;
 EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_ducat);

      btn=dialog.findViewById(R.id.button);
      e1=dialog.findViewById(R.id.editText);
      e2=dialog.findViewById(R.id.editText2);

      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String name=e1.getText().toString();
              String pass=e2.getText().toString();
              if (name.equals("Ducat")&&pass.equals("12346"))
              {


                dialog.dismiss();
              }
              else
              {
                 e1.setError("Wrong User Name");
                 e2.setError("Wrong password");
              }
          }
      });
        dialog.show();
    }
}
