package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

//        Grabbing the user input and saving in the variable
        EditText dollarValue = (EditText) findViewById(R.id.dollarValue);
        double conversionRate = 164.3;
        Double dollarAmount = Double.parseDouble(dollarValue.getText().toString());
        Double pkrAmount = dollarAmount * conversionRate;

//        Showing Toast on the screen with content of the text field
        Toast.makeText(MainActivity.this, "PKR " + String.format("%.2f", pkrAmount), Toast.LENGTH_SHORT).show();

        Log.i("Info", "Button Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}