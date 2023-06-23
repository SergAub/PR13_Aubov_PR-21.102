package com.example.pr13_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    EditText login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        login=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
    }
    public void signin(View view) {
        if (login.getText().toString().isEmpty()) {
            login.setError("Email is required!");
        } else if (password.getText().toString().isEmpty()) {
            password.setError("Password is required!");
        } else {
            Intent intent = new Intent(this, Main.class);
            startActivity(intent);
        }
    }

    public void toReg(View view){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}