package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivityJava extends AppCompatActivity {
    TextView lblCounter;
    Button btnIncrement;
    Button btnDecrement;
    int Counter = 0;
    Button btnReset;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_java);
        lblCounter = (TextView) findViewById(R.id.lblCounter);
        btnIncrement = (Button) findViewById(R.id.btnIncrement);
        btnDecrement = (Button) findViewById(R.id.btnDecrement);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Counter ++;
                lblCounter.setText(Integer.toString(Counter));
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Counter --;
                lblCounter.setText(Integer.toString(Counter));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Counter=0;
                lblCounter.setText(Integer.toString(Counter));
            }
        });


    }
}