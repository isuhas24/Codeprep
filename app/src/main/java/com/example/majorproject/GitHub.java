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


public class GitHub extends AppCompatActivity {


    Button GH_btn1,GH_btn2,GH_btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.github);

        //finding ids
        GH_btn1= findViewById(R.id.GH_btn1);
        GH_btn2= findViewById(R.id.GH_btn2);
        GH_btn3= findViewById(R.id.GH_btn3);

        //click listener

        GH_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "qiQR5rTSshw";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO COMPUTER NETWORKS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1Jk2g-sKX0QhWNXHKChqAcrfY6xgXIywX/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.githubbasic, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(GitHub.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });

        GH_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "UWq6s59AP_c";
                Resources res = getResources();
                String Headtxt = "GIT INTERVIEW QA";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1nP_a0gVREBVtqCLh9nwSfMzidCtj9Vd2/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.githubinterview, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(GitHub.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        GH_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "B67X9xtOyuI";
                Resources res = getResources();
                String Headtxt = "GIT CHEATSHEET";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1s0e54aivNbvAojqMb1O2-pJ0q1C9UjxM/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.githubcheatsheet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(GitHub.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



    }
}
