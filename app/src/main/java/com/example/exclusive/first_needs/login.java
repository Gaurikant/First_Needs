package com.example.exclusive.first_needs;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Cursor cursor;
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openHelper = new DataBaseHelper(this);
        db = openHelper.getReadableDatabase();
       final EditText username = (EditText)findViewById(R.id.un);
        final EditText password =(EditText)findViewById(R.id.pass);
        Button b = (Button)findViewById(R.id.button);
        Button l = (Button)findViewById(R.id.regl);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this,Register.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i=new Intent(login.this,welcome1.class);
                //startActivity(i);
                String n = username.getText().toString();
                String p = password.getText().toString();
                cursor = db.rawQuery("SELECT * FROM " + DataBaseHelper.TABLE_NAME + " WHERE " + DataBaseHelper.Col_1 + "=? AND " + DataBaseHelper.Col_3 + "=?", new String[] {n,p});
                if(cursor!=null) {
                    if(cursor.getCount()>0) {
                        cursor.moveToNext();
                        //Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
                        Intent i = new Intent(login.this,stock1.class);
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Invalid User",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
