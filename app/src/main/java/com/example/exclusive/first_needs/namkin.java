package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class namkin extends AppCompatActivity {
private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namkin);
        Button a3 =(Button)findViewById(R.id.add3);
        Button s3 = (Button)findViewById(R.id.sub3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q3 = (TextView)findViewById(R.id.qty3);
                q3.setText("Quantity:" + count);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q3 = (TextView)findViewById(R.id.qty3);
                q3.setText("Quantity:" + count);
            }
        });
    }
}
