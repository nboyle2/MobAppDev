/*
    Assignment 03

    DemographicActivity.java

    Group 1: Nicholas Boyle, Shawntraree Lucas
 */

package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemographicActivity extends AppCompatActivity {
    Button educationSelectButton;
    Button livingSelectButton;
    Button incomeSelectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demographic);

        educationSelectButton = findViewById(R.id.educationSelectButton);
        livingSelectButton = findViewById(R.id.livingSelectButton);
        incomeSelectButton = findViewById(R.id.incomeSelectButton);

        educationSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View education) {
                Intent intent = new Intent(DemographicActivity.this, SelectEducationActivity.class);
                startActivity(intent);

            }
        });

        livingSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View living) {
                Intent intent = new Intent(DemographicActivity.this, SelectLivingStatusActivity.class);
                startActivity(intent);

            }
        });

        incomeSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View income) {
                Intent intent = new Intent(DemographicActivity.this, SelectIncomeActvity.class);
                startActivity(intent);

            }
        });
    }
}