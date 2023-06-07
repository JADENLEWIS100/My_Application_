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
    private EditText etPluralNoun;
    private EditText etVerb;
    private EditText etAdj;
    private EditText etAdverb;
    private EditText etColor;
    private EditText etFood;
    private EditText etCeleb;
    private Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       etNoun = findViewById(R.id.et_noun);
       etPluralNoun = findViewById (R.id.etPluralNoun);
       etVerb = findViewById(R.id.et_verb);
       etAdj = findViewById(R.id.et_adj);
       etAdverb = findViewById(R.id.etAdverb);
       etFood = findViewById(R.id.et_food);
       etCeleb = findViewById(R.id.et_celeb);
       btnNextPage = findViewById(R.id.btnNextpage);


       Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);

       btnNextPage.setOnClickListener(new View.OnClickListener(){
           @Override
                public void onClick(View v){
                   String story = "";
                   story += "\n " + etNoun.getText() + " gets ready for the day and goes out for a walk.";
                   story += "\n " + etNoun.getText() + " walks towards" + etAdj.getText() + " and plays around in it.";
                   story += "\n " + etAdj.getText() + " then transforms into a " + etCeleb.getText() + " !";
                   story += "\n " + etCeleb.getText() + " talks with " + etNoun.getText() + " and the both get on the magic " + etFood.getText() + " and fly high into the sky!";
                   story += "\nSuddenly, " + etFood.getText() + " turns into a " + etPluralNoun.getText() + " car, and " + etNoun.getText() + " and " + etCeleb.getText() + " drive.";
                   story += "\nBoth of our heroes then go to Domino's and get some pizza";
                   story += "\nThe end";

                   intentDisplay.putExtra("story", story);
                   startActivity(intentDisplay);

        }
       });


    }
}