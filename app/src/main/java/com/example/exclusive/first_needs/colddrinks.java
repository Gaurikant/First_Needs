package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class colddrinks extends AppCompatActivity {
private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colddrinks);
        Button a2 =(Button)findViewById(R.id.add2);
        Button s2 = (Button)findViewById(R.id.sub2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q2 = (TextView)findViewById(R.id.qty2);
                q2.setText("Quantity:" + count);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q2 = (TextView)findViewById(R.id.qty2);
                q2.setText("Quantity:" + count);
            }
        });
    }
}
