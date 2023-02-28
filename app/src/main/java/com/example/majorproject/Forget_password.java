package com.example.majorproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Forget_password  extends AppCompatActivity implements View.OnClickListener {
    EditText emailid;
    String passwordid;
    AlertDialog.Builder builder;
    Button cancel ,search_password;
    @Override
    protected void onCreate(Bundle i){
        super.onCreate(i);
        setContentView(R.layout.forgotactivity);
        emailid=(EditText) findViewById(R.id.txt_Email);
        cancel=(Button) findViewById(R.id.btn_cancel);
        search_password=(Button) findViewById(R.id.btn_Search);
        cancel.setOnClickListener(this);
        search_password.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v.equals(cancel)){
            Intent it=new Intent(this,MainActivity.class);
            startActivity(it);
        }
        else if(v.equals(search_password)){
            String email1=emailid.getText().toString();
            Database db=new Database(this, Database.DATABASE_NAME, null,1);
            SQLiteDatabase d=db.getReadableDatabase();
            String col[]={"NAME","EMAIL","PASSWORD"};
            String where="EMAIL=?";
            String[] value={email1.trim()};
            Cursor cu=d.query(Database.TABLE_NAME, col, where, value,null, null, null);
            if(cu.moveToNext()) {

                passwordid = cu.getString(2);
            }
            String email=emailid.getText().toString();
            builder=new AlertDialog.Builder(this);
            builder.setTitle("Please do not disclose password with anyone")
                            .setMessage("Email:"+email+"\nPassword:"+passwordid)
                                    .setCancelable(true)
                                            .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.cancel();
                                                }
                                            }).show();


            Toast.makeText(this, "password", Toast.LENGTH_SHORT).show();
        }

    }


}
