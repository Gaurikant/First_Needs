package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;




public class start extends AppCompatActivity {
private static int SPLASH_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              Intent i = new Intent(start.this,Register.class);
              startActivity(i);
              finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
