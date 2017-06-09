package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Technology extends AppCompatActivity {
    float score = 0;
    float total = 5;
    float percent = 0;
    float incorrect = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);


        // keyboard doesn't show when activity starts
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    //Replay game
    public void replayGame(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    //Display question 2
    //Find out to check if has selected a choice or not and if not display a toast message telling the user to select something before moving on
    public void questionTwo(View view) {
        RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.tradioGroupOne);
        //check if the user has selected something if not dont go to the next question
        if (radioGQ1.getCheckedRadioButtonId() != -1) {
            ScrollView layout = (ScrollView) findViewById(R.id.question2);
            ScrollView layout1 = (ScrollView) findViewById(R.id.question1);
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(Technology.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT QUESTION", Toast.LENGTH_SHORT).show();
        }

    }

    //Display question 3
    public void questionThree(View view) {
        RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.tradioGroupTwo);
        //check if the user has selected something if not dont go to the next question
        if (radioGQ2.getCheckedRadioButtonId() != -1) {
            ScrollView layout = (ScrollView) findViewById(R.id.question3);
            ScrollView layout1 = (ScrollView) findViewById(R.id.question2);
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(Technology.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT QUESTION", Toast.LENGTH_SHORT).show();
        }
    }


    //Display question 4
    public void questionFour(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question4);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question3);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    //Display question 5
    public void questionFive(View view) {
        ScrollView layout = (ScrollView) findViewById(R.id.question5);
        ScrollView layout1 = (ScrollView) findViewById(R.id.question4);
        layout1.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    //New Score method
    public void scoreDisplay(View view) {
        RadioGroup radioGQ3 = (RadioGroup) findViewById(R.id.tradioGroupThree);
        //check if the user has selected something if not dont go to the next question
        if (radioGQ3.getCheckedRadioButtonId() != -1) {
            ScrollView layout = (ScrollView) findViewById(R.id.techScore);
            ScrollView layout1 = (ScrollView) findViewById(R.id.question5);
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);


            //Calculating the score
            if (radioGQ3.getCheckedRadioButtonId() != -1) {
                //Access the RadioGroup view and save it to a variable.
                //Get the id of the RadioButton that is checked and save it as an integer variable.
                RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.tradioGroupOne);
                int solutionId1 = radioGQ1.getCheckedRadioButtonId();
                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId1 == R.id.qt1_2) {
                    score++;
                }


                //Access the RadioGroup view and save it to a variable.
                RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.tradioGroupTwo);
                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId2 = radioGQ2.getCheckedRadioButtonId();
                if (solutionId2 == R.id.qt2_2) {
                    score++;

                }


                //Access the RadioGroup view and save it to a variable.
                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId3 = radioGQ3.getCheckedRadioButtonId();
                if (solutionId3 == R.id.qt3_1) {
                    score++;

                }


            }

            //Get the users selection from the checkbox and decide if its the correct one and increment score
            CheckBox newton = (CheckBox) findViewById(R.id.techBox1);
            boolean isNewton = newton.isChecked();

            CheckBox pascal = (CheckBox) findViewById(R.id.techBox2);
            boolean isPascal = pascal.isChecked();

            CheckBox kepler = (CheckBox) findViewById(R.id.techBox3);
            boolean isKepler = kepler.isChecked();

            if( isPascal&& !isKepler && !isNewton){
                score++;
            }

            //Get the users input from the edittext and decide if its the correct one and increment score
            EditText artistInput = (EditText) findViewById(R.id.tech);
            String artistName = artistInput.getText().toString();

            if (artistName.equalsIgnoreCase("Johannes Gutenburg")) {
                score++;
            }




            TextView quizScore = (TextView) findViewById(R.id.mscore);
            percent = (score * 100) / total;
            incorrect = total - score;
            quizScore.setText(getResources().getString(R.string.congrats) + getResources().getString(R.string.scoreStat) + "\t" + percent + " %" + "\n" + getResources().getString(R.string.correct_answers) + "\t" + score + "\n" + getResources().getString(R.string.incorrect_answers) + "\t" + incorrect + "\n");


        } else {
            Toast.makeText(Technology.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT QUESTION", Toast.LENGTH_SHORT).show();
        }
    }
}
