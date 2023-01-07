package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button logIn;
    private Button signUp;
    private Button visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logIn = findViewById(R.id.logIn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openloginpage();
            }
        });
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignuppage();
            }
        });
        visit = findViewById(R.id.visit);
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvisitpage();
            }
        });

    }
    public void openloginpage()
    {
        Intent login= new Intent(this,logInpage.class);
        startActivity(login);
    }
    public void opensignuppage()
    {
        Intent signup =new Intent(this,signuppage.class);
        startActivity(signup);
    }
    public void openvisitpage()
    {
        Intent visitp = new Intent(this,visitpage.class);
        startActivity(visitp);
    }
}