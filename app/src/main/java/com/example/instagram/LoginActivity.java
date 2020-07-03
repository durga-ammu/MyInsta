package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtusername;
    EditText edtpassword;
    Button buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlogin=findViewById(R.id.button);
        edtusername=findViewById(R.id.username);
        edtpassword=findViewById(R.id.Password);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtusername.getText().toString();
                String password =edtpassword.getText().toString();

             if ((username.isEmpty())||(username.length()<6)){
                 Toast.makeText(getApplicationContext(), "UserName should atleast be 6 character long", Toast.LENGTH_SHORT).show();
             }
             else if((password.length()<6)||(password.isEmpty())){
                 Toast.makeText(getApplicationContext(),"Password should atleast be 6 character long",Toast.LENGTH_SHORT).show();
             }
             else
                 Toast.makeText(getApplicationContext(),"ACCOUNT CREATED",Toast.LENGTH_SHORT).show();


            }
        });

    }
}