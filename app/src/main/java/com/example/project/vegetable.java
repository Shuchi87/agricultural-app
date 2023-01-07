package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vegetable extends AppCompatActivity {
    private Button tomatobtn;
    private Button potatobtn;
    private Button begunbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
        tomatobtn = findViewById(R.id.tomatobtn);
        tomatobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvg1page();
            }
        });
        potatobtn = findViewById(R.id.potatobtn);
        potatobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvg2page();
            }
        });
        begunbtn = findViewById(R.id.begunbtn);
        begunbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvg3page();
            }
        });
    }
    public void openvg1page()
    {
        Intent openvg1 = new Intent(this,tomato.class);
        startActivity(openvg1);
    }
    public void openvg2page()
    {
        Intent openvg2 = new Intent(this,potatodisease.class);
        startActivity(openvg2);
    }
    public void openvg3page()
    {
        Intent openvg3 = new Intent(this,eggplantdisease.class);
        startActivity(openvg3);
    }
}