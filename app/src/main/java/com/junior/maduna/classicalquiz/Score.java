package com.junior.maduna.classicalquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    int correctAnswers = 0;
    int wrongAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
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






    }


       /*
     *  ---- BUTTON - REPLAY APP ----
     */

    public void replayApp(View view){
        correctAnswers = 0;
        wrongAnswers = 0;
        setContentView(R.layout.activity_main);

    }



   /*
     * When Exit Button is clicked the App Exits
     *    Its not user friendly to just exit an app so ask the user first if they want to exit using a Notification
     */
   public void exitApp(View view){
       finish();
       System.exit(0);
   }

}
