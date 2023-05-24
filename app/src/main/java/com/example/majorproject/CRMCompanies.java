package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CRMCompanies extends AppCompatActivity implements View.OnClickListener{

    ImageView salesforce_image,servicenow_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crm_companies);
        salesforce_image=(ImageView) findViewById(R.id.salesforce);
        salesforce_image.setOnClickListener(this);
        servicenow_image=(ImageView) findViewById(R.id.servicenow);
        servicenow_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(salesforce_image)){
            String about_company_heading=getResources().getString(R.string.salesforce_about_heading);
            String about_company_content=getResources().getString(R.string.salesforce_about_content);
            String hiring_details_heading=getResources().getString(R.string.salesforce_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.salesforce_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
        else if(v.equals(servicenow_image)){
            String about_company_heading=getResources().getString(R.string.servicenow_about_heading);
            String about_company_content=getResources().getString(R.string.servicenow_about_content);
            String hiring_details_heading=getResources().getString(R.string.servicenow_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.servicenow_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
