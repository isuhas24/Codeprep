package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity implements View.OnClickListener{

    ImageView mobility_image,ecommerce_image,collaboration_companies;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        mobility_image=(ImageView) findViewById(R.id.company1);
        mobility_image.setOnClickListener(this);
        ecommerce_image=(ImageView) findViewById(R.id.company2);
        ecommerce_image.setOnClickListener(this);
        collaboration_companies=(ImageView)findViewById(R.id.company4);
        collaboration_companies.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(mobility_image)){
            Intent it=new Intent(this, MobilityCompanies.class);
            startActivity(it);
        } else if (v.equals(ecommerce_image)) {
            Intent it=new Intent(this,EcommerceCompanyies.class);
            startActivity(it);
        }
        else if (v.equals(collaboration_companies)){
            Intent it =new Intent(this,CollaborationCompanies.class);
            startActivity(it);
        }
    }
}
