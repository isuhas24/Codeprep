package com.example.majorproject;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity implements View.OnClickListener{

    ImageView mobility_image,ecommerce_image,crm_image,cloud_image,collaboration_image,communication_image,advertisement_image,payment_image,trading_image,investment_image,gaming_image,entertainment_image;
    Button system_design_button,programming_languages_button,dsa_button,oops_button,dbms_button,os_button,se_button,cn_button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        //Images
        mobility_image=(ImageView) findViewById(R.id.company1);
        mobility_image.setOnClickListener(this);
        ecommerce_image=(ImageView) findViewById(R.id.company2);
        ecommerce_image.setOnClickListener(this);
        crm_image=(ImageView) findViewById(R.id.company3);
        crm_image.setOnClickListener(this);
        cloud_image=(ImageView) findViewById(R.id.company5);
        cloud_image.setOnClickListener(this);
        collaboration_image=(ImageView) findViewById(R.id.company4);
        collaboration_image.setOnClickListener(this);
        communication_image=(ImageView) findViewById(R.id.company6);
        communication_image.setOnClickListener(this);
        advertisement_image=(ImageView) findViewById(R.id.company7);
        advertisement_image.setOnClickListener(this);
        payment_image=(ImageView) findViewById(R.id.company8);
        payment_image.setOnClickListener(this);
        trading_image=(ImageView) findViewById(R.id.company9);
        trading_image.setOnClickListener(this);
        investment_image=(ImageView) findViewById(R.id.company10);
        investment_image.setOnClickListener(this);
        gaming_image=(ImageView) findViewById(R.id.company11);
        gaming_image.setOnClickListener(this);
        entertainment_image=(ImageView) findViewById(R.id.company12);
        entertainment_image.setOnClickListener(this);

        //Buttons
        system_design_button=(Button) findViewById(R.id.customButton1);
        system_design_button.setOnClickListener(this);
        programming_languages_button=(Button) findViewById(R.id.customButton2);
        programming_languages_button.setOnClickListener(this);
        dsa_button=(Button) findViewById(R.id.customButton3);
        dsa_button.setOnClickListener(this);
        oops_button=(Button) findViewById(R.id.customButton4);
        oops_button.setOnClickListener(this);
        dbms_button=(Button) findViewById(R.id.customButton5);
        dbms_button.setOnClickListener(this);
        os_button=(Button) findViewById(R.id.customButton6);
        os_button.setOnClickListener(this);
        se_button=(Button) findViewById(R.id.customButton7);
        se_button.setOnClickListener(this);
        cn_button=(Button) findViewById(R.id.customButton8);
        cn_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        //Images if-else block
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
        else if(v.equals(collaboration_image)){
            Intent it=new Intent(this,CollaborationCompanies.class);
            startActivity(it);
        }
        else if(v.equals(communication_image)){
            Intent it=new Intent(this,CommunicationCompanies.class);
            startActivity(it);
        }
        else if(v.equals(advertisement_image)){
            Intent it=new Intent(this,AdvertisementCompanies.class);
            startActivity(it);
        }
        else if(v.equals(payment_image)){
            Intent it=new Intent(this,PaymentCompanies.class);
            startActivity(it);
        }
        else if(v.equals(trading_image)){
            Intent it=new Intent(this,TradingCompanies.class);
            startActivity(it);
        }
        else if(v.equals(investment_image)){
            Intent it=new Intent(this,InvestmentCompanies.class);
            startActivity(it);
        }
        else if(v.equals(gaming_image)){
            Intent it=new Intent(this,GamingCompanies.class);
            startActivity(it);
        }
        else if(v.equals(entertainment_image)){
            Intent it=new Intent(this,EntertainmentCompanies.class);
            startActivity(it);
        }

        //Buttons if-else block
        if(v.equals(system_design_button)){
            Intent it=new Intent(this,SystemDesign.class);
            startActivity(it);
        }
        else if(v.equals(programming_languages_button)){
            Intent it=new Intent(this,ProgrammingLanguages.class);
            startActivity(it);
        }
        else if(v.equals(dsa_button)){
            Intent it=new Intent(this,DSA.class);
            startActivity(it);
        }
        else if(v.equals(oops_button)){
            Intent it=new Intent(this,OOPS.class);
            startActivity(it);
        }
        else if(v.equals(dbms_button)){
            Intent it=new Intent(this,DBMS.class);
            startActivity(it);
        }
        else if(v.equals(os_button)){
            Intent it=new Intent(this,OperatingSystem.class);
            startActivity(it);
        }
        else if(v.equals(se_button)){
            Intent it=new Intent(this,SoftwareEngineering.class);
            startActivity(it);
        }
        else if(v.equals(cn_button)){
            Intent it=new Intent(this,ComputerNetworks.class);
            startActivity(it);
        }
    }
}
