package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tomato extends AppCompatActivity {
    private Button to_1_btn;
    private Button to_2_btn;
    private Button to_3_btn;
    private Button to_4_btn;
    private Button to_5_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
        to_1_btn = findViewById(R.id.to_1_btn);
        to_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opento1page();
            }
        });
        to_2_btn = findViewById(R.id.to_2_btn);
        to_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opento2page();
            }
        });
        to_3_btn = findViewById(R.id.to_3_btn);
        to_3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opento3page();
            }
        });
        to_4_btn = findViewById(R.id.to_4_btn);
        to_4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opento4page();
            }
        });
        to_5_btn = findViewById(R.id.to_5_btn);
        to_5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opento5page();
            }
        });
    }
    public void opento1page()
    {
        Intent opento1 = new Intent(this,to_disease1.class);
        startActivity(opento1);
    }
    public void opento2page()
    {
        Intent opento2 = new Intent(this,to_disease2.class);
        startActivity(opento2);
    }
    public void opento3page()
    {
        Intent opento3 = new Intent(this,to_disease3.class);
        startActivity(opento3);
    }
    public void opento4page()
    {
        Intent opento4 = new Intent(this,to_disease4.class);
        startActivity(opento4);
    }
    public void opento5page()
    {
        Intent opento5= new Intent(this,to_disease5.class);
        startActivity(opento5);
    }
}