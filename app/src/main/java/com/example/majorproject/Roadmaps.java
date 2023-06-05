package com.example.majorproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Roadmaps extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;
    @Override
    public void onCreate(Bundle b) {

        super.onCreate(b);
        setContentView(R.layout.activity_roadmap);
        b1=(Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b2=(Button) findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b3=(Button) findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void onClick(View view) {

    }
}
