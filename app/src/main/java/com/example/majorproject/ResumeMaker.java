package com.example.majorproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.content.Intent;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.DrawableContainer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResumeMaker extends AppCompatActivity {
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    private static final int PICK_IMAGE_REQUEST = 1;
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    private Button selectImageButton,SUBMIT;
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    int data;
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    private Uri selectedImageUri;
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    ImageView backbtn;
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    TextView Aboutme,Skill1,Skill2,Skill3,Award1,Award2,Award3,Intrest1,Intrest2,Intrest3,Intrest4,Intrest5,WorkEXPYear2,WorkEXPYear3;
    TextView FullName,PhoneNo,SmallAddress,EmailAddress,Website,EDUYear1,EDUYear2,EDUYear3,EDUYear1Name,EDUYear2Name,EDUYear3Name;
    TextView EDUYear1StudyIn,EDUYear2StudyIn,EDUYear3StudyIn,WorkEXPYear1,WorkEXPplacmentandcompany1,WorkEXPplacmentandcompany2,WorkEXPplacmentandcompany3;
    TextView WorkEXPwork1a,WorkEXPwork1b,WorkEXPwork2a,WorkEXPwork2b,WorkEXPwork3a,WorkEXPwork3b;
    //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_maker);


        //---------------------------------------------------------------------------------------------------------------------------------------------------------\\
        //Back Button Code
        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResumeMaker.this, LandingPage.class);
                startActivity(intent);
            }
        });
        //---------------------------------------------------------------------------------------------------------------------------------------------------------\\


        selectImageButton = findViewById(R.id.select_image_button);
        selectImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the image gallery
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);


            }
        });
        //---------------------------------------------------------------------------------------------------------------------------------------------------------\\

        //******************************************************************************************\\

        //Finding------Each------Id-----Start->

        SUBMIT = findViewById(R.id.SUBMIT);
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




        //******************************************************************************************\\
        //CLICK LISTENERS + Taking All The Information & Showing It to Resume Activity
        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedImageUri != null) {
                    //Getting all the texts into string
                    String sAboutme = Aboutme.getText().toString();
                    String sSkill1 = Skill1.getText().toString();
                    String sSkill2 = Skill2.getText().toString();
                    String sSkill3 = Skill3.getText().toString();
                    String sAward1 = Award1.getText().toString();
                    String sAward2 = Award2.getText().toString();
                    String sAward3 = Award3.getText().toString();
                    String sIntrest1 = Intrest1.getText().toString();
                    String sIntrest2 = Intrest2.getText().toString();
                    String sIntrest3 = Intrest3.getText().toString();
                    String sIntrest4 = Intrest4.getText().toString();
                    String sIntrest5 = Intrest5.getText().toString();
                    String name = FullName.getText().toString();
                    String sPhoneNo = PhoneNo.getText().toString();
                    String sSmallAddress = SmallAddress.getText().toString();
                    String sEmailAddress = EmailAddress.getText().toString();
                    String sWebsite = Website.getText().toString();
                    String sEDUYear1 = EDUYear1.getText().toString();
                    String sEDUYear2 = EDUYear2.getText().toString();
                    String sEDUYear3 = EDUYear3.getText().toString();
                    String sEDUYear1Name = EDUYear1Name.getText().toString();
                    String sEDUYear2Name = EDUYear2Name.getText().toString();
                    String sEDUYear3Name = EDUYear3Name.getText().toString();
                    String sEDUYear1StudyIn = EDUYear1StudyIn.getText().toString();
                    String sEDUYear2StudyIn = EDUYear2StudyIn.getText().toString();
                    String sEDUYear3StudyIn = EDUYear3StudyIn.getText().toString();
                    String sWorkEXPYear1 = WorkEXPYear1.getText().toString();
                    String sWorkEXPYear2 = WorkEXPYear2.getText().toString();
                    String sWorkEXPYear3 = WorkEXPYear3.getText().toString();
                    String sWorkEXPplacmentandcompany1 = WorkEXPplacmentandcompany1.getText().toString();
                    String sWorkEXPplacmentandcompany2 = WorkEXPplacmentandcompany2.getText().toString();
                    String sWorkEXPplacmentandcompany3 = WorkEXPplacmentandcompany3.getText().toString();
                    String sWorkEXPwork1a = WorkEXPwork1a.getText().toString();
                    String sWorkEXPwork1b = WorkEXPwork1b.getText().toString();
                    String sWorkEXPwork2a = WorkEXPwork2a.getText().toString();
                    String sWorkEXPwork2b = WorkEXPwork2b.getText().toString();
                    String sWorkEXPwork3a = WorkEXPwork3a.getText().toString();
                    String sWorkEXPwork3b = WorkEXPwork3b.getText().toString();
                    //****************************************************************************\\
                    // -------------Start the next activity and pass the Data ---------------------
                    //****************************************************************************\\
                    Intent intent = new Intent(ResumeMaker.this, first_resume.class);
                    intent.putExtra("imageUri", selectedImageUri.toString());
                    intent.putExtra("sAboutme", sAboutme);
                    intent.putExtra("sSkill1", sSkill1);
                    intent.putExtra("sSkill2", sSkill2);
                    intent.putExtra("sSkill3", sSkill3);
                    intent.putExtra("sAward1", sAward1);
                    intent.putExtra("sAward2", sAward2);
                    intent.putExtra("sAward3", sAward3);
                    intent.putExtra("sIntrest1", sIntrest1);
                    intent.putExtra("sIntrest2", sIntrest2);
                    intent.putExtra("sIntrest3", sIntrest3);
                    intent.putExtra("sIntrest4", sIntrest4);
                    intent.putExtra("sIntrest5", sIntrest5);
                    intent.putExtra("name", name);
                    intent.putExtra("sPhoneNo", sPhoneNo);
                    intent.putExtra("sSmallAddress", sSmallAddress);
                    intent.putExtra("sEmailAddress", sEmailAddress);
                    intent.putExtra("sWebsite", sWebsite);
                    intent.putExtra("sEDUYear1", sEDUYear1);
                    intent.putExtra("sEDUYear2", sEDUYear2);
                    intent.putExtra("sEDUYear3", sEDUYear3);
                    intent.putExtra("sEDUYear1Name", sEDUYear1Name);
                    intent.putExtra("sEDUYear2Name", sEDUYear2Name);
                    intent.putExtra("sEDUYear3Name", sEDUYear3Name);
                    intent.putExtra("sEDUYear1StudyIn", sEDUYear1StudyIn);
                    intent.putExtra("sEDUYear2StudyIn", sEDUYear2StudyIn);
                    intent.putExtra("sEDUYear3StudyIn", sEDUYear3StudyIn);
                    intent.putExtra("sWorkEXPYear1", sWorkEXPYear1);
                    intent.putExtra("sWorkEXPYear2", sWorkEXPYear2);
                    intent.putExtra("sWorkEXPYear3", sWorkEXPYear3);
                    intent.putExtra("sWorkEXPplacmentandcompany1", sWorkEXPplacmentandcompany1);
                    intent.putExtra("sWorkEXPplacmentandcompany2", sWorkEXPplacmentandcompany2);
                    intent.putExtra("sWorkEXPplacmentandcompany3", sWorkEXPplacmentandcompany3);
                    intent.putExtra("sWorkEXPwork1a", sWorkEXPwork1a);
                    intent.putExtra("sWorkEXPwork1b", sWorkEXPwork1b);
                    intent.putExtra("sWorkEXPwork2a", sWorkEXPwork2a);
                    intent.putExtra("sWorkEXPwork2b", sWorkEXPwork2b);
                    intent.putExtra("sWorkEXPwork3a", sWorkEXPwork3a);
                    intent.putExtra("sWorkEXPwork3b", sWorkEXPwork3b);
                    startActivity(intent);
                }
            }
        });
        //CLICK LISTENERS + Taking All The Information & Showing It to Resume Activity-END---------
        //******************************************************************************************\\
    }


    //******************************************************************************************\\
    //Image Picker And Store It Inside a Button-
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            // Get the selected image URI
            selectedImageUri = data.getData();
        }
    }
    //Image Picker And Store It Inside a Button-Ends
    //******************************************************************************************\\

}