package com.example.majorproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CPPProgramming extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpp_programming);
        b1=(Button)findViewById(R.id.cpp_b1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.cpp_b2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.cpp_b3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.cpp_b4);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.cpp_b5);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.cpp_b6);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.cpp_b7);
        b7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}
