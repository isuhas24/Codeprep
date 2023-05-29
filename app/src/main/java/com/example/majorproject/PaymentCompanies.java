package com.example.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentCompanies extends AppCompatActivity implements View.OnClickListener {

    ImageView paypal_image,paytm_image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_companies);
        paypal_image=(ImageView) findViewById(R.id.paypal);
        paypal_image.setOnClickListener(this);
        paytm_image=(ImageView) findViewById(R.id.paytm);
        paytm_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(paypal_image)){
            String about_company_heading=getResources().getString(R.string.paypal_about_heading);
            String about_company_content=getResources().getString(R.string.paypal_about_content);
            String hiring_details_heading=getResources().getString(R.string.paypal_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.paypal_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
        else if(v.equals(paytm_image)){
            String about_company_heading=getResources().getString(R.string.paytm_about_heading);
            String about_company_content=getResources().getString(R.string.paytm_about_content);
            String hiring_details_heading=getResources().getString(R.string.paytm_hiring_details_heading);
            String hiring_details_content=getResources().getString(R.string.paytm_hiring_details_content);
            Intent it=new Intent(this,CompanySpecificGeneralLayout.class);
            it.putExtra("about_company_heading",about_company_heading);
            it.putExtra("about_company_content",about_company_content);
            it.putExtra("hiring_details_heading",hiring_details_heading);
            it.putExtra("hiring_details_content",hiring_details_content);
            startActivity(it);
        }
    }
}
