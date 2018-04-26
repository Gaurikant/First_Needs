package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class wafers extends AppCompatActivity {
private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wafers);
        Button a1 =(Button)findViewById(R.id.add1);
        Button s1 = (Button)findViewById(R.id.sub1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q1 = (TextView)findViewById(R.id.qty1);
                q1.setText("Quantity:" + count);
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q1 = (TextView)findViewById(R.id.qty1);
                q1.setText("Quantity:" + count);
            }
        });
    }
}
