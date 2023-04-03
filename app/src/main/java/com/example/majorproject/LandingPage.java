package com.example.majorproject;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity implements View.OnClickListener{

    ImageView mobility_image,ecommerce_image,crm_image,cloud_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        mobility_image=(ImageView) findViewById(R.id.company1);
        mobility_image.setOnClickListener(this);
        ecommerce_image=(ImageView) findViewById(R.id.company2);
        ecommerce_image.setOnClickListener(this);
        crm_image=(ImageView) findViewById(R.id.company3);
        crm_image.setOnClickListener(this);
        cloud_image=(ImageView) findViewById(R.id.company5);
        cloud_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(mobility_image)){
            Intent it=new Intent(this, MobilityCompanies.class);
            startActivity(it);
        }
        else if (v.equals(ecommerce_image)) {
            Intent it=new Intent(this,EcommerceCompanyies.class);
            startActivity(it);
        }
        else if(v.equals(crm_image)){
            Intent it=new Intent(this,CRMCompanies.class);
            startActivity(it);
        }
        else if(v.equals(cloud_image)){
            Intent it=new Intent(this,CloudCompanies.class);
            startActivity(it);
        }
    }
}
