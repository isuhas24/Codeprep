package com.example.majorproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Roadmaps extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4;
    @Override
    public void onCreate(Bundle b) {

        super.onCreate(b);
        setContentView(R.layout.activity_roadmap);
        b1=(Button) findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.btn4);
        b4.setOnClickListener(this);
    }
    public void onClick(View view) {

    }
}
