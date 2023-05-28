package com.example.majorproject;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

public class CloudCompanies extends AppCompatActivity implements View.OnClickListener{

    ImageView oracle_image,vmware_image,redhat_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cloud_companies);
        oracle_image=(ImageView) findViewById(R.id.oracle);
        oracle_image.setOnClickListener(this);
        redhat_image=(ImageView) findViewById(R.id.redhat);
        redhat_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(oracle_image)){
            String about_company_heading=getResources().getString(R.string.oracle_about_heading);
            String about_company_content=getResources().getString(R.string.oracle_about_content);
            String hiring_details_heading=getResources().getString(R.string.oracle_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.oracle_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
        else if(v.equals(redhat_image)){
            String about_company_heading=getResources().getString(R.string.redhat_about_heading);
            String about_company_content=getResources().getString(R.string.redhat_about_content);
            String hiring_details_heading=getResources().getString(R.string.redhat_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.redhat_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
