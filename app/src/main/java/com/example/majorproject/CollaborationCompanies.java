package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CollaborationCompanies extends AppCompatActivity implements View.OnClickListener{

    ImageView atlassian_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collaboration_companies);
        atlassian_image=(ImageView) findViewById(R.id.atlassian);
        atlassian_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(atlassian_image)){
            String about_company_heading=getResources().getString(R.string.atlassian_about_heading);
            String about_company_content=getResources().getString(R.string.atlassian_about_content);
            String hiring_details_heading=getResources().getString(R.string.atlassian_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.atlassian_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
