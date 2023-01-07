package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class peddydisease extends AppCompatActivity {
    private Button pd_1_btn;
    private Button pd_2_btn;
    private Button pd_3_btn;
    private Button pd_4_btn;
    private Button pd_5_btn;
    private Button pd_6_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peddydisease);
        pd_1_btn = findViewById(R.id.pd_1_btn);
        pd_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpd1page();
            }
        });

        pd_2_btn = findViewById(R.id.pd_2_btn);
        pd_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpd2page();
            }
        });

        pd_3_btn = findViewById(R.id.pd_3_btn);
        pd_3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpd3page();
            }
        });

        pd_4_btn = findViewById(R.id.pd_4_btn);
        pd_4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpd4page();
            }
        });
        pd_5_btn = findViewById(R.id.pd_5_btn);
        pd_5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpd5page();
            }
        });
        pd_6_btn = findViewById(R.id.pd_6_btn);
        pd_6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpd6page();
            }
        });
    }
    public void openpd1page()
    {
        Intent openpd1 = new Intent(this,p_disease1.class);
        startActivity(openpd1);
    }

    public void openpd2page()
    {
        Intent openpd2 = new Intent(this,p_disease2.class);
        startActivity(openpd2);
    }

    public void openpd3page()
    {
        Intent openpd3 = new Intent(this,p_disease3.class);
        startActivity(openpd3);
    }
    public void openpd4page()
    {
        Intent openpd4 = new Intent(this,p_disease4.class);
        startActivity(openpd4);
    }

    public void openpd5page()
    {
        Intent openpd5 = new Intent(this,p_disease5.class);
        startActivity(openpd5);
    }
    public void openpd6page()
    {
        Intent openpd6 = new Intent(this,p_disease6.class);
        startActivity(openpd6);
    }
}