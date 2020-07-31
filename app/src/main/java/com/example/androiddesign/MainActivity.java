package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login, profile, cardview, customList, resDrawables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.loginButton);
        profile = findViewById(R.id.profileButton);
        cardview = findViewById(R.id.cardviewButton);
        customList = findViewById(R.id.customListButton);
        resDrawables = findViewById(R.id.drawableButton);
    }

    public void buttonCreateLoginOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), LoginOptions.class);
        startActivity(i);
    }

    public void buttonCreateProfileOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), ProfileOptions.class);
        startActivity(i);
    }


    public void buttonListViewOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), ListViewOptions.class);
        startActivity(i);

    }

    public void buttonCardViewClick(View V) {
        Intent i = new Intent(getApplicationContext(), CardviewOptions.class);
        startActivity(i);
    }

    public void buttonAddColorOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), AddingDrawFiles.class);
        startActivity(i);

    }
}
