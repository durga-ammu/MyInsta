package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity {

    Button newaccountbutton;
    Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_);
        newaccountbutton = findViewById(R.id.newaccountbutton);
        newaccountbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("BUTTON 1 PRESSED", String.valueOf(newaccountbutton));
            }
        });


        loginbutton=findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("BUTTON 2 PRESSED", String.valueOf(loginbutton));

                Intent newActivity = new Intent(IndexActivity.this,LoginActivity.class);
                startActivity(newActivity);

           }
        });


            }
         }


