package com.example.exclusive.first_needs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class milkproducts extends AppCompatActivity {
  private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkproducts);
        Button a7 =(Button)findViewById(R.id.add7);
        Button s7 = (Button)findViewById(R.id.sub7);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TextView q7 = (TextView)findViewById(R.id.qty7);
                q7.setText("Quantity:" + count);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                TextView q7 = (TextView)findViewById(R.id.qty7);
                q7.setText("Quantity:" + count);
            }
        });
    }
}
