package com.example.majorproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdvertisementCompanies extends AppCompatActivity implements View.OnClickListener{


    ImageView media_dot_net_image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advertisement_companies);
        media_dot_net_image=(ImageView) findViewById(R.id.media_dot_net);
        media_dot_net_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(media_dot_net_image)){
            String about_company_heading=getResources().getString(R.string.media_dot_net_about_heading);
            String about_company_content=getResources().getString(R.string.media_dot_net_about_content);
            String hiring_details_heading=getResources().getString(R.string.media_dot_net_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.media_dot_net_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
