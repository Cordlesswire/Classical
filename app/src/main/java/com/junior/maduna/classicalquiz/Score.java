package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class Score extends AppCompatActivity {

    int correctAnswers = 0;
    int wrongAnswers = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        // keyboard doesn't show when activity starts
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


    }




        //Display the overall percentage of the Game and have a certain image pop-up if the user has reached a certain level




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
