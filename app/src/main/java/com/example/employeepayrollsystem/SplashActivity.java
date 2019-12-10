package com.example.employeepayrollsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler=new Handler();



        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent= new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(mIntent);
                finish();
            }

        },4000);
    }
}
