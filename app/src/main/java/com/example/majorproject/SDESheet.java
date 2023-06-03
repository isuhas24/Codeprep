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

public class SDESheet extends AppCompatActivity {

    Button SDE_btn1,SDE_btn2,SDE_btn3,SDE_btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sde_sheet);

        //finding ids
        SDE_btn1=findViewById(R.id.SDE_btn1);
        SDE_btn2=findViewById(R.id.SDE_btn2);
        SDE_btn3=findViewById(R.id.SDE_btn3);
        SDE_btn4=findViewById(R.id.SDE_btn4);

        //on click listeners

        SDE_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "9jo51nJrO0k";
                Resources res = getResources();
                String Headtxt = "STRIVER SDE SHEET DAY-1";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1ZLfFo281Cm43P9epxzbCCP4HLiOxkh_n/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sdesheet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SDESheet.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });

        SDE_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "9jo51nJrO0k";
                Resources res = getResources();
                String Headtxt = "STRIVER SDE SHEET DAY-2";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1ZLfFo281Cm43P9epxzbCCP4HLiOxkh_n/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sdesheet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SDESheet.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });

        SDE_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "9jo51nJrO0k";
                Resources res = getResources();
                String Headtxt = "STRIVER SDE SHEET DAY-3";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1ZLfFo281Cm43P9epxzbCCP4HLiOxkh_n/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sdesheet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SDESheet.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });
        SDE_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "9jo51nJrO0k";
                Resources res = getResources();
                String Headtxt = "STRIVER SDE SHEET DAY-4";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1ZLfFo281Cm43P9epxzbCCP4HLiOxkh_n/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sdesheet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(SDESheet.this, VideoPlayerActivity.class);
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
