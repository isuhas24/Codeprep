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

public class ComputerNetworks extends AppCompatActivity {
    Button CN_btn1b,CN_btn2b,CN_btn3b,CN_btn4b,CN_btn5b,CN_btn6b,CN_btn7b,CN_btn8b,CN_btn9b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.computer_networks);

        //finding id

        CN_btn1b=findViewById(R.id.CN_btn1);
        CN_btn2b=findViewById(R.id.CN_btn2);
        CN_btn3b=findViewById(R.id.CN_btn3);
        CN_btn4b=findViewById(R.id.CN_btn4);
        CN_btn5b=findViewById(R.id.CN_btn5);
        CN_btn6b=findViewById(R.id.CN_btn6);
        CN_btn7b=findViewById(R.id.CN_btn7);
        CN_btn8b=findViewById(R.id.CN_btn8);
        CN_btn9b=findViewById(R.id.CN_btn9);



        //click listener

        CN_btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "qiQR5rTSshw";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO COMPUTER NETWORKS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1Dn8qHR4DTLjjm5qQs08WJlZIrrCmxR8u/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cnintro, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        CN_btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "1msEo8PIcbw";
                Resources res = getResources();
                String Headtxt = "SUBNET AND OSI MODEL";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1AvswSTEVmXR8pg8BgGjWd5T47y6pFvt5/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cssubnet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        CN_btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "QFjAY6yzMgo";
                Resources res = getResources();
                String Headtxt = "DATA SHARING";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1M9OWKANEgiUiEqpHHXJfAu8m3ujs7Arf/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cndatashare, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



        CN_btn4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "n0iaPtsnmxQ";
                Resources res = getResources();
                String Headtxt = "LAN TECHNOLOGY";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1eo2t5AmrlN0zUm66J6W-7YRP4dLsTmqk/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cnlan, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



        CN_btn5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "dQQA3-jdBCE";
                Resources res = getResources();
                String Headtxt = "ETHERNET";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1LI_982KbDW37BjKuPXzyO5U_PWsCbium/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cnethernet, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



        CN_btn6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "-u4Dzu63eZc";
                Resources res = getResources();
                String Headtxt = "TOKEN RING";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1tyH_d2sjUuNIL0swoE0ZRRBN2vJlQnW_/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cntoken, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



        CN_btn7b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "vTzrn_M77mo";
                Resources res = getResources();
                String Headtxt = "NUMERICALS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1tDzNFeMidk71ojwLK5n8PsK2JbIC_dn4/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cnnumr, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        CN_btn8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "OFkiaIjTXW8";
                Resources res = getResources();
                String Headtxt = "UDP AND PROTOCOLS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1fG5hukBZ_I5vY912tHc1xDSibI7tjSLK/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cnudo, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



        CN_btn9b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "GfaHdjApnhU";
                Resources res = getResources();
                String Headtxt = "TCP AND PROBLEMS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1IZFf9YdPsCLl9nU9apNRnn9jFwLYDgGW/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cntcp, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(ComputerNetworks.this, VideoPlayerActivity.class);
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
