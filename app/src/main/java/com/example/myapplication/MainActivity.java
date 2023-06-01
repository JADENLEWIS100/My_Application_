package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    private Button btnGenerate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       etNoun = findViewById(R.id.et_noun);
       etVerb = findViewById(R.id.et_verb);
       etAdj = findViewById(R.id.et_adj);
       etFood = findViewById(R.id.et_food);
       etCeleb = findViewById(R.id.et_celeb);
       btnNextPage = findViewById(R.id.btnNextpage);
       btnGenerate = findViewById(R.id.btnGenerate);

       Intent secondaryActivity = new Intent(MainActivity.this, MainActivity2.class);

       btnGenerate.setOnClickListener({
               @Override
                public void onClick(){
                   String story = "";
                   story += etNoun.getText() + " gets ready for the day and goes out for a walk.";
                   story += " " + etAdj.getText() + " "
        }
       });


    }
}