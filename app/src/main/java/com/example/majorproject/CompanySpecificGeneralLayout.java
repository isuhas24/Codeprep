package com.example.majorproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CompanySpecificGeneralLayout extends AppCompatActivity {

    TextView about_company_heading,about_company_content,hiring_details_heading,hiring_details_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_specific_general_layout);
        about_company_heading=(TextView) findViewById(R.id.about_company_heading);
        about_company_content=(TextView) findViewById(R.id.about_company_content);
        hiring_details_heading=(TextView) findViewById(R.id.hiring_details_heading);
        hiring_details_content=(TextView) findViewById(R.id.hiring_details_content);

        String heading1=getIntent().getStringExtra("about_company_heading");
        String content1=getIntent().getStringExtra("about_company_content");
        String heading2=getIntent().getStringExtra("hiring_details_heading");
        String content2=getIntent().getStringExtra("hiring_details_content");

        about_company_heading.setText(heading1);
        about_company_content.setText(content1);
        hiring_details_heading.setText(heading2);
        hiring_details_content.setText(content2);
    }
}
