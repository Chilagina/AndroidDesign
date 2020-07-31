package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileOptions extends AppCompatActivity {

    Button classicProfile, retroProfile, modernProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_options);

        classicProfile = findViewById(R.id.templateOneButton);
        retroProfile = findViewById(R.id.templateTwoButton);
        modernProfile = findViewById(R.id.templateThreeButton);
    }

    public void buttonFirstProfileOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), ProfileOne.class);
        startActivity(i);
    }

    public void buttonSecondProfileOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), ProfileTwo.class);
        startActivity(i);
    }

    public void buttonThreeProfileOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), ProfileThree.class);
        startActivity(i);
    }
}

