package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProgrammingLanguages extends AppCompatActivity implements View.OnClickListener {

    Button c_button,cpp_button,java_button,python_button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programming_languages);
        c_button=(Button) findViewById(R.id.ProgrammingLanguageCustomButton1);
        c_button.setOnClickListener(this);
        cpp_button=(Button) findViewById(R.id.ProgrammingLanguageCustomButton2);
        cpp_button.setOnClickListener(this);
        java_button=(Button) findViewById(R.id.ProgrammingLanguageCustomButton3);
        java_button.setOnClickListener(this);
        python_button=(Button) findViewById(R.id.ProgrammingLanguageCustomButton4);
        python_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(c_button)){
            Intent it=new Intent(this,CProgramming.class);
            startActivity(it);
        }
        else if(v.equals(cpp_button)){
            Intent it=new Intent(this,CPPProgramming.class);
            startActivity(it);
        }
        else if(v.equals(java_button)){
            Intent it=new Intent(this,JavaProgramming.class);
            startActivity(it);
        }
        else if(v.equals(python_button)){
            Intent it=new Intent(this,PythonProgramming.class);
            startActivity(it);
        }
    }

}
