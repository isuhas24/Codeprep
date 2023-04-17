package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WebDevelopment extends AppCompatActivity implements View.OnClickListener {
    Button html_and_css_button,js_button,bootstrap_and_jquery_button,react_button,nodejs_button,mongodb_button;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_development);
        html_and_css_button=(Button) findViewById(R.id.WebDevelopmentCustomButton1);
        html_and_css_button.setOnClickListener(this);
        js_button=(Button) findViewById(R.id.WebDevelopmentCustomButton2);
        js_button.setOnClickListener(this);
        react_button=(Button) findViewById(R.id.WebDevelopmentCustomButton4);
        react_button.setOnClickListener(this);
        nodejs_button=(Button) findViewById(R.id.WebDevelopmentCustomButton5);
        nodejs_button.setOnClickListener(this);
        mongodb_button=(Button) findViewById(R.id.WebDevelopmentCustomButton6);
        mongodb_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(html_and_css_button)){
            Intent it=new Intent(this,HtmlAndCss.class);
            startActivity(it);
        }
        else if(v.equals(js_button)){
            Intent it=new Intent(this,JavaScript.class);
            startActivity(it);
        }
        else if(v.equals(react_button)){
            Intent it=new Intent(this,React.class);
            startActivity(it);
        }
        else if(v.equals(nodejs_button)){
            Intent it=new Intent(this,Nodejs.class);
            startActivity(it);
        }
        else if(v.equals(mongodb_button)){
            Intent it=new Intent(this,MongoDB.class);
            startActivity(it);
        }
    }

}
