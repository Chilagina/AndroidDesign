package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginOneCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_one_code);

        TextView mLoginOneCodeWindow =(TextView)findViewById(R.id.loginCodeOneWindow);

        StringBuilder stringBuilder = new StringBuilder();

        String someMessage = " This is some message that I am writing just to test stuff. ";

        for (int i = 0; i < 100; i++){
            stringBuilder.append(someMessage);
        }
        mLoginOneCodeWindow.setText(stringBuilder.toString());
    }
}
