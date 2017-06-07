package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {

    int correctAnswers = 0;
    int wrongAnswers = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        // keyboard doesn't show when app starts
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


        score = 0;
        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.healthRadioGroupOne);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId1 = radioGQ1.getCheckedRadioButtonId();
        //Use if statements to respond based on whether
        //it is the id of the correct answer.
        if (solutionId1 == R.id.q1_1) {
            score++;
            displayScore(score);
        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.healthRadioGroupTwo);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId2 = radioGQ1.getCheckedRadioButtonId();
        if (solutionId2 == R.id.q2_3) {
            score++;
            displayScore(score);
        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ3 = (RadioGroup) findViewById(R.id.healthRadioGroupThree);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId3 = radioGQ1.getCheckedRadioButtonId();
        if (solutionId3 == R.id.q3_3) {
            score++;
            displayScore(score);

            if (score >= 10) {
                Toast.makeText(Score.this,
                        "YOU SCORED A PERFECT " + score + " OUT OF 10.", Toast.LENGTH_LONG).show();

            } else if (score < 10) {
                Toast.makeText(Score.this,
                        "You scored " + score + " out of 10.", Toast.LENGTH_LONG).show();
            }


        }


    }


    //Displaying the Score
    private void displayScore(int score) {
        TextView display_score = (TextView) findViewById(R.id.display_score);
        display_score.setText("" + score);
    }



     /*Eish there are actualy two submit buttons at the moment..one to submit score one to submit username,thus make one submitScore the other submitName
     * This will make coding easier when the code starts getting heavy, the below submit is to get the users name
     */

    /**
     * This method is called when the order button is clicked.
     */
    public void submitName(View view) {
        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.user_name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();


        /**Took this code from the just Java App...modify it so you can use with the radioButtons a user clicks so that we know if the user hasn't submitted an anser to make the screen visible or not
         * // Figure out if the user wants choclate topping
         CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
         boolean hasChocolate = chocolateCheckBox.isChecked();
         */


        //Display the overall percentage of the Game and have a certain image pop-up if the user has reached a certain level

    }




       /*
     *  ---- BUTTON - REPLAY APP ----
     */

    public void replayGame(View view) {
        correctAnswers = 0;
        wrongAnswers = 0;

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}
