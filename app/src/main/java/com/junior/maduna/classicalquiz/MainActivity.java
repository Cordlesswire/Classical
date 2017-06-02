package com.junior.maduna.classicalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openHealthACt(View view) {
        Intent i = new Intent(this, Health.class);
        startActivity(i);
    }

    public void openScienceACt(View view) {
        Intent i = new Intent(this, Science.class);
        startActivity(i);
    }

    public void openTechnologyACt(View view) {
        Intent i = new Intent(this, Technology.class);
        startActivity(i);
    }

    public void openMusicACt(View view) {
        Intent i = new Intent(this, Music.class);
        startActivity(i);
    }
}
