package com.example.exclusive.first_needs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class stock1 extends AppCompatActivity {
   ImageButton ib1;
   ImageButton ib2;
   ImageButton ib3;
   ImageButton ib4;
   Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock1);
        ib1 = (ImageButton)findViewById(R.id.wafers);
        ib2 = (ImageButton)findViewById(R.id.cd);
        ib3 = (ImageButton)findViewById(R.id.namkin);
        ib4 = (ImageButton)findViewById(R.id.maggi);
        b1 = (Button)findViewById(R.id.more);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock1.this,wafers.class);
                startActivity(i);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock1.this,colddrinks.class);
                startActivity(i);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock1.this,namkin.class);
                startActivity(i);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock1.this,maggi.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock1.this,stock2.class);
                startActivity(i);
            }
        });


    }
}
