package com.example.pr13_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        login=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
    }

    public void signup(View view) {
        if (login.getText().toString().isEmpty()) {
            login.setError("Email is required!");
        } else if (password.getText().toString().isEmpty()) {
            password.setError("Password is required!");
        } else {
            Intent intent = new Intent(this, Main.class);
            startActivity(intent);
        }
    }

    public void toEnter(View view){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}