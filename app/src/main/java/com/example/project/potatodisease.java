package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class potatodisease extends AppCompatActivity {
    private Button po_1_btn;
    private Button po_2_btn;
    private Button po_3_btn;
    private Button po_4_btn;
    private Button po_5_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatodisease);
        po_1_btn = findViewById(R.id.po_1_btn);
        po_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpo1page();
            }
        });
        po_2_btn = findViewById(R.id.po_2_btn);
        po_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpo2page();
            }
        });
        po_3_btn = findViewById(R.id.po_3_btn);
        po_3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpo3page();
            }
        });
        po_4_btn = findViewById(R.id.po_4_btn);
        po_4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpo4page();
            }
        });
        po_5_btn = findViewById(R.id.po_5_btn);
        po_5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpo5page();
            }
        });
    }
    public void openpo1page()
    {
        Intent openpo1 = new Intent(this,po_disease1.class);
        startActivity(openpo1);
    }
    public void openpo2page()
    {
        Intent openpo2 = new Intent(this,po_disease2.class);
        startActivity(openpo2);
    }
    public void openpo3page()
    {
        Intent openpo3 = new Intent(this,po_disease3.class);
        startActivity(openpo3);
    }
    public void openpo4page()
    {
        Intent openpo4 = new Intent(this,po_disease4.class);
        startActivity(openpo4);
    }
    public void openpo5page()
    {
        Intent openpo5 = new Intent(this,po_disease5.class);
        startActivity(openpo5);
    }

}