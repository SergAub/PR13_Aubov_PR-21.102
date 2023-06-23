package com.example.pr13_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Image1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image1);
    }

    public void Back(View view){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}