package com.example.majorproject;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateNewAccount extends AppCompatActivity implements View.OnClickListener {
    EditText name,mobile,key;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_account);
        name=(EditText) findViewById(R.id.txt_name);
        mobile=(EditText) findViewById(R.id.txt_email_or_phone);
        key=(EditText) findViewById(R.id.txt_passkey);
        register=(Button) findViewById(R.id.btn_register);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(register)){
            String name_=name.getText().toString();
            String mobile_=mobile.getText().toString();
            String key_=key.getText().toString();
            if(name_.isEmpty() || mobile_.isEmpty() || key_.isEmpty()){
                Toast.makeText(this, "Enter the credentials to register", Toast.LENGTH_SHORT).show();
            }
            else{
                Database db=new Database(this, Database.DATABASE_NAME, null,1);
                SQLiteDatabase d=db.getWritableDatabase();
                ContentValues cv=new ContentValues();
                cv.put("NAME",name_);
                cv.put("EMAIL",mobile_);
                cv.put("PASSWORD",key_);
                d.insert(Database.TABLE_NAME,null,cv);
                d.close();
                Toast.makeText(this, "Registered successfully", Toast.LENGTH_SHORT).show();
                Intent it=new Intent(this,MainActivity.class);
                startActivity(it);
            }
        }
    }
}
