package com.example.typefacedemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (TextView) findViewById(R.id.testtext);

        Typeface face = Typeface.createFromAsset(
                getAssets(),
                "fonts/android.ttf");
        text.setTypeface(face);
    }
}
