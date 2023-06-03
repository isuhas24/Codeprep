package com.example.majorproject;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinkedList extends AppCompatActivity {
    LinearLayout layout1,layout2;
    TextView code1,code2;
    WebView VideoPlayer;
    TextView LinkText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linked_list);

        //Link Show
        LinkText = findViewById(R.id.Linkshowlinked);
        String setlink = "https://drive.google.com/file/d/1pmk2hYzVfB76qXetrw8XPZF616XWRzd6/view?usp=drive_link";
        LinkText.setText(setlink);

        //Link Show End

        //for video player
        VideoPlayer = findViewById(R.id.linked_video);
        VideoPlayer.getSettings().setJavaScriptEnabled(true);
        VideoPlayer.getSettings().setPluginState(WebSettings.PluginState.ON);
        VideoPlayer.setWebViewClient(new WebViewClient());
        //for video getting the link
        String videoId = "TwdjOQMTaQ4";
        String html = "<html><body><iframe class=\"youtube-player\" type=\"text/html\" width=\"100%\" height=\"100%\" src=\"http://www.youtube.com/embed/" + videoId + "\" frameborder=\"0\"></iframe></body></html>";
        VideoPlayer.loadData(html, "text/html", "utf-8");

        //video player ends

        //for 1st card view
        layout1=(LinearLayout) findViewById(R.id.layout_linked_list_q1);
        layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code1=(TextView) findViewById(R.id.code_linked_list_q1);

        //for 2nd card view
        layout2=(LinearLayout) findViewById(R.id.layout_linked_list_q2);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code2=(TextView) findViewById(R.id.code_linked_list_q2);
    }

    public void expand_linked_list_q1(View v){
        int v1=(code1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout1,new AutoTransition());
        code1.setVisibility(v1);
    }

    //expanding code for 2nd card view
    public void expand_linked_list_q2(View v){
        int v2=(code2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout2,new AutoTransition());
        code2.setVisibility(v2);
    }
    @Override
    public void onBackPressed() {
        if (VideoPlayer.canGoBack()) {
            VideoPlayer.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
