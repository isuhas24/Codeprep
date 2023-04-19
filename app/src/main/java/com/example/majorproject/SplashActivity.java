package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    protected void onCreate(Bundle b) {

        super.onCreate(b);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it=new Intent(SplashActivity.this,Register.class);
                startActivity(it);
                finish();
            }
        },3000);
    }
}
