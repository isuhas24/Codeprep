package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class first_resume extends AppCompatActivity {
    ImageView Profilepic;
    TextView Aboutme,Skill1,Skill2,Skill3,Award1,Award2,Award3,Intrest1,Intrest2,Intrest3,Intrest4,Intrest5,WorkEXPYear2,WorkEXPYear3;
    TextView FullName,PhoneNo,SmallAddress,EmailAddress,Website,EDUYear1,EDUYear2,EDUYear3,EDUYear1Name,EDUYear2Name,EDUYear3Name;
    TextView EDUYear1StudyIn,EDUYear2StudyIn,EDUYear3StudyIn,WorkEXPYear1,WorkEXPplacmentandcompany1,WorkEXPplacmentandcompany2,WorkEXPplacmentandcompany3;
    TextView WorkEXPwork1a,WorkEXPwork1b,WorkEXPwork2a,WorkEXPwork2b,WorkEXPwork3a,WorkEXPwork3b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_resume);



        //******************************************************************************************\\

        //Finding------Each------Id-----Start->

        Profilepic = findViewById(R.id.Profilepic);
        Aboutme = findViewById(R.id.Aboutme);
        Skill1 = findViewById(R.id.Skill1);
        Skill2 = findViewById(R.id.Skill2);
        Skill3 = findViewById(R.id.Skill3);
        Award1 = findViewById(R.id.Award1);
        Award2 = findViewById(R.id.Award2);
        Award3 = findViewById(R.id.Award3);
        Intrest1 = findViewById(R.id.Intrest1);
        Intrest2 = findViewById(R.id.Intrest2);
        Intrest3 = findViewById(R.id.Intrest3);
        Intrest4 = findViewById(R.id.Intrest4);
        Intrest5 = findViewById(R.id.Intrest5);
        FullName = findViewById(R.id.FullName);
        PhoneNo = findViewById(R.id.PhoneNo);
        SmallAddress = findViewById(R.id.SmallAddress);
        EmailAddress = findViewById(R.id.EmailAddress);
        Website = findViewById(R.id.Website);
        EDUYear1 = findViewById(R.id.EDUYear1);
        EDUYear2 = findViewById(R.id.EDUYear2);
        EDUYear3 = findViewById(R.id.EDUYear3);
        EDUYear1Name = findViewById(R.id.EDUYear1Name);
        EDUYear2Name = findViewById(R.id.EDUYear2Name);
        EDUYear3Name = findViewById(R.id.EDUYear3Name);
        EDUYear1StudyIn = findViewById(R.id.EDUYear1StudyIn);
        EDUYear2StudyIn = findViewById(R.id.EDUYear2StudyIn);
        EDUYear3StudyIn = findViewById(R.id.EDUYear3StudyIn);
        WorkEXPYear1 = findViewById(R.id.WorkEXPYear1);
        WorkEXPYear2 = findViewById(R.id.WorkEXPYear2);
        WorkEXPYear3 = findViewById(R.id.WorkEXPYear3);
        WorkEXPplacmentandcompany1 = findViewById(R.id.WorkEXPplacmentandcompany1);
        WorkEXPplacmentandcompany2 = findViewById(R.id.WorkEXPplacmentandcompany2);
        WorkEXPplacmentandcompany3 = findViewById(R.id.WorkEXPplacmentandcompany3);
        WorkEXPwork1a = findViewById(R.id.WorkEXPwork1a);
        WorkEXPwork1b = findViewById(R.id.WorkEXPwork1b);
        WorkEXPwork2a = findViewById(R.id.WorkEXPwork2a);
        WorkEXPwork2b = findViewById(R.id.WorkEXPwork2b);
        WorkEXPwork3a = findViewById(R.id.WorkEXPwork3a);
        WorkEXPwork3b = findViewById(R.id.WorkEXPwork3b);


        //Finding------Each------Id-----Ends->

        //******************************************************************************************\\

        //Getting Profile Pic

        // Get the image URI from the intent
        String imageUriString = getIntent().getStringExtra("imageUri");
        Uri imageUri = Uri.parse(imageUriString);

        // Set the image URI to the ImageView
        Profilepic.setImageURI(imageUri);




        //Getting all the text

        String sAboutme = getIntent().getStringExtra("sAboutme");
        Aboutme.setText(sAboutme);

        String sSkill1 = getIntent().getStringExtra("sSkill1");
        Skill1.setText(sSkill1);

        String sSkill2 = getIntent().getStringExtra("sSkill2");
        Skill2.setText(sSkill2);

        String sSkill3 = getIntent().getStringExtra("sSkill3");
        Skill3.setText(sSkill3);

        String sAward1 = getIntent().getStringExtra("sAward1");
        Award1.setText(sAward1);

        String sAward2 = getIntent().getStringExtra("sAward2");
        Award2.setText(sAward2);

        String sAward3 = getIntent().getStringExtra("sAward3");
        Award3.setText(sAward3);

        String sIntrest1 = getIntent().getStringExtra("sIntrest1");
        Intrest1.setText(sIntrest1);

        String sIntrest2 = getIntent().getStringExtra("sIntrest2");
        Intrest2.setText(sIntrest2);

        String sIntrest3 = getIntent().getStringExtra("sIntrest3");
        Intrest3.setText(sIntrest3);

        String sIntrest4 = getIntent().getStringExtra("sIntrest4");
        Intrest4.setText(sIntrest4);

        String sIntrest5 = getIntent().getStringExtra("sIntrest5");
        Intrest5.setText(sIntrest5);

        String name = getIntent().getStringExtra("name");
        FullName.setText(name);

        String sPhoneNo = getIntent().getStringExtra("sPhoneNo");
        PhoneNo.setText(sPhoneNo);

        String sSmallAddress = getIntent().getStringExtra("sSmallAddress");
        SmallAddress.setText(sSmallAddress);

        String sEmailAddress = getIntent().getStringExtra("sEmailAddress");
        EmailAddress.setText(sEmailAddress);

        String sWebsite = getIntent().getStringExtra("sWebsite");
        Website.setText(sWebsite);

        String sEDUYear1 = getIntent().getStringExtra("sEDUYear1");
        EDUYear1.setText(sEDUYear1);

        String sEDUYear2 = getIntent().getStringExtra("sEDUYear2");
        EDUYear2.setText(sEDUYear2);

        String sEDUYear3 = getIntent().getStringExtra("sEDUYear3");
        EDUYear3.setText(sEDUYear3);

        String sEDUYear1Name = getIntent().getStringExtra("sEDUYear1Name");
        EDUYear1Name.setText(sEDUYear1Name);

        String sEDUYear2Name = getIntent().getStringExtra("sEDUYear2Name");
        EDUYear2Name.setText(sEDUYear2Name);

        String sEDUYear3Name = getIntent().getStringExtra("sEDUYear3Name");
        EDUYear3Name.setText(sEDUYear3Name);

        String sEDUYear1StudyIn = getIntent().getStringExtra("sEDUYear1StudyIn");
        EDUYear1StudyIn.setText(sEDUYear1StudyIn);

        String sEDUYear2StudyIn = getIntent().getStringExtra("sEDUYear2StudyIn");
        EDUYear2StudyIn.setText(sEDUYear2StudyIn);

        String sEDUYear3StudyIn = getIntent().getStringExtra("sEDUYear3StudyIn");
        EDUYear3StudyIn.setText(sEDUYear3StudyIn);

        String sWorkEXPYear1 = getIntent().getStringExtra("sWorkEXPYear1");
        WorkEXPYear1.setText(sWorkEXPYear1);

        String sWorkEXPYear2 = getIntent().getStringExtra("sWorkEXPYear2");
        WorkEXPYear2.setText(sWorkEXPYear2);

        String sWorkEXPYear3 = getIntent().getStringExtra("sWorkEXPYear3");
        WorkEXPYear3.setText(sWorkEXPYear3);

        String sWorkEXPplacmentandcompany1 = getIntent().getStringExtra("sWorkEXPplacmentandcompany1");
        WorkEXPplacmentandcompany1.setText(sWorkEXPplacmentandcompany1);

        String sWorkEXPplacmentandcompany2 = getIntent().getStringExtra("sWorkEXPplacmentandcompany2");
        WorkEXPplacmentandcompany2.setText(sWorkEXPplacmentandcompany2);

        String sWorkEXPplacmentandcompany3 = getIntent().getStringExtra("sWorkEXPplacmentandcompany3");
        WorkEXPplacmentandcompany3.setText(sWorkEXPplacmentandcompany3);

        String sWorkEXPwork1a = getIntent().getStringExtra("sWorkEXPwork1a");
        WorkEXPwork1a.setText(sWorkEXPwork1a);

        String sWorkEXPwork1b = getIntent().getStringExtra("sWorkEXPwork1b");
        WorkEXPwork1b.setText(sWorkEXPwork1b);

        String sWorkEXPwork2a = getIntent().getStringExtra("sWorkEXPwork2a");
        WorkEXPwork2a.setText(sWorkEXPwork2a);

        String sWorkEXPwork2b = getIntent().getStringExtra("sWorkEXPwork2b");
        WorkEXPwork2b.setText(sWorkEXPwork2b);

        String sWorkEXPwork3a = getIntent().getStringExtra("sWorkEXPwork3a");
        WorkEXPwork3a.setText(sWorkEXPwork3a);

        String sWorkEXPwork3b = getIntent().getStringExtra("sWorkEXPwork3b");
        WorkEXPwork3b.setText(sWorkEXPwork3b);














    }
}