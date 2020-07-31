package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginOptions extends AppCompatActivity {

    Button ClassicTemplate, RetroTemplate, ModernTemplate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options);

        ClassicTemplate = findViewById(R.id.templateOneButton);
        RetroTemplate = findViewById(R.id.templateTwoButton);
        ModernTemplate = findViewById(R.id.templateThreeButton);
    }

    public void buttonFirstLoginOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), LoginOne.class);
        startActivity(i);
    }

    public void buttonSecondLoginOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), LoginTwo.class);
        startActivity(i);
    }

    public void buttonThirdLoginOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), LoginThree.class);
        startActivity(i);
    }
}
