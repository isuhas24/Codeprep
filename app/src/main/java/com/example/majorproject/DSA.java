package com.example.majorproject;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.core.utilities.Tree;

import java.io.ByteArrayOutputStream;

public class DSA extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsa);




        btn1=(Button) findViewById(R.id.DSACustomButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videoId = "5_5oE5lgrhw";
                Resources res = getResources();
                String Headtxt = "ALGORITHMS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/drive/folders/1vOv1OCJ_-6H94xs9-sGPHUCv-FonqwS6?usp=sharing";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dsaalgo, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DSA.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);

            }
        });
        btn2=(Button) findViewById(R.id.DSACustomButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Array.class));
            }
        });
        btn3=(Button) findViewById(R.id.DSACustomButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BitManipulation.class));
            }
        });
        btn4=(Button) findViewById(R.id.DSACustomButton4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "MLqHDsBOC4c";
                Resources res = getResources();
                String Headtxt = "ALL IN ONE DSA RESOURCES";
                String Link = "Download Resources PDF From Here: https://drive.google.com/drive/folders/1LOpaRCEJlwmHf1XA-aEajID5JNrcwqN7?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dsaallinone, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DSA.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });
        btn5=(Button) findViewById(R.id.DSACustomButton5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DynamicProgramming.class));
            }
        });
        btn6=(Button) findViewById(R.id.DSACustomButton6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Graphs.class));
            }
        });
        btn7=(Button) findViewById(R.id.DSACustomButton7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Greedy.class));
            }
        });
        btn8=(Button) findViewById(R.id.DSACustomButton8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "WeF3_nk-UqY";
                Resources res = getResources();
                String Headtxt = "HASHMAP";
                String Link = "Download Resources PDF From Here: https://drive.google.com/drive/folders/15qq1UPfzj8mnJwXjyFeonU8oeb3d4n9M?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dsahashmap, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DSA.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });
        btn9=(Button) findViewById(R.id.DSACustomButton9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LinkedList.class));
            }
        });
        btn10=(Button) findViewById(R.id.DSACustomButton10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Backtracking.class));
            }
        });
        btn11=(Button) findViewById(R.id.DSACustomButton11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StacksAndQueues.class));
            }
        });
        btn12=(Button) findViewById(R.id.DSACustomButton12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "a3tJY7QWSCA";
                Resources res = getResources();
                String Headtxt = "TIME COMPLEXITY ANALYSIS";
                String Link = "Download Resources PDF From Here: https://drive.google.com/drive/folders/1dZW4NdJpy4QICy0lXvkBbYwtMAxbx2op?usp=share_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dsatimecom, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(DSA.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }
        });
        btn13=(Button) findViewById(R.id.DSACustomButton13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Trees.class));
            }
        });
    }

}
