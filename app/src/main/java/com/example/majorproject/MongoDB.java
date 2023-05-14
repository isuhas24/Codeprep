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

public class MongoDB extends AppCompatActivity {
    Button Mongodb_btn1b,Mongodb_btn2b,Mongodb_btn3b,Mongodb_btn4b,Mongodb_btn5b,Mongodb_btn6b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mongodb);


        //finding id
        Mongodb_btn1b=findViewById(R.id.Mongodb_btn1);
        Mongodb_btn2b=findViewById(R.id.Mongodb_btn2);
        Mongodb_btn3b=findViewById(R.id.Mongodb_btn3);
        Mongodb_btn4b=findViewById(R.id.Mongodb_btn4);
        Mongodb_btn5b=findViewById(R.id.Mongodb_btn5);
        Mongodb_btn6b=findViewById(R.id.Mongodb_btn6);

        //click listener
        Mongodb_btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "SnqPyqRh4r4";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO MONGODB";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1dDtVSha8Da4PJDlH2XbgdinzmoGAgoun/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mngintro, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(MongoDB.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        Mongodb_btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "oSIv-E60NiU";
                Resources res = getResources();
                String Headtxt = "MONGODB DATABASE MANAGEMENT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/18onuDvd2d8rgyYtR0EqH0Ms03SkYfdbV/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mngdatabase, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(MongoDB.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });




        Mongodb_btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "X3GYBQj_ruI";
                Resources res = getResources();
                String Headtxt = "RDBMS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1UpCJkcZPoDfRqKVyljq5kRmzd2XxVi8y/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mngrdbms, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(MongoDB.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });



        Mongodb_btn4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "tpmKglYnE2U";
                Resources res = getResources();
                String Headtxt = "PIPELINE CONCEPT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1RdW3H1UVvdQOQC3MTNWKGOf9UnfvfJyK/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mngpipeline, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(MongoDB.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });



        Mongodb_btn5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "DHDxlwZdwys";
                Resources res = getResources();
                String Headtxt = "MONGODB RELATIONSHIP";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1QJ0t2toC6Ue64vQuppbTFei1K22ubeXp/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mngreletion, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(MongoDB.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        Mongodb_btn6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "rjG5LwbqAp4";
                Resources res = getResources();
                String Headtxt = "REGULAR EXPRESSION";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1OwpMzZoKkpO9t5ZwC2PlqwbefENrHbIk/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mngregular, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(MongoDB.this, VideoPlayerActivity.class);
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
