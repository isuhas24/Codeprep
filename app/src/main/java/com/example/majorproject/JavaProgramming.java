package com.example.majorproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JavaProgramming extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programming);
        b1=(Button)findViewById(R.id.java_b1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.java_b2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.java_b3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.java_b4);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.java_b5);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.java_b6);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.java_b7);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.java_b8);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.java_b9);
        b9.setOnClickListener(this);
        b10=(Button)findViewById(R.id.java_b10);
        b10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
