package com.example.project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgotpass extends AppCompatActivity {

    private EditText forgotpassword;
    private Button resetpasswordbtn;
    private FirebaseAuth firebaseAuth;

    private ViewGroup for_con;
    private ImageView forpassemail;
    private TextView forpasset;
    private ProgressBar forpassprogressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);

        forgotpassword = findViewById(R.id.forgotpassword);
        resetpasswordbtn= findViewById(R.id.resetpasswordbtn);

        firebaseAuth = FirebaseAuth.getInstance();
        for_con = findViewById(R.id.for_con);
        forpassemail = findViewById(R.id.forpassemail);
        forpasset = findViewById(R.id.forpasset);
        forpassprogressBar = findViewById(R.id.forpassprogressBar);

        forgotpassword.addTextChangedListener(new TextWatcher() {
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
        resetpasswordbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(for_con);
                forpasset.setVisibility(View.GONE);
                forpassemail.setVisibility(View.VISIBLE);
                forpassprogressBar.setVisibility(View.VISIBLE);
                firebaseAuth.sendPasswordResetEmail(forgotpassword.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                               if(task.isSuccessful()){
                                   Toast.makeText(getApplicationContext(),"email sent successfully!",Toast.LENGTH_LONG).show();
                               }else{
                                   String error =task.getException().getMessage();
                                   forpassprogressBar.setVisibility(View.GONE);
                                   forpasset.setText(error);
                                   forpasset.setTextColor(getResources().getColor(R.color.Red));
                                   TransitionManager.beginDelayedTransition(for_con);
                                   forpasset.setVisibility(View.VISIBLE);

                               }
                                forpassprogressBar.setVisibility(View.GONE);
                            }
                        });
            }
        });
    }
    private void checkinputs(){
        if(! TextUtils.isEmpty(forgotpassword.getText())){

        }else{
            Toast.makeText(getApplicationContext(),"Enter your Email",Toast.LENGTH_SHORT).show();
        }
    }


}