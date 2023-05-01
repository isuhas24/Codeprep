package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class VideoPlayerActivity extends AppCompatActivity {
    public static final String VIDEO_ID_KEY = "";


    private WebView webView;
    TextView headlinetxt,infolinetxt,linktxt;
    ImageView first;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        //id findings
        headlinetxt = findViewById(R.id.headline);
        infolinetxt = findViewById(R.id.infoline);
        first = findViewById(R.id.imageview1);
        webView = findViewById(R.id.web_view);
        linktxt= findViewById(R.id.Linkshow);



        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.setWebViewClient(new WebViewClient());


        //FOR IMAGEVIEW GETTING THE IMGAE
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // Get the image from the extras and set it in the ImageView
            Drawable imageDrawable = extras.getParcelable("Thumb_nail");
            if (imageDrawable != null) {
                first.setImageDrawable(imageDrawable);
            }
        }



        //for textview getting the texts
        //for head text
        String Headtxt = getIntent().getStringExtra("Headtext_id");
        headlinetxt.setText(Headtxt);
        //for info text
        String infotext = getIntent().getStringExtra("infotext_id");
        infolinetxt.setText(infotext);

        String setlink = getIntent().getStringExtra("Link_file");
        linktxt.setText(setlink);


        //for video getting the link
        String videoId = getIntent().getStringExtra("video_id");
        String html = "<html><body><iframe class=\"youtube-player\" type=\"text/html\" width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/" + videoId + "\" frameborder=\"0\"></iframe></body></html>";
        webView.loadData(html, "text/html", "utf-8");

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}


