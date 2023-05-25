package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnNextPage = findViewById(R.id.btn_nextpage);

       Intent secondaryActivity = new Intent(MainActivity.this, MainActivity2.class);

       String sendThisString = "Whatever string I want to send"
    }
}