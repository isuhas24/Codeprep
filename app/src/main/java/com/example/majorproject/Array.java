package com.example.majorproject;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Array extends AppCompatActivity {
    LinearLayout layout1,layout2,layout3,layout4,layout5;
    TextView code1,code2,code3,code4,code5;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array);

        //for 1st card view
        layout1=(LinearLayout) findViewById(R.id.layout_array_q1);
        layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code1=(TextView) findViewById(R.id.code_array_q1);

        //for 2nd card view
        layout2=(LinearLayout) findViewById(R.id.layout_array_q2);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code2=(TextView) findViewById(R.id.code_array_q2);

        //for 3rd card view
        layout3=(LinearLayout) findViewById(R.id.layout_array_q3);
        layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code3=(TextView) findViewById(R.id.code_array_q3);

        //for 4rd card view
        layout4=(LinearLayout) findViewById(R.id.layout_array_q4);
        layout4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code4=(TextView) findViewById(R.id.code_array_q4);

        //for 5th card view
        layout5=(LinearLayout) findViewById(R.id.layout_array_q5);
        layout5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        code5=(TextView) findViewById(R.id.code_array_q5);
    }

    //expanding code for 1st card view
    public void expand_array_q1(View v){
        int v1=(code1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout1,new AutoTransition());
        code1.setVisibility(v1);
    }

    //expanding code for 2nd card view
    public void expand_array_q2(View v){
        int v2=(code2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout2,new AutoTransition());
        code2.setVisibility(v2);
    }

    //expanding code for 3rd card view
    public void expand_array_q3(View v){
        int v3=(code3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout3,new AutoTransition());
        code3.setVisibility(v3);
    }

    //expanding code for 4th card view
    public void expand_array_q4(View v){
        int v4=(code4.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout4,new AutoTransition());
        code4.setVisibility(v4);
    }

    //expanding code for 5th card view
    public void expand_array_q5(View v){
        int v5=(code5.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout5,new AutoTransition());
        code5.setVisibility(v5);
    }
}
