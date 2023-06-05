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

public class BootstrapAndJquery extends AppCompatActivity {
    Button BootstrapAndJqueryCustomButton1,BootstrapAndJqueryCustomButton2,BootstrapAndJqueryCustomButton3,BootstrapAndJqueryCustomButton4,BootstrapAndJqueryCustomButton5,BootstrapAndJqueryCustomButton6
            ,BootstrapAndJqueryCustomButton7,BootstrapAndJqueryCustomButton8,BootstrapAndJqueryCustomButton9,BootstrapAndJqueryCustomButton10,BootstrapAndJqueryCustomButton11;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bootstrap_and_jquery);

        BootstrapAndJqueryCustomButton1=findViewById(R.id.BootstrapAndJqueryCustomButton1);
        BootstrapAndJqueryCustomButton2=findViewById(R.id.BootstrapAndJqueryCustomButton2);
        BootstrapAndJqueryCustomButton3=findViewById(R.id.BootstrapAndJqueryCustomButton3);
        BootstrapAndJqueryCustomButton4=findViewById(R.id.BootstrapAndJqueryCustomButton4);
        BootstrapAndJqueryCustomButton5=findViewById(R.id.BootstrapAndJqueryCustomButton5);
        BootstrapAndJqueryCustomButton6=findViewById(R.id.BootstrapAndJqueryCustomButton6);
        BootstrapAndJqueryCustomButton7=findViewById(R.id.BootstrapAndJqueryCustomButton7);
        BootstrapAndJqueryCustomButton8=findViewById(R.id.BootstrapAndJqueryCustomButton8);
        BootstrapAndJqueryCustomButton9=findViewById(R.id.BootstrapAndJqueryCustomButton9);
        BootstrapAndJqueryCustomButton10=findViewById(R.id.BootstrapAndJqueryCustomButton10);
        BootstrapAndJqueryCustomButton11=findViewById(R.id.BootstrapAndJqueryCustomButton11);



        BootstrapAndJqueryCustomButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "DUiYVJIVNcA";
                Resources res = getResources();
                String Headtxt = "Bootstrap Overview";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/14gTfqRlly3KI49xJxpZSRgrsUP8Tk1bj/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj1, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "kk_pfNxU1AM";
                Resources res = getResources();
                String Headtxt = "CSS Overview";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1AGkWrTeXHYRI0l_oAhoP7G_ApiMe7G4H/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj2, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "CDP7pOTp1HE";
                Resources res = getResources();
                String Headtxt = "Environment Setup";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1OO0_LGVUY017iF3IwajG7MrAT5_BinnP/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj3, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "_m2oDE7e9vc";
                Resources res = getResources();
                String Headtxt = "Grid System";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/199ziIB1DwP1FLBbmx46_QlE3qiEzz116/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj4, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "PyrEucl-bqY";
                Resources res = getResources();
                String Headtxt = "Typography";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1CsS0AcjqoAKIzhLP9vuiBNavc3pNBtqu/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj5, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });

        BootstrapAndJqueryCustomButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "JMn75rtpiOI";
                Resources res = getResources();
                String Headtxt = "Jquery Overview";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1sEQFakJKSZkbrVPmYZ5boLndkHx4Jn4C/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj6, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "YFlx1C8XwR0";
                Resources res = getResources();
                String Headtxt = "Basics Of Jquery";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1ylPQvGhssYIUZ8sbGkRrNCIy7yj3-tDf/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj7, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "Q8Be9IvY_Rg";
                Resources res = getResources();
                String Headtxt = "Selectors";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1yRmFJ-IIDVfBjf52iS3VXB5l4cnfbgSc/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj8, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "9bCrSoSNp_w";
                Resources res = getResources();
                String Headtxt = "Events And Functions";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1jigMgUPomf1g1xu6DqmUc4tW0lJCSMNa/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj9, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "-UmMHs5Xh40";
                Resources res = getResources();
                String Headtxt = "DOM";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/16Kqb6uxPrx01ZskgbQG2T9xtrjGOqjx_/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj10, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
                intent.putExtra("Link_file", Link);
                intent.putExtra("video_id", videoId);
                intent.putExtra("Headtext_id", Headtxt);
                intent.putExtra("image_finder", Imagefinder);
                intent.putExtra("image_byte_array", byteArray);

                startActivity(intent);
            }

        });


        BootstrapAndJqueryCustomButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoId = "wfiazLZHv8U";
                Resources res = getResources();
                String Headtxt = "Element Visibility";
                String Link = "Download Resources PDF From Here: https://drive.google.com/file/d/1v75FKzqcFAGXTLTOovYEmVp6RXuno_pQ/view?usp=drive_link";
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 2;
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.btj11, options);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream);
                byte[] byteArray = stream.toByteArray();
                String Imagefinder ="R.drawable.image";
                Intent intent = new Intent(BootstrapAndJquery.this, VideoPlayerActivity.class);
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
