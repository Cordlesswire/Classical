package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    int score = 0;

    //Access the RadioGroup view and save it to a variable. Declared outside methods since we gonna use it more than once
    RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.mradioGroupOne);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    //Find out to check if a RadioGroup is selected or not and if not display a toast message telling the user to select something before moving on
    public void questionTwo(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question2);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question1);

        if (radioGQ1.getCheckedRadioButtonId() == -1){
            layout1.setVisibility(View.VISIBLE);
            layout.setVisibility(View.GONE);
            Toast.makeText(Music.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT OPTION", Toast.LENGTH_LONG).show();
        }
        else{
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);
        }

    }


    public void questionThree(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question3);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question2);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    //Displaying the Score


    //Displaying the Score Activity

    public void openScoreACt(View view) {

        Intent i = new Intent(this, Score.class);
        startActivity(i);


        //Get the id of the RadioButton that is checked and save it as an integer variable.
        int solutionId1 = radioGQ1.getCheckedRadioButtonId();
        //Use if statements to respond based on whether
        //it is the id of the correct answer.
        if (solutionId1 == R.id.qm1_3) {
            score++;

        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.mradioGroupTwo);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId2 = radioGQ2.getCheckedRadioButtonId();
        if (solutionId2 == R.id.qm2_1) {
            score++;

        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ3 = (RadioGroup) findViewById(R.id.mradioGroupThree);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId3 = radioGQ3.getCheckedRadioButtonId();
        if (solutionId3 == R.id.qm3_3) {
            score++;


            if (score >= 3) {
                Toast.makeText(Music.this,
                        "YOU SCORED A PERFECT " + score + " OUT OF 3.", Toast.LENGTH_LONG).show();

            } else if (score < 3) {
                Toast.makeText(Music.this,
                        "You scored " + score + " out of 3.", Toast.LENGTH_LONG).show();
            }


        }

    }
}
