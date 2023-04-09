package com.example.majorproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SystemDesign extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.system_design);
        btn1=(Button) findViewById(R.id.SystemDesignCustomButton1);
        btn1.setOnClickListener(this);
        btn2=(Button) findViewById(R.id.SystemDesignCustomButton2);
        btn2.setOnClickListener(this);
        btn3=(Button) findViewById(R.id.SystemDesignCustomButton3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(btn1)){

        }
        else if(v.equals(btn2)){

        }
        else if(v.equals(btn3)){

        }
    }
}
