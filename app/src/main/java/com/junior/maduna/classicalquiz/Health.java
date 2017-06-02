package com.junior.maduna.classicalquiz;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Health extends AppCompatActivity {

    private int mAnimationDuration = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }

     /*
     *  Might have to get the user to enter their name before the or a variable that will control the If statement thats
     * going to create a if statement to control the visibility and non visibility of the app, using the variable answer not null meaning that the user is not trying to just click through the screens
     */


     /*Just a temporary method just to see how the app runs currently...So if there are UI errors I can fix them
      *
      */


         public void questionOne(View view) {
             final View hideQuestionOne = findViewById(R.id.linearlayout_question1);
             View showQuestionTwo = findViewById(R.id.linearlayout_question2);
             showQuestionTwo.setVisibility(View.GONE);
             mAnimationDuration = getResources().getInteger(android.R.integer.config_mediumAnimTime);

             // set the appearing view to 0% opacity but visible, so that it is visible (but fully transparent) during the animation
             showQuestionTwo.setAlpha(0f);
             showQuestionTwo.setVisibility(View.VISIBLE);
             hideQuestionOne.setVisibility(View.GONE);



         }

}