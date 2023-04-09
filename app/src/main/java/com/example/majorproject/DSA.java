package com.example.majorproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DSA extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsa);
        btn1=(Button) findViewById(R.id.DSACustomButton1);
        btn1.setOnClickListener(this);
        btn2=(Button) findViewById(R.id.DSACustomButton2);
        btn2.setOnClickListener(this);
        btn3=(Button) findViewById(R.id.DSACustomButton3);
        btn3.setOnClickListener(this);
        btn4=(Button) findViewById(R.id.DSACustomButton4);
        btn4.setOnClickListener(this);
        btn5=(Button) findViewById(R.id.DSACustomButton5);
        btn5.setOnClickListener(this);
        btn6=(Button) findViewById(R.id.DSACustomButton6);
        btn6.setOnClickListener(this);
        btn7=(Button) findViewById(R.id.DSACustomButton7);
        btn7.setOnClickListener(this);
        btn8=(Button) findViewById(R.id.DSACustomButton8);
        btn8.setOnClickListener(this);
        btn9=(Button) findViewById(R.id.DSACustomButton9);
        btn9.setOnClickListener(this);
        btn10=(Button) findViewById(R.id.DSACustomButton10);
        btn10.setOnClickListener(this);
        btn11=(Button) findViewById(R.id.DSACustomButton11);
        btn11.setOnClickListener(this);
        btn12=(Button) findViewById(R.id.DSACustomButton12);
        btn12.setOnClickListener(this);
        btn13=(Button) findViewById(R.id.DSACustomButton13);
        btn13.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(btn1)){

        }
        else if(v.equals(btn2)){

        }
        else if(v.equals(btn3)){

        }
        else if(v.equals(btn4)){

        }
        else if(v.equals(btn5)){

        }
        else if(v.equals(btn6)){

        }
        else if(v.equals(btn7)){

        }
        else if(v.equals(btn8)){

        }
        else if(v.equals(btn9)){

        }
        else if(v.equals(btn10)){

        }
        else if(v.equals(btn11)){

        }
        else if(v.equals(btn12)){

        }
        else if(v.equals(btn13)){

        }
    }
}
