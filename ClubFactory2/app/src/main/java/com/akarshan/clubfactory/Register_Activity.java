
//this aactivity is used for register the new user or join now or signup
package com.akarshan.clubfactory;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Register_Activity extends AppCompatActivity {
 private Button createAccountButton;
    private EditText inputname,inputphonenumber,inputpassword;
    //private progressDialog loadingBar;

    public Register_Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        inputname= (EditText) findViewById(R.id.register_name_input);
        inputphonenumber= (EditText) findViewById(R.id.register__mo_input);
        inputpassword= (EditText) findViewById(R.id.register_password_input);
        createAccountButton= (Button) findViewById(R.id.login_button);
        Toast.makeText(this, "this is register activity", Toast.LENGTH_SHORT).show();
      //  loadingBar=new progressDialog(this);
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //we make here new create method
                createAccount();
            }
        });

    }

    private void createAccount()
    {
        //get the input =name,phn and password
        String name=inputname.getText().toString();
        String phone=inputphonenumber.getText().toString();
        String password= inputpassword.getText().toString();

        //(TextUtils= it is used to check the text is empty oe not.frist we will check name so wwe pass the name as peremeter)
        if (TextUtils.isEmpty(name))
        {
            Toast.makeText(this, "write your name!!!", Toast.LENGTH_SHORT).show();
        }
       else if (TextUtils.isEmpty(phone))
        {
            Toast.makeText(this, "write your phone number!!!", Toast.LENGTH_SHORT).show();
        }
       else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "write your password!!!", Toast.LENGTH_SHORT).show();
        }
        else{
        //    loadingBar.setTitle("Create account");//set title in loading bar
          //  loadingBar.setMessage("please wait,while we are the checking");
            //loadingBar.setCanceledOnTouchOutside(false);
            //loadingBar.show();
            //for validation purpose write the code as below
            validatephoneNumber(name,phone,password);

        }
    }
//make the method to validate
    private  void  validatephoneNumber( String name,String phone,String password)
    {
    //final DatabaseReference RootRef;
      //  RootRef=FireBaseDatabase.getInstance().getReference();
        //RootRef.addListenerForSingleValueEvent(new ValueEventListener)
        {
          //  @Override
            //public void onDataChange (@NonNull DataSnapshot dataSnapshot)
            {
              //  if (!(dataSnapshot.child("user").child(phone).exists())) {
                    //frist check the number is already in database or not because we consider number as primery key
                    //create account for new user
                //    HashMap<String, Object> userdatamap = new HashMap<String>();
                  //  userdatamap.put("phone", phone);
                    //userdatamap.put("pasword", password);
                    //userdatamap.put("name", name);
                    //make parents node for all  user
                    //RootRef.child("user").child(phone).updateChildren(userdatamap)
                      //      .addOnCompleteListner(new OnCompleteListner<Void>() {
                        //        @Override
                          //      public void onComplte(@NonNull Task<Void> task) {
                            //        if (task.isSuccessful()) {
                                        Toast.makeText(Register_Activity.this, "Congratulation your acount has been created..", Toast.LENGTH_SHORT).show();
                              //          loadingBar.dismiss();
                                        Intent i = new Intent(Register_Activity.this, Login_activity.class);
                                        startActivity(i);
                                    }
                                    //else {
                                        Toast.makeText(Register_Activity.this, "Network Error please Try again later", Toast.LENGTH_SHORT).show();
                                      //  loadingBar.dismiss();
                                    }
                                }
                                /**
                            });
                } else {//if the number is already exist in database
                    Toast.makeText(this, "this " + phone + "is already exists", Toast.LENGTH_SHORT).show();
                 //   loadingBar.dismiss();
                    Toast.makeText(this, "please try againn using another phone number", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Register_Activity.this, MainActivity.class);
                    startActivity(i);
                }
            }
            //@Override
            //  public void onCancelled(@NonNull DatabaseError databaseError)
            {

            }
            // when it remove last curly braces remove});
        }
    }
**/
}
