package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNoun;
    private EditText etVerb;
    private EditText etAdj;
    private EditText etAdverb;
    private EditText etColor;
    private EditText etFood;
    private EditText etCeleb;
    private Button btnNextPage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnNextPage = findViewById(R.id.btn_nextpage);
       etNoun = findViewById(R.id.et_noun);
       etVerb = findViewById(R.id.et_verb);
       etAdj = findViewById(R.id.et_adj);
       etFood = findViewById(R.id.et_food);
       etCeleb = findViewById(R.id.et_celeb);

       Intent secondaryActivity = new Intent(MainActivity.this, MainActivity2.class);

       String sendThisString = "Whatever string I want to send";
    }
}