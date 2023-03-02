package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity implements View.OnClickListener{

    ImageView mobility_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        mobility_image=(ImageView) findViewById(R.id.company1);
        mobility_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent it=new Intent(this, MobilityCompanies.class);
        startActivity(it);
    }
}
