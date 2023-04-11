package com.example.majorproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SQLResources extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sql_resources);
        btn1=(Button) findViewById(R.id.SQLResourcesCustomButton1);
        btn1.setOnClickListener(this);
        btn2=(Button) findViewById(R.id.SQLResourcesCustomButton2);
        btn2.setOnClickListener(this);
        btn3=(Button) findViewById(R.id.SQLResourcesCustomButton3);
        btn3.setOnClickListener(this);
        btn4=(Button) findViewById(R.id.SQLResourcesCustomButton4);
        btn4.setOnClickListener(this);
        btn5=(Button) findViewById(R.id.SQLResourcesCustomButton5);
        btn5.setOnClickListener(this);
        btn6=(Button) findViewById(R.id.SQLResourcesCustomButton6);
        btn6.setOnClickListener(this);
        btn7=(Button) findViewById(R.id.SQLResourcesCustomButton7);
        btn7.setOnClickListener(this);
        btn8=(Button) findViewById(R.id.SQLResourcesCustomButton8);
        btn8.setOnClickListener(this);
        btn9=(Button) findViewById(R.id.SQLResourcesCustomButton9);
        btn9.setOnClickListener(this);
        btn10=(Button) findViewById(R.id.SQLResourcesCustomButton10);
        btn10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(btn1)){

        }
    }
}
