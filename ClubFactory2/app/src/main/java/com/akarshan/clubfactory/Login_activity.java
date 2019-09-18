package com.akarshan.clubfactory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.akarshan.clubfactory.Model.User;


public class Login_activity extends AppCompatActivity {
private EditText inputnumber,inputpassword;
    private Button LoginButton;
    private String parentsDbname="Users";
   // private progressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        inputnumber= (EditText) findViewById(R.id.login_phnno_input);
        inputpassword= (EditText) findViewById(R.id.register_password_input);
        LoginButton= (Button) findViewById(R.id.login_button);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginUser();
            }

            private void LoginUser()
            {
                String phone=inputnumber.getText().toString();
                String password= inputpassword.getText().toString();
                  if (TextUtils.isEmpty(phone))
            {
                Toast.makeText(Login_activity.this, "write your phone numbre", Toast.LENGTH_SHORT).show();
            }
            else if (TextUtils.isEmpty(password))
            {
                Toast.makeText(Login_activity.this, "write your password", Toast.LENGTH_SHORT).show();
            }

            else
                  {
                      //loadingBar.setTitle("Login account");//set title in loading bar
                      //  loadingBar.setMessage("please wait,while we are the checking");
                      //loadingBar.setCanceledOnTouchOutside(false);
                      //loadingBar.show();

                      AllowAccessToAccount( phone,password);
                  }
            }

            //new  AllowAccessToAccount method
            private void AllowAccessToAccount(String phone, String password)
            {
                //final DatabaseReference RootRef;
                //  RootRef=FireBaseDatabase.getInstance().getReference();
                //RootRef.addListenerForSingleValueEvent(new ValueEventListener()
                {
                 //   @Override
                    //public void onDataChange (@NonNull DataSnapshot dataSnapshot)
                    {
                     //   if (dataSnapshot.child(parentsDbname).child(phone).exists())
                     //   {
                            /**Retrieve phone and passswordfrom the user**/
                     //       User userData=dataSnapshot.child(parentsDbname).child(phone).getValue(User.class);
                            /**check the number and password exist in databse**/
                      //      if(userData.getPhone().equals(phone))
                            {
                       //         if(userData.getPassword().equals(password))
                                {
/**if the data ,atch in database then the user is allow to acces the data**/
                                    Toast.makeText(Login_activity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
                                //    loadingBar.dismiss();
                                    Intent i=new Intent(Login_activity.this,HomeActivity.class);
                                    startActivity(i);
                                }
                            }

                        }
             //           else{
                            Toast.makeText(Login_activity.this, "Account with this "+phone+"Number do not exists", Toast.LENGTH_SHORT).show();
                          //  loadingBar.dismiss();
                            Toast.makeText(Login_activity.this, "you need create a new Account", Toast.LENGTH_SHORT).show();
                        }
                    }
                 //   @Override
                  //  public void onCancelled(@NonNull DatabaseError databaseError)
                    {

                    }
               // });


            }


      //  }
        );

    }
}
