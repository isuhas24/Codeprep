package com.example.majorproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Questions extends AppCompatActivity {
    TextView Linkshowqtsn1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        Linkshowqtsn1=findViewById(R.id.Linkshowqtsn1);

        //Link Show
        String setlink1 = "https://drive.google.com/file/d/1g6aSm_obAJqCxAfbDc-S6fhOywOVc6tG/view?usp=drive_link";
        Linkshowqtsn1.setText(setlink1);
    }
}
