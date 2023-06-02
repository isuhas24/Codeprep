package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class InvestmentCompanies extends AppCompatActivity implements View.OnClickListener{

    ImageView goldman_sachs_image,jpmorgan_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.investment_companies);
        goldman_sachs_image=(ImageView) findViewById(R.id.goldman);
        goldman_sachs_image.setOnClickListener(this);
        jpmorgan_image=(ImageView) findViewById(R.id.jpmorgan);
        jpmorgan_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(goldman_sachs_image)){
            String about_company_heading=getResources().getString(R.string.goldman_sachs_about_heading);
            String about_company_content=getResources().getString(R.string.goldman_sachs_about_content);
            String hiring_details_heading=getResources().getString(R.string.goldman_sachs_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.goldman_sachs_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
        else if(v.equals(jpmorgan_image)){
            String about_company_heading=getResources().getString(R.string.jpmorgan_about_heading);
            String about_company_content=getResources().getString(R.string.jpmorgan_about_content);
            String hiring_details_heading=getResources().getString(R.string.jpmorgan_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.jpmorgan_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
