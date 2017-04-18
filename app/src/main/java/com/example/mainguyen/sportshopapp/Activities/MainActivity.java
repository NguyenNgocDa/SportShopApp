package com.example.mainguyen.sportshopapp.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mainguyen.sportshopapp.R;

public class MainActivity extends AppCompatActivity {
    EditText edEmail;
    EditText edPass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edEmail = (EditText) findViewById(R.id.tv_inputEmai);
        edPass = (EditText) findViewById(R.id.tv_inputPassword);


        Button btnlogin= (Button) findViewById(R.id.btn_login);

        Button btncancel = (Button) findViewById(R.id.btn_cancel);
        btnlogin.setOnClickListener(new View.OnClickListener() {

            public  void onClick(View arg0){
                String email = "[a-zA-Z0-9._-]+@[a-z]+.[a-z]+";
                if(edEmail.getText().toString().length() == 0){
                    edEmail.setError("Email not entered!");
                    edEmail.requestFocus();
                }
                else if (!edEmail.getText().toString().contains("@") || !edEmail.getText().toString().contains(".")){
                    edEmail.setError("Please check your email! ");
                    edEmail.requestFocus();
                }
                else if(!edEmail.getText().toString().matches(email)){
                    edEmail.setError("Email don't exist Special charactors");
                    edEmail.requestFocus();
                }
                else if(edPass.getText().toString().length() == 0){
                    edPass.setError("Password not entered!");
                    edPass.requestFocus();
                }
                else if(edPass.getText().toString().length() < 8  ){
                    edPass.setError("Password should be atleast of 8 charactors!");

                    edPass.requestFocus();
                }
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        }
//    @Override
//    protected void onCreate( Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_management);



//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                Intent nextScreen = new Intent(getApplicationContext(), UserActivity.class);
//
//                nextScreen.putExtra("email", InputEmail.getText().toString());
//                nextScreen.putExtra("password", InputPass.getText().toString());
//
//                Log.e("n", InputEmail.getText() + "." + InputPass.getText());
//
//                startActivity(nextScreen);
//
//            }
//        });


    }

