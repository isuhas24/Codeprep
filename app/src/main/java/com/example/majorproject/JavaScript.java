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

public class JavaScript extends AppCompatActivity {
    Button Javascript_btn1b,Javascript_btn2b,Javascript_btn3b,Javascript_btn4b,Javascript_btn5b,Javascript_btn6b,Javascript_btn7b,Javascript_btn8b,Javascript_btn9b,Javascript_btn10b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javascript);

        //finding buttons
        Javascript_btn1b= findViewById(R.id.Javascript_btn1);
        Javascript_btn2b= findViewById(R.id.Javascript_btn2);
        Javascript_btn3b= findViewById(R.id.Javascript_btn3);
        Javascript_btn4b= findViewById(R.id.Javascript_btn4);
        Javascript_btn5b= findViewById(R.id.Javascript_btn5);
        Javascript_btn6b= findViewById(R.id.Javascript_btn6);
        Javascript_btn7b= findViewById(R.id.Javascript_btn7);
        Javascript_btn8b= findViewById(R.id.Javascript_btn8);
        Javascript_btn9b= findViewById(R.id.Javascript_btn9);
        Javascript_btn10b= findViewById(R.id.Javascript_btn10);


        //On click listeners


        Javascript_btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "B7wHpNUUT4Y";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO JAVASCRIPT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1_QyNUnrNm8TjznFkR4yV9G7cKsxblafn/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsintro, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Javascript_btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "4A2LiUMYyvQ";
                Resources res = getResources();
                String Headtxt = "OBJECTS,PROPERTIES AND METHODS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1qxHhqXlrOwBurkxU-TPePFli2NgQqa9b/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsobject, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });

        Javascript_btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "pdqXYAe1kKA";
                Resources res = getResources();
                String Headtxt = "ALERTS,PROMPTS AND CONFIRM";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/18y2hYIqbgqFohJyNQr9hH6yhG9UJn7y5/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsalert, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });

        Javascript_btn4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "s5Lu4QTjeL0";
                Resources res = getResources();
                String Headtxt = "CONDITIONAL";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/11bUqXCMy-ZbSnU5pS-zBZaqrPsJ9YLJZ/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jscondit, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Javascript_btn5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "a_Bz5ciBHQ0";
                Resources res = getResources();
                String Headtxt = "ARRAYS IN JAVASCRIPT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1kNYaf5pXTu5qyjb5YtvFudT7jrf7hTW9/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsarray, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Javascript_btn6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "akl2siu7iDM";
                Resources res = getResources();
                String Headtxt = "EVENT HANDLING";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1r3LpRQ-rgGflayXIVkvTO8VDnYsQevw2/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsevent, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Javascript_btn7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "ImFeTcWCsR0";
                Resources res = getResources();
                String Headtxt = "WORKING WITH BROWSER WINDOWS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/17LWeHGLPAwBwkj7RN2PfPQ7jgE4EFDqb/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsbrowser, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });



        Javascript_btn8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "tkMZ5n8EObk";
                Resources res = getResources();
                String Headtxt = "WORKING WITH MULTIPLE WINDOWS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1Vd8zmtwtbYvxSTqtFVrPTjJ_Oxf6qqp1/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jswindows, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Javascript_btn9b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "JwOROnOmuNQ";
                Resources res = getResources();
                String Headtxt = "JAVASCRIPT AND MATHS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/15OgdZQD10v77heK6CIvc8YXRLqJ2F2PO/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsmaths, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Javascript_btn10b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "CnozSz4wbBQ";
                Resources res = getResources();
                String Headtxt = "WORKING WITH DATES";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/16Styx5mbe2D5j6veNJnUnYiEDu6YG5Id/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jsdates, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(JavaScript.this, VideoPlayerActivity.class);
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
