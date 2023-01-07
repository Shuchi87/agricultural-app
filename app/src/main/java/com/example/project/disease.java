package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disease extends AppCompatActivity {
    private Button peddybtn;
    private Button wheatbtn;
    private Button vegetablebtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        peddybtn = findViewById(R.id.peddybtn);
        peddybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpeddydiseasepage();
            }
        });

        wheatbtn = findViewById(R.id.wheatbtn);
        wheatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwheatdiseasepage();
            }
        });

        vegetablebtn = findViewById(R.id.vegetablebtn);
        vegetablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvegetablediseasepage();
            }
        });

    }
    public void openpeddydiseasepage()
    {
        Intent peddy = new Intent(this,peddydisease.class);
        startActivity(peddy);
    }

    public void openwheatdiseasepage()
    {
        Intent wheat = new Intent(this,wheatdisease.class);
        startActivity(wheat);
    }

    public void openvegetablediseasepage()
    {
        Intent  vegetable = new Intent(this,vegetable.class);
        startActivity( vegetable);
    }
}