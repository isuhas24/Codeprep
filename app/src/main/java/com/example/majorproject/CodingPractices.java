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

public class CodingPractices extends AppCompatActivity {
    Button Coding_practices_btn1,Coding_practices_btn2,Coding_practices_btn3,Coding_practices_btn4,Coding_practices_btn5,Coding_practices_btn6,Coding_practices_btn7,Coding_practices_btn8,Coding_practices_btn9,Coding_practices_btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding_practices);


        Coding_practices_btn1=findViewById(R.id.Coding_practices_btn1);
        Coding_practices_btn2=findViewById(R.id.Coding_practices_btn2);
        Coding_practices_btn3=findViewById(R.id.Coding_practices_btn3);
        Coding_practices_btn4=findViewById(R.id.Coding_practices_btn4);
        Coding_practices_btn5=findViewById(R.id.Coding_practices_btn5);
        Coding_practices_btn6=findViewById(R.id.Coding_practices_btn6);
        Coding_practices_btn7=findViewById(R.id.Coding_practices_btn7);
        Coding_practices_btn8=findViewById(R.id.Coding_practices_btn8);
        Coding_practices_btn9=findViewById(R.id.Coding_practices_btn9);
        Coding_practices_btn10=findViewById(R.id.Coding_practices_btn10);


        Coding_practices_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "SLIDING WINDOW AND MATRIX TRAVERSAL";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/17Q0so2DDFHm2nIkQ2y98RvxzI228WraQ/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp1, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "TWO POINTERS AND FAST AND SLOW POINTERS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1-9mssg9eNuzbV606xtY6_F4oFvNAOb71/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp2, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });



        Coding_practices_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "MERGE SORT AND CYCLIC SORT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1iSEzQ-G8gcE9VG7NEmT-s4HtESgFIGC_/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp3, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "REVERSAL OF LINKED LIST AND BFS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1d2Q2-ddcKiagtnvmSfzNGqOSXavBCpN-/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp4, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "DFS AND TWO HEAPS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/18noCn70ECEM2hkjN41iT56RNnSTyBJ1r/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp5, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "SUBSETS AND BINARY SEARCH";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1tPWo6VRZuTauB0yFvg03uMBMrIpoK_05/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp6, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });

        Coding_practices_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "BITWISE XOR AND TOP K ELEMENTS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1uVS-3dfGTLbBs5VIPL4CNexe16fo8TNt/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp7, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "K-WAY MERGE AND TOPOLOGICAL SORT";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1hzJe4Q2eMTOULH0zDaVgBvRLtR-a8CeP/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp8, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "0-1 KNAPSACK AND FIBINOCCI NUMBERS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1k9z0vVboDL0MJWmgvj47dTYCB678p88i/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp9, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });


        Coding_practices_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "PALINDROMIC SUBSEQUENCES AND LONGEST COMMON SUBSTRING";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1jMnu27OvOmyyV9KSNwVbhyKP8ZT8Wkb7/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cp10, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(CodingPractices.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });



    }
}
