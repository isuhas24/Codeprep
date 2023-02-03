package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText field1,password;
    Button login,createNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field1=(EditText) findViewById(R.id.txt_email);
        password=(EditText) findViewById(R.id.txt_password);
        login=(Button) findViewById(R.id.btn_login);
        createNewAccount=(Button) findViewById(R.id.btn_new_account);
        login.setOnClickListener(this);
        createNewAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.equals(login)){
            String emailField=field1.getText().toString();
            String passwordField=password.getText().toString();
            Database db=new Database(this, Database.DATABASE_NAME, null, 1);
            SQLiteDatabase d=db.getReadableDatabase();
            String[] columns={"NAME","EMAIL","PASSWORD"};
            String[] selectionArgs={emailField};
            String selection="EMAIL=?";
            Cursor c=d.query(Database.TABLE_NAME,columns,selection,selectionArgs,null,null,null);
            String email_="",password_="";
            if(c.moveToNext()){
                email_=c.getString(1);
                password_=c.getString(2);
            }
            if(passwordField.equals(password_) && emailField.equals(email_)){
                Toast.makeText(this, "Logged in successfully, Redirecting", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "wrong credentials", Toast.LENGTH_SHORT).show();
            }
        }
        else if(v.equals(createNewAccount)){
            Intent it=new Intent(this, CreateNewAccount.class);
            startActivity(it);
        }
    }
}