package com.example.vmac.WatBot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity{

    Button loginbutton;
    EditText etEmail, edPassword;
    TextView registerbutton;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        edPassword = (EditText) findViewById(R.id.edPassword);
        loginbutton = (Button) findViewById(R.id.loginbutton);

        registerbutton = (Button) findViewById(R.id.registerbutton);
        fAuth = FirebaseAuth.getInstance();

        registerbutton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });


        loginbutton.setOnClickListener(new View.OnClickListener(){
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

                fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Logged in succesfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        }else{
                            Toast.makeText(LoginActivity.this, "Error!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
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
//            case R.id.registerbutton:
//                startActivity(new Intent(this, RegisterActivity.class));
//
//                break;
//
//        }
//    }
}