package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class maggi extends AppCompatActivity {
private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maggi);
        Button a4 =(Button)findViewById(R.id.add4);
        Button s4 = (Button)findViewById(R.id.sub4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q4 = (TextView)findViewById(R.id.qty4);
                q4.setText("Quantity:" + count);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q4 = (TextView)findViewById(R.id.qty4);
                q4.setText("Quantity:" + count);
            }
        });
    }
}
