package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tips extends AppCompatActivity {
    private Button shoswbtn;
    private Button gobadibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        shoswbtn = findViewById(R.id.shoswbtn);
        shoswbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openshoswpage();
            }
        });
        gobadibtn = findViewById(R.id.gobadibtn);
        gobadibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengopage();
            }
        });
    }
    public void openshoswpage()
    {
        Intent shoswpage = new Intent(this,ss.class);
        startActivity(shoswpage);
    }
    public void opengopage()
    {
        Intent gopage = new Intent(this,Go.class);
        startActivity(gopage);
    }
}