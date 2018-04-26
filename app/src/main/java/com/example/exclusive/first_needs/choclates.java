package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class choclates extends AppCompatActivity {
private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choclates);
        Button a5 =(Button)findViewById(R.id.add5);
        Button s5 = (Button)findViewById(R.id.sub5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q5 = (TextView)findViewById(R.id.qty5);
                q5.setText("Quantity:" + count);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q5 = (TextView)findViewById(R.id.qty5);
                q5.setText("Quantity:" + count);
            }
        });
    }
}
