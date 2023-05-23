package com.example.majorproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EcommerceCompanyies extends AppCompatActivity implements View.OnClickListener{

    ImageView walmart_image,flipkart_image,target_image,amazon_image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_commerce_company);
        walmart_image=(ImageView) findViewById(R.id.ecommerce_walmart);
        walmart_image.setOnClickListener(this);
        flipkart_image=(ImageView) findViewById(R.id.ecommerce_flipkart);
        flipkart_image.setOnClickListener(this);
        target_image=(ImageView) findViewById(R.id.ecommerce_target);
        target_image.setOnClickListener(this);
        amazon_image=(ImageView) findViewById(R.id.ecommerce_Amazon);
        amazon_image.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.equals(walmart_image)){
            String about_company_heading=getResources().getString(R.string.walmart_about_heading);
            String about_company_content=getResources().getString(R.string.walmart_about_content);
            String hiring_details_heading=getResources().getString(R.string.walmart_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.walmart_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
        else if(v.equals(flipkart_image)){
            String about_company_heading=getResources().getString(R.string.flipkart_about_heading);
            String about_company_content=getResources().getString(R.string.flipkart_about_content);
            String hiring_details_heading=getResources().getString(R.string.flipkart_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.flipkart_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
        else if(v.equals(target_image)){
            String about_company_heading=getResources().getString(R.string.target_about_heading);
            String about_company_content=getResources().getString(R.string.target_about_content);
            String hiring_details_heading=getResources().getString(R.string.target_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.target_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
