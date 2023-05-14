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

public class HtmlAndCss extends AppCompatActivity {
    Button HTML_and_CSS_btn1b,HTML_and_CSS_btn2b,HTML_and_CSS_btn3b,HTML_and_CSS_btn4b,HTML_and_CSS_btn5b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.html_and_css);


        //finding id
        HTML_and_CSS_btn1b=findViewById(R.id.HTML_and_CSS_btn1);
        HTML_and_CSS_btn2b=findViewById(R.id.HTML_and_CSS_btn2);
        HTML_and_CSS_btn3b=findViewById(R.id.HTML_and_CSS_btn3);
        HTML_and_CSS_btn4b=findViewById(R.id.HTML_and_CSS_btn4);
        HTML_and_CSS_btn5b=findViewById(R.id.HTML_and_CSS_btn5);


        //on click listener

        HTML_and_CSS_btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "qz0aGYrrlhU";
                Resources res = getResources();
                String Headtxt = "INTRODUCTION TO HTML";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1ozRKi3KDo7waclCmOpuxWhwVfeafEhNS/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.htcintro, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(HtmlAndCss.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });



        HTML_and_CSS_btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "X9D9ur7t7vc";
                Resources res = getResources();
                String Headtxt = "BASIC HTML TAGS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1PlK0flY7nohd03b3EeZlmgGyPopdc4cF/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.htctags, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(HtmlAndCss.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        HTML_and_CSS_btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "Ed1OTpmDfR8";
                Resources res = getResources();
                String Headtxt = "CREATING PAGE MODELS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1f7jQLtNzkNENckROIdkujf_0nCGWGH1P/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.htccreat, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(HtmlAndCss.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        HTML_and_CSS_btn4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "E_A99dfsOPs";
                Resources res = getResources();
                String Headtxt = "LISTS,TABLES AND FORMS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1MX4tuUyyEUpkFxjsUgVg3bE-NQAf_ECD/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.htclist, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(HtmlAndCss.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });


        HTML_and_CSS_btn5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "E_ZjPAehe9I";
                Resources res = getResources();
                String Headtxt = "SEO";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1KHC2WUL2NposodykdlyJLDxNB1g2NYYB/view?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.htcseo, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(HtmlAndCss.this, VideoPlayerActivity.class);
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
