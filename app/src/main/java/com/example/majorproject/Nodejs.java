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

public class Nodejs extends AppCompatActivity {
    Button Nodejs_btn1b,Nodejs_btn2b,Nodejs_btn3b,Nodejs_btn4b,Nodejs_btn5b,Nodejs_btn6b,Nodejs_btn7b,Nodejs_btn8b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nodejs);

        //finding id

        Nodejs_btn1b = findViewById(R.id.Nodejs_btn1);
        Nodejs_btn2b = findViewById(R.id.Nodejs_btn2);
        Nodejs_btn3b = findViewById(R.id.Nodejs_btn3);
        Nodejs_btn4b = findViewById(R.id.Nodejs_btn4);
        Nodejs_btn5b = findViewById(R.id.Nodejs_btn5);
        Nodejs_btn6b = findViewById(R.id.Nodejs_btn6);
        Nodejs_btn7b = findViewById(R.id.Nodejs_btn7);
        Nodejs_btn8b = findViewById(R.id.Nodejs_btn8);



        // On click listener

        Nodejs_btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "BLl32FvcdVM";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO NODEJS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1oLL5ikAZb6wYRA2pBX2CtPI3r7qgEhgT/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndintro, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });




        Nodejs_btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "CKoZ6j856kk";
                Resources res = getResources();
                String Headtxt = "COMMAND LINE OPTIONS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/18Fah7M6V5qEtXzcWgfqXKoTTu0-jY4Zc/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndcomand, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Nodejs_btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "pV0emjCmneM";
                Resources res = getResources();
                String Headtxt = "NODEJS DNS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1qvX2oFMHnd4ZmNy--1TzT5JrKzSCPlZN/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.nddns, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Nodejs_btn4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "JjOvDXe8-jQ";
                Resources res = getResources();
                String Headtxt = "NODEJS PROCESS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/19AKSHiq7Z8nMwuHC-xkqd9Jy0TcxEVTt/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndpross, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });




        Nodejs_btn5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "hNzRoZti6vI";
                Resources res = getResources();
                String Headtxt = "FILE SYSTEM";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1Mf8dERT9RSErNYRIsCdxMJTFCFnn-wZt/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndfilesys, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });



        Nodejs_btn6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "mcTNM7x5oOQ";
                Resources res = getResources();
                String Headtxt = "NODEJS ZLIB MODULE";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1vA8_8J5NXXBquOdpRM-18dj-__ZuxxXE/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndzlib, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Nodejs_btn7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "eSh1FZDJEWU";
                Resources res = getResources();
                String Headtxt = "WEB MODULES";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1Bv0bTKeR0PR8AB2q0-0ia_j1lFfYX38R/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndweb, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });



        Nodejs_btn8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "EN6Dx22cPRI";
                Resources res = getResources();
                String Headtxt = "NODEJS AND MYSQL";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/10S3WEjh1dafHil0XXM4ygmGi7CzioQ_d/view?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ndmysql, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(Nodejs.this, VideoPlayerActivity.class);
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
