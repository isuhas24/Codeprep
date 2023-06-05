package com.example.majorproject;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class SystemDesign extends AppCompatActivity {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.system_design);
        btn1=(Button) findViewById(R.id.SystemDesignCustomButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "INTRODUCTION AND ROADMAP TO SYSTEM DESIGN";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1n0HkyZUNA4N73rLjD41wZKueRC5DHwlv/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysdysintro, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SystemDesign.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }


        });
        btn2=(Button) findViewById(R.id.SystemDesignCustomButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "SYSTEM DESIGN BASICS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1xo1tjqzLCcFFkAbq5ku4YPSHUNZ5zmET/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysdysbasic, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SystemDesign.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });
        btn3=(Button) findViewById(R.id.SystemDesignCustomButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "ADVANCED CONCEPTS OF SYSTEM DESIGN";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1txk7iWy3HqVcvf9_POBDSa4Mt7ToAQpA/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysdysadvance, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SystemDesign.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });
    }

}
