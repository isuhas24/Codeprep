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


        // NOTE
        // : NEED TO SET THE RESOURCES AND THUMBNAILS

        Javascript_btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "B7wHpNUUT4Y";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO JAVASCRIPT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sRs5yuZzYUAfdjj3kCJCRua2X0ZenKGi/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.osshort, options);
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
