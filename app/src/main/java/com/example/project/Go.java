package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Go extends AppCompatActivity {
    private Button gorubtn;
    private Button cagolbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        gorubtn = findViewById(R.id.gorubtn);
        gorubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengorupage();
            }
        });

        cagolbtn = findViewById(R.id.cagolbtn);
        cagolbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencagolpage();
            }
        });
    }
    public void opengorupage()
    {
        Intent gorupage = new Intent(this,go_1.class);
        startActivity(gorupage);
    }
    public void opencagolpage()
    {
        Intent cagolpage = new Intent(this,go_2.class);
        startActivity(cagolpage);
    }
}