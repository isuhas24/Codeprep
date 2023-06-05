package com.example.majorproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tips extends AppCompatActivity {
    TextView Linkshowtips1,Linkshowtips2,Linkshowtips3,Linkshowtips4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips);


        Linkshowtips1=findViewById(R.id.Linkshowtips1);
        Linkshowtips2=findViewById(R.id.Linkshowtips2);
        Linkshowtips3=findViewById(R.id.Linkshowtips3);
        Linkshowtips4=findViewById(R.id.Linkshowtips4);



        //Link Show
        String setlink1 = "https://drive.google.com/file/d/1g6aSm_obAJqCxAfbDc-S6fhOywOVc6tG/view?usp=drive_link";
        Linkshowtips1.setText(setlink1);

        String setlink2 = "https://drive.google.com/file/d/1zHZDubwX54DaZekJ53BpoBIEkBGQuV6q/view?usp=drive_link";
        Linkshowtips2.setText(setlink2);

        String setlink3 = "https://drive.google.com/file/d/1AuHbPAyFAIf_2opvYjdmVoJMEmDfm8-m/view?usp=drive_link";
        Linkshowtips3.setText(setlink3);

        String setlink4 = "https://drive.google.com/file/d/18_y8iK2IHVhb3d9xgrUkvwcIVo6Zuyal/view?usp=drive_link";
        Linkshowtips4.setText(setlink4);
        //Link Show End


    }
}
