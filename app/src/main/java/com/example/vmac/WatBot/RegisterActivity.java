package com.example.vmac.WatBot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity{

//     implements View.OnClickListener

    Button registerbutton;
    EditText etUsername, edPassword, etEmail;
    Button loginpagebutton;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        etUsername = (EditText) findViewById(R.id.etUsername);
        etEmail = (EditText) findViewById(R.id.etEmail);
        edPassword = (EditText) findViewById(R.id.edPassword);
        registerbutton = (Button) findViewById(R.id.registerbutton);

        loginpagebutton = (Button) findViewById(R.id.loginpagebutton);

        loginpagebutton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });


        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), Dashboard.class));
        }


        registerbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String email = etEmail.getText().toString().trim();
                String password = edPassword.getText().toString().trim();


                if(TextUtils.isEmpty(email)){
                    etEmail.setError("Email is required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    edPassword.setError("Password is required");
                    return;
                }

                if (password.length() < 6) {
                    edPassword.setError("password must be atleast 6 characters");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegisterActivity.this, "User Created", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), SlideActivity.class));
                        }else {
                            Toast.makeText(RegisterActivity.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });


    }

//    @Override
//    public void onClick(View v) {
//
//        switch (v.getId()){
//
//            case R.id.loginpagebutton:
//                startActivity(new Intent(this, LoginActivity.class));
//
//                break;
//
//        }
//    }
}