package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wheatdisease extends AppCompatActivity {
    private Button wt_1_btn;
    private Button wt_2_btn;
    private Button wt_3_btn;
    private Button wt_4_btn;
    private Button wt_5_btn;
    private Button wt_6_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheatdisease);
        wt_1_btn = findViewById(R.id.wt_1_btn);
        wt_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwt1page();
            }
        });
        wt_2_btn = findViewById(R.id.wt_2_btn);
        wt_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwt2page();
            }
        });
        wt_3_btn = findViewById(R.id.wt_3_btn);
        wt_3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwt3page();
            }
        });
        wt_4_btn = findViewById(R.id.wt_4_btn);
        wt_4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwt4page();
            }
        });
        wt_5_btn = findViewById(R.id.wt_5_btn);
        wt_5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwt5page();
            }
        });
        wt_6_btn = findViewById(R.id.wt_6_btn);
        wt_6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwt6page();
            }
        });
    }
    public void openwt1page()
    {
        Intent openwt1 = new Intent(this,wt_disease1.class);
        startActivity(openwt1);
    }
    public void openwt2page()
    {
        Intent openwt2 = new Intent(this,wt_disease2.class);
        startActivity(openwt2);
    }
    public void openwt3page()
    {
        Intent openwt3 = new Intent(this,wt_disease3.class);
        startActivity(openwt3);
    }
    public void openwt4page()
    {
        Intent openwt4 = new Intent(this,wt_disease4.class);
        startActivity(openwt4);
    }
    public void openwt5page()
    {
        Intent openwt5 = new Intent(this,wt_disease5.class);
        startActivity(openwt5);
    }
    public void openwt6page()
    {
        Intent openwt6 = new Intent(this,wt_disease6.class);
        startActivity(openwt6);
    }

}