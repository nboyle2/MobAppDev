/*
    Assignment 03

    DemographicActivity.java

    Group 1: Nicholas Boyle, Shawntraree Lucas
 */

package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemographicActivity extends AppCompatActivity {
    Button educationSelectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demographic);

        educationSelectButton = findViewById(R.id.educationSelectButton);

        educationSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}