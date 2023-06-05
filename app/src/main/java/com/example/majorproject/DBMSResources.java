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

public class DBMSResources extends AppCompatActivity {
    Button DBMSResourcesCustomButton1,DBMSResourcesCustomButton2,DBMSResourcesCustomButton3,DBMSResourcesCustomButton4,DBMSResourcesCustomButton5,DBMSResourcesCustomButton6,DBMSResourcesCustomButton7,DBMSResourcesCustomButton8;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dbms_resources);

        DBMSResourcesCustomButton1=findViewById(R.id.DBMSResourcesCustomButton1);
        DBMSResourcesCustomButton2=findViewById(R.id.DBMSResourcesCustomButton2);
        DBMSResourcesCustomButton3=findViewById(R.id.DBMSResourcesCustomButton3);
        DBMSResourcesCustomButton4=findViewById(R.id.DBMSResourcesCustomButton4);
        DBMSResourcesCustomButton5=findViewById(R.id.DBMSResourcesCustomButton5);
        DBMSResourcesCustomButton6=findViewById(R.id.DBMSResourcesCustomButton6);
        DBMSResourcesCustomButton7=findViewById(R.id.DBMSResourcesCustomButton7);
        DBMSResourcesCustomButton8=findViewById(R.id.DBMSResourcesCustomButton8);


        DBMSResourcesCustomButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "T7AxM7Vqvaw";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO DBMS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1DGPgcFKc_F80v_LOx3TeUSmN4NbiR6tB/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms1, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        DBMSResourcesCustomButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "gbVev8RuZLg";
                Resources res = getResources();
                String Headtxt = "ER TO RELATIONAL MODEL";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1Et6bLlvZPdSG_wj4j20w2VSqjAOxEKAf/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms2, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        DBMSResourcesCustomButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "pDX4NR4eY3A";
                Resources res = getResources();
                String Headtxt = "SCHEMA CREATION";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1oJ2SpLh82knepXWV8z_pgq8emWzhguKt/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms3, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        DBMSResourcesCustomButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "xigiyPYIENc";
                Resources res = getResources();
                String Headtxt = "RELATIONAL CONSTRAINTS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1rxavbG5zzn53COwgU164sN46kA5Kh3yU/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms4, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        DBMSResourcesCustomButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "goMsplCB730";
                Resources res = getResources();
                String Headtxt = "PATTERN MATCHING";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1pw0gGWW9GvDSeJdtTr5duHC3gY-e9-JN/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms5, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        DBMSResourcesCustomButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "4YilEjkNPrQ";
                Resources res = getResources();
                String Headtxt = "RELATIONAL ALGEBRA";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1hqCIhXCY_1PuSWgfzhFamW_dY6YaPUQr/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms6, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });

        DBMSResourcesCustomButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "5GDTIUVlHB8";
                Resources res = getResources();
                String Headtxt = "NORMALISATION";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1hyR7FkiMxaes1gMhzoVr-TobklcjYK65/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms7, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });

        DBMSResourcesCustomButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "t5hsV9lC1rU";
                Resources res = getResources();
                String Headtxt = "TRANSACTION";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/19QkGYyfmL-CYdaBDplRQnH1i_V9nIV6e/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dbms8, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DBMSResources.this, VideoPlayerActivity.class);
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
