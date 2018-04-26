package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class biscuits extends AppCompatActivity {
private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biscuits);
        Button a6 =(Button)findViewById(R.id.add6);
        Button s6 = (Button)findViewById(R.id.sub6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q6 = (TextView)findViewById(R.id.qty6);
                q6.setText("Quantity:" + count);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q6 = (TextView)findViewById(R.id.qty6);
                q6.setText("Quantity:" + count);
            }
        });
    }
}
