package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardviewOptions extends AppCompatActivity {

    Button classicCardview, retroCardview, moderCardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_options);

        classicCardview = findViewById(R.id.templateOneButton);
        retroCardview = findViewById(R.id.templateTwoButton);
        moderCardview = findViewById(R.id.templateThreeButton);
    }

    public void buttonFirstCardviewOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), CardViewOne.class);
        startActivity(i);
    }

    public void buttonSecondCardviewOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), CardViewTwo.class);
        startActivity(i);
    }

    public void buttonThirdCardviewOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), LoginOneCode.class);
        startActivity(i);
    }
}
