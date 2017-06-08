package com.junior.maduna.classicalquiz;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Music extends AppCompatActivity {

    float score = 0;
    float total = 3;
    float percent = 0;
    float incorrect = 0;


    Editable userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        // keyboard doesn't show when activity starts
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

    }
//Replay game
    public void replayGame(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    //Find out to check if has selected a choice or not and if not display a toast message telling the user to select something before moving on
    public void questionTwo(View view) {
        RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.mradioGroupOne);
        //check if the user has selected something if not dont go to the next question
        if (radioGQ1.getCheckedRadioButtonId() != -1) {
            ScrollView layout = (ScrollView) findViewById(R.id.question2);
            ScrollView layout1 = (ScrollView) findViewById(R.id.question1);
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(Music.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT QUESTION", Toast.LENGTH_SHORT).show();
        }

    }


    public void questionThree(View view) {
        RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.mradioGroupTwo);
        //check if the user has selected something if not dont go to the next question
        if (radioGQ2.getCheckedRadioButtonId() != -1) {
            ScrollView layout = (ScrollView) findViewById(R.id.question3);
            ScrollView layout1 = (ScrollView) findViewById(R.id.question2);
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(Music.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT QUESTION", Toast.LENGTH_SHORT).show();
        }
    }





    //New Score method
    public void scoreDisplay(View view) {



        RadioGroup radioGQ3 = (RadioGroup) findViewById(R.id.mradioGroupThree);
        //check if the user has selected something if not dont go to the next question
        if (radioGQ3.getCheckedRadioButtonId() != -1) {
            ScrollView layout = (ScrollView) findViewById(R.id.musicScore);
            ScrollView layout1 = (ScrollView) findViewById(R.id.question3);
            layout1.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);


            EditText artistInput = (EditText) findViewById(R.id.userName);
            String username = artistInput.getText().toString();


            //Calculating the score
            if (radioGQ3.getCheckedRadioButtonId() != -1) {
                //Access the RadioGroup view and save it to a variable.
                //Get the id of the RadioButton that is checked and save it as an integer variable.
                RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.mradioGroupOne);
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
                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId3 = radioGQ3.getCheckedRadioButtonId();
                if (solutionId3 == R.id.qm3_3) {
                    score++;

                }

            }

            TextView quizScore = (TextView) findViewById(R.id.mscore);
            percent = (score * 100) / total;
            incorrect = total - score;
            quizScore.setText( getResources().getString(R.string.congrats) + getResources().getString(R.string.scoreStat) + "\t" + percent + " %" + "\n"+ getResources().getString(R.string.correct_answers) + "\t" + score + "\n" + getResources().getString(R.string.incorrect_answers) + "\t" + incorrect + "\n");




        } else {
            Toast.makeText(Music.this,
                    "PLEASE SELECT AN OPTION BEFORE MOVING ON TO THE NEXT QUESTION", Toast.LENGTH_SHORT).show();
        }
    }

}
