package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class IdentificationActivity extends AppCompatActivity {
    Button nextButton;
    EditText nameEditText;
    EditText emailEditText;
    RadioGroup roleRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        nextButton = findViewById(R.id.nextButton);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        roleRadioGroup = findViewById(R.id.roleRadioGroup);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameEditText.getText().toString().isEmpty()) {
                    Toast.makeText(IdentificationActivity.this, "Name is required", Toast.LENGTH_SHORT).show();
                }
                else if(emailEditText.getText().toString().isEmpty()) {
                    Toast.makeText(IdentificationActivity.this, "Email is required", Toast.LENGTH_SHORT).show();
                }
                else {
                    int checked = roleRadioGroup.getCheckedRadioButtonId();

                    String role = "";

                    if(checked == R.id.studentRadioButton) {
                        role = "Student";
                    }
                    else if(checked == R.id.employeeRadioButton) {
                        role = "Employee";
                    }
                    else if(checked == R.id.otherRadioButton) {
                        role = "Other";
                    }

                    Intent intent = new Intent(IdentificationActivity.this, DemographicActivity.class);
                    intent.putExtra("RESPONSE", new Response(nameEditText.getText().toString(), emailEditText.getText().toString(), role));

                    startActivity(intent);
                }
            }
        });
    }
}