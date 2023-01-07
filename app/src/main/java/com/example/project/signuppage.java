package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
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
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class signuppage extends AppCompatActivity {
    EditText useramel,loginemail,regpass,conpass;
    Button Reg;
    TextView Alaccount;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;

    private String emailpattern ="[a-zA-Z0-9._-]+@[a-z]+.[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

        useramel =findViewById(R.id.useramel);
        loginemail =findViewById(R.id.loginemail);
        regpass =findViewById(R.id.regpass);
        conpass =findViewById(R.id.conpass);
        Reg =findViewById(R.id.Reg);
        Alaccount =findViewById(R.id.Alaccount);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* String Useramel,Loginemail,Regpass,Conpass;

                Useramel = useramel.getText().toString();
                Loginemail = loginemail.getText().toString();
                Regpass = regpass.getText().toString();
                Conpass = conpass.getText().toString();


                if (Useramel.equals(""));{
                    Toast.makeText(signuppage.this,"Enter your name",Toast.LENGTH_LONG).show();
                }

                 if (Loginemail.equals(""));{
                    Toast.makeText(signuppage.this,"Enter your email",Toast.LENGTH_LONG).show();
                }

                if (Regpass.equals(""));{
                    Toast.makeText(signuppage.this,"Enter your Password",Toast.LENGTH_LONG).show();
                }
                if (Conpass.equals(""));{
                    Toast.makeText(signuppage.this,"Enter your  Re confirm Password",Toast.LENGTH_LONG).show();
                }*/
            }
        });
        loginemail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                 checkInputs();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        useramel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                  checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        regpass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
             checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        conpass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                   checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkEmailandPass();
            }
        });

        Alaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R = new Intent(signuppage.this,logInpage.class);
                startActivity(R);
            }
        });

    }
    private void  checkInputs(){
        if(!TextUtils.isEmpty(loginemail.getText())){
            if(!TextUtils.isEmpty((useramel.getText()))){
                if(!TextUtils.isEmpty(regpass.getText())&& regpass.length()>=6){
                    if(!TextUtils.isEmpty(conpass.getText())){
                      // Reg.setEnabled(true);
                     // Reg.setTextColor(Color.argb(255,255,255,255));
                    }else{
                        //Reg.setEnabled(false);
                       // Reg.setTextColor(Color.argb(50,255,255,255));

                    }

                }else{
                   // Reg.setEnabled(false);
                   // Reg.setTextColor(Color.argb(50,255,255,255));

                }

            }else{
              //  Reg.setEnabled(false);
              //  Reg.setTextColor(Color.argb(50,255,255,255));

            }

        }else{
           // Reg.setEnabled(false);
         //   Reg.setTextColor(Color.argb(50,255,255,255));

        }
    }
    private void checkEmailandPass(){
        if(loginemail.getText().toString().matches(emailpattern)){
            if(regpass.getText().toString().equals(conpass.getText().toString())){
               firebaseAuth.createUserWithEmailAndPassword(loginemail.getText().toString(),regpass.getText().toString())
                       .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                           @Override
                           public void onComplete(@NonNull Task<AuthResult> task) {
                               if(task.isSuccessful()){
                                   Map<Object,String > userdata = new HashMap<>();
                                   userdata.put("username",useramel.getText().toString());

                                   firebaseFirestore.collection("USERS")
                                           .add(userdata)
                                           .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                                               @Override
                                               public void onComplete(@NonNull Task<DocumentReference> task) {
                                                   if (task.isSuccessful()){
                                                       Intent mainIntent=new Intent(getApplicationContext(),logInpage.class);
                                                       startActivity(mainIntent);
                                                       finish();


                                                   }else{

                                                   }
                                               }
                                           });


                               }else{
                                   String error=task.getException().getMessage();
                                   Toast.makeText(getApplicationContext(),error,Toast.LENGTH_SHORT).show();
                               }
                           }
                       });
            }else{
                conpass.setError("Password doesn't matched!");
            }

        }else{
            loginemail.setError("Invalid Email!");
        }

    }
}