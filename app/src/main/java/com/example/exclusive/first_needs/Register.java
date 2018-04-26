package com.example.exclusive.first_needs;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public DataBaseHelper dataBaseHelper;
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dataBaseHelper = new DataBaseHelper(this);
        openHelper = new DataBaseHelper(this);
       final EditText username = (EditText)findViewById(R.id.eun);
       final EditText mob =(EditText)findViewById(R.id.emn);
      final   EditText password =(EditText)findViewById(R.id.epass);
        Button b = (Button)findViewById(R.id.button26);
        Button b1 = (Button)findViewById(R.id.lb);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Register.this,login.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getWritableDatabase();
                String uname = username.getText().toString();
                int mn = Integer.parseInt(mob.getText().toString());
                String pass = password.getText().toString();
                insertdata(uname,mn,pass);
                Toast.makeText(getApplicationContext(),"Registeration Successful",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Register.this,login.class);
                startActivity(intent);
            }
        });

    }

    public void insertdata(String uname,int mn,String pass){
        ContentValues contentValues = new ContentValues();
        contentValues.put("USERNAME",uname);
        contentValues.put("MOBILE_NUMBER",mn);
        contentValues.put("PASSWORD",pass);
        long id = db.insert(DataBaseHelper.TABLE_NAME,null,contentValues);


    }
}



