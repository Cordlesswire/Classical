package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class Health extends AppCompatActivity {
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }

    //Method to display Question 2
    public void questionTwo(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question2);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question1);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }

    //Method to display Question 3
    public void questionThree(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question3);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question2);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    //Displaying the Score Activity

    public void openScoreACt(View view) {

        Intent i = new Intent(this, Score.class);
        startActivity(i);

        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.healthRadioGroupOne);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId1 = radioGQ1.getCheckedRadioButtonId();
        //Use if statements to respond based on whether
        //it is the id of the correct answer.
        if (solutionId1 == R.id.q1_1) {
            score++;

        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.healthRadioGroupTwo);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId2 = radioGQ2.getCheckedRadioButtonId();
        if (solutionId2 == R.id.q2_3) {
            score++;

        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ3 = (RadioGroup) findViewById(R.id.healthRadioGroupThree);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId3 = radioGQ3.getCheckedRadioButtonId();
        if (solutionId3 == R.id.q3_3) {
            score++;


            if (score >= 3) {
                Toast.makeText(Health.this,
                        "YOU SCORED A PERFECT " + score + " OUT OF 3.", Toast.LENGTH_LONG).show();

            } else if (score < 3) {
                Toast.makeText(Health.this,
                        "You scored " + score + " out of 3.", Toast.LENGTH_LONG).show();
            }


        }

    }

}

