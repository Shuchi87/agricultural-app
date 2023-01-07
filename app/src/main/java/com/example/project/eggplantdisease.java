package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eggplantdisease extends AppCompatActivity {
    private Button eg_1_btn;
    private Button eg_2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggplantdisease);
        eg_1_btn=findViewById(R.id.eg_1_btn);
        eg_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openeg1page();
            }
        });
        eg_2_btn=findViewById(R.id.eg_2_btn);
        eg_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openeg2page();
            }
        });
    }
    public void openeg1page()
    {
        Intent openeg1 = new Intent(this,eg_disease1.class);
        startActivity(openeg1);
    }
    public void openeg2page()
    {
        Intent openeg2 = new Intent(this,eg_disease2.class);
        startActivity(openeg2);
    }

}