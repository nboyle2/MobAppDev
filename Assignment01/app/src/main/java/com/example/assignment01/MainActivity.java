package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button resetButton;
    Button calculateButton;
    EditText itemPriceEditText;
    RadioGroup saleRadioGroup;
    SeekBar customSeekBar;
    TextView customValue;
    TextView discountValue;
    TextView finalPriceValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton = findViewById(R.id.resetButton);
        calculateButton = findViewById(R.id.calculateButton);
        itemPriceEditText = findViewById(R.id.itemPriceText);
        saleRadioGroup = findViewById(R.id.saleRadioGroup);
        customSeekBar = findViewById(R.id.customSeekBar);
        customValue = findViewById(R.id.customValue);
        discountValue = findViewById(R.id.discountValue);
        finalPriceValue = findViewById(R.id.finalPriceValue);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemPriceEditText.setText("");
                saleRadioGroup.check(R.id.radio10);
                customSeekBar.setProgress(25);
                customValue.setText("25%");
                discountValue.setText(String.format("%.2f", 0.00));
                finalPriceValue.setText(String.format("%.2f", 0.00));
            }
        });

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(itemPriceEditText.getText().toString().isEmpty()) {
                    discountValue.setText(String.format("%.2f", 0.00));
                    finalPriceValue.setText(String.format("%.2f", 0.00));

                    Toast.makeText(MainActivity.this, "Enter Item Price", Toast.LENGTH_SHORT).show();
                }
                else {
                    int checkedId = saleRadioGroup.getCheckedRadioButtonId();
                    double salePercent = 0;

                    if(checkedId == R.id.radio10) {
                        salePercent = 0.10;
                    }
                    else if(checkedId == R.id.radio15) {
                        salePercent = 0.15;
                    }
                    else if(checkedId == R.id.radio18) {
                        salePercent = 0.18;
                    }
                    else if(checkedId == R.id.radioCustom) {
                        salePercent = customSeekBar.getProgress() * 0.01;
                    }

                    double initialPrice = Double.parseDouble(itemPriceEditText.getText().toString());
                    double discount = initialPrice * salePercent;
                    double finalPrice = initialPrice - discount;

                    discountValue.setText(String.format("%.2f", discount));
                    finalPriceValue.setText(String.format("%.2f", finalPrice));
                }
            }
        });

        customSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                customValue.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}