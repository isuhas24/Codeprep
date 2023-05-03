package com.example.majorproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CProgramming extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_programming);
        b1=(Button)findViewById(R.id.c_b1);

        b2=(Button)findViewById(R.id.c_b2);

        b3=(Button)findViewById(R.id.c_b3);

        b4=(Button)findViewById(R.id.c_b4);

        b5=(Button)findViewById(R.id.c_b5);

        b6=(Button)findViewById(R.id.c_b6);

        b7=(Button)findViewById(R.id.c_b7);

        b8=(Button)findViewById(R.id.c_b8);

        b9=(Button)findViewById(R.id.c_b9);

        b10=(Button)findViewById(R.id.c_b10);

       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "C5GCFEMcIGQ";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });*/
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "r-M3ESr8WLY";
                Resources res = getResources();
                String Headtxt = "text";
                String Link = "Click here for more information: https://drive.google.com/file/d/1_2neyCmDgv3_VCBrY824VckIFQu40zCD/view?usp=share_link";
                //for image view
                ImageView imageView = new ImageView(CProgramming.this);
                imageView.setImageResource(R.drawable.cprogramthumb);
                Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
                    //image view task ends
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
               // intent.putExtra("Thumb_nail", bitmap);
                startActivity(intent);

            }
        });

        /*b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "UEg50IfiMmY";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "QCBV_KrB4wk";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "SFo205wqn8w";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "4NGthO9F1Bo";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "SK5gBnwN4dg";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "KQZIBckWK-s";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "TT8_FfPYeW4";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "q8j8EqCZcWM";
                Intent intent = new Intent(CProgramming.this, VideoPlayerActivity.class);
                intent.putExtra("video_id", videoId);
                startActivity(intent);

            }
        });

         */







    }


}
