package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DBMS extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dbms);
        btn1=(Button) findViewById(R.id.DBMSCustomButton1);
        btn1.setOnClickListener(this);
        btn2=(Button) findViewById(R.id.DBMSCustomButton2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(btn1)){
            Intent it=new Intent(this,DBMSResources.class);
            startActivity(it);
        }
        else if(v.equals(btn2)){
            Intent it=new Intent(this,SQLResources.class);
            startActivity(it);
        }
    }
}
