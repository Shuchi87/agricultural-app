package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class logInpage extends AppCompatActivity {
    EditText loginemail,loginpass;
    Button login;
    TextView signupq,forgotpass;

    FirebaseAuth firebaseAuth;
    String emailpattern = "[a-zA-Z0-9._-]+@[a-z]+.[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_inpage);

        loginemail=findViewById(R.id.useramel);
        loginpass = findViewById(R.id.loginemail);
        login = findViewById(R.id.login);
        signupq = findViewById(R.id.signupq);

        firebaseAuth = FirebaseAuth.getInstance();

        forgotpass = findViewById(R.id.forgotpass);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openforpage();
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  String email,pass;
                email = loginemail.getText().toString();
                pass = loginpass.getText().toString();

                if(email.equals("")){
                    Toast.makeText(logInpage.this,"Email is Blank",Toast.LENGTH_LONG).show();
                }
                else if(pass.equals("")){
                    Toast.makeText(logInpage.this,"Password is Blank",Toast.LENGTH_LONG).show();
                }
                else
                {
                    //dfg
                }*/


            }
        });
        signupq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(logInpage.this,signuppage.class);
                startActivity(i);
            }
        });
        loginemail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkinputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        loginpass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    checkinputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkEmailAndPassword();
            }
        });
    }

    private void checkinputs() {
        if(!TextUtils.isEmpty(loginemail.getText())){
            if(!TextUtils.isEmpty(loginpass.getText())){

            }else {

            }

        }else{

        }
    }
    private void checkEmailAndPassword(){
        if(loginemail.getText().toString().matches(emailpattern)){
            if(loginpass.length()>=6){



                firebaseAuth.signInWithEmailAndPassword(loginemail.getText().toString(),loginpass.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Intent mainIntent = new Intent(getApplicationContext(),visitpage.class);
                                    startActivity(mainIntent);
                                    finish();
                                }else{
                                    String error = task.getException().getMessage();
                                    Toast.makeText(getApplicationContext(),error,Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }else{
                Toast.makeText(getApplicationContext(),"Incorrect Email or Password!",Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(getApplicationContext(),"Incorrect Email or Password!",Toast.LENGTH_SHORT).show();
        }
    }

    public void openforpage()
    {
        Intent openfor = new Intent(this,forgotpass.class);
        startActivity(openfor);
    }

}