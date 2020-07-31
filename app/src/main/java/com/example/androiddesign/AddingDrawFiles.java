package com.example.androiddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddingDrawFiles extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_draw_files);
    }

    public void buttonTutorialOnClick(View V) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/watch?v=I5_SqDRWmrk"));
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }
}
