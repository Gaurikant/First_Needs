package com.example.exclusive.first_needs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class stock2 extends AppCompatActivity {
    ImageButton ib1;
    ImageButton ib2;
    ImageButton ib3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock2);
        ib1 = (ImageButton)findViewById(R.id.choclates);
        ib2 = (ImageButton)findViewById(R.id.biscuits);
        ib3 = (ImageButton)findViewById(R.id.milkproducts);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock2.this,choclates.class);
                startActivity(i);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock2.this,biscuits.class);
                startActivity(i);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(stock2.this,milkproducts.class);
                startActivity(i);
            }
        });
    }
}
