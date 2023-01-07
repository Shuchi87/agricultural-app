package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class visitpage extends AppCompatActivity {
      private ImageButton diseaseBtn;
      private ImageButton tipsBtn;
      private ImageButton weather_btn;
      private ImageButton calendarBtn;
      private ImageButton videosBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitpage);
        diseaseBtn = findViewById(R.id.diseaseBtn);
        diseaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendiseasepage();
            }
        });
        tipsBtn = findViewById(R.id.tipsBtn);
        tipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentipspage();
            }
        });

        weather_btn = findViewById(R.id.weather_btn);
        weather_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweatherpage();
            }
        });

        calendarBtn = findViewById(R.id.calendarBtn);
        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencalenderpage();
            }
        });

        videosBtn = findViewById(R.id.videosBtn);
        videosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvidepage();
            }
        });
    }
    public void opendiseasepage()
    {
        Intent diseasepage = new Intent(this,disease.class);
        startActivity(diseasepage);

    }
    public void opentipspage()
    {
        Intent tipspage = new Intent(this,tips.class);
        startActivity(tipspage);

    }

    public void openweatherpage()
    {
        Intent wpage = new Intent(this,weathermain.class);
        startActivity(wpage);

    }
    public void opencalenderpage()
    {
        Intent cpage = new Intent(this,calender.class);
        startActivity(cpage);

    }

    public void openvidepage()
    {
        Intent vpage = new Intent(this,videos.class);
        startActivity(vpage);

    }
}