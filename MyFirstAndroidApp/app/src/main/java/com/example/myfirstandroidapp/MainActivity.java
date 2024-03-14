package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counterLabel;
    private Button counterButton;
    private int currentCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterLabel = findViewById(R.id.counterLabel);
        counterButton = findViewById(R.id.countUpButton);

        counterLabel.setText(currentCount);

        counterButton.setOnClickListener((v) -> {
            currentCount++;
            counterLabel.setText(currentCount);
        });
    }
}