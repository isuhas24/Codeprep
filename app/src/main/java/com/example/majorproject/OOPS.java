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

public class OOPS extends AppCompatActivity {
    Button OOPS_btn1,OOPS_btn2,OOPS_btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oops);


        //finding ids
        OOPS_btn1 = findViewById(R.id.OOPS_btn1);
        OOPS_btn2 = findViewById(R.id.OOPS_btn2);
        OOPS_btn3 = findViewById(R.id.OOPS_btn3);

        //click on
        OOPS_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "C++,OOPS IN C++";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1O9iT2c26Z9DsTMOlVG6zuiXKj--KLgIt/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.oopscpp, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(OOPS.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });

        OOPS_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "JAVA,OOPS IN JAVA";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1IqpQ9FCF4PWGfJrJol2T7JEHSsbjVcKS/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.oopsjava, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(OOPS.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });

        OOPS_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String Headtxt = "OOPS INTERVIEW QA";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1wVCrwd43X5Ia9L82Y1KFsj0XKCxmuZxg/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.oopsqna, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(OOPS.this, ResourcesOnlyActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });
    }
}
