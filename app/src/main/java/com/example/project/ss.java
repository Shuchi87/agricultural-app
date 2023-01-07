package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ss extends AppCompatActivity {
    private Button ricebtn;
    private Button gmbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);

        ricebtn = findViewById(R.id.ricebtn);
        ricebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openricepage();
            }
        });
        gmbtn = findViewById(R.id.gmbtn);
        gmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengmpage();
            }
        });
    }
    public void openricepage()
    {
        Intent ricepage = new Intent(this,ss_1.class);
        startActivity(ricepage);
    }
    public void opengmpage()
    {
        Intent gmpage = new Intent(this,GM2.class);
        startActivity(gmpage);
    }
}