package com.example.pr13_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bprof = findViewById(R.id.bprof);
        bprof.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Main.this, Profile.class);
            startActivity(intent);
        }
    });
    Button bprof2 = findViewById(R.id.bprof2);
        bprof2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Main.this, Profile.class);
            startActivity(intent);
        }
    });
}
    public void onClick(View view){
        if(view.getId() == R.id.imageView9){
            Toast.makeText(this, "Спокойным", Toast.LENGTH_SHORT).show();
        } else if(view.getId() == R.id.imageView11){
            Toast.makeText(this, "Расслабленным", Toast.LENGTH_SHORT).show();
        } else if(view.getId() == R.id.imageView12){
            Toast.makeText(this, "Сосредоточенным", Toast.LENGTH_SHORT).show();
        } else if(view.getId() == R.id.imageView13){
            Toast.makeText(this, "Взволнованным", Toast.LENGTH_SHORT).show();
        }
    }
}