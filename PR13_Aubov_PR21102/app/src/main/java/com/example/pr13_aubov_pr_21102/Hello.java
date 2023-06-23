package com.example.pr13_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void GoToSignIn(View v) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}