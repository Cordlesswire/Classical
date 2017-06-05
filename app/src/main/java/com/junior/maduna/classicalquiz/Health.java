package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;


public class Health extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }


    public void questionTwo(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question2);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question1);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    public void questionThree(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question3);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question2);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    public void questionFour(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question4);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question3);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }

    public void questionFive(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question5);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question4);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


       //Displaying the Score






    //Displaying the Score Activity

    public void openScoreACt(View view) {
        Intent i = new Intent(this, Score.class);
        startActivity(i);
    }

}