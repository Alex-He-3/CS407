package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void clickAdd(View view) {
        float first = Float.parseFloat(((EditText) findViewById(R.id.numberOne)).getText().toString());
        float second =Float.parseFloat(((EditText) findViewById(R.id.numberTwo)).getText().toString());

        goToActivity(""+ (first + second));
    }

    public void clickMinus(View view) {
        float first = Float.parseFloat(((EditText) findViewById(R.id.numberOne)).getText().toString());
        float second = Float.parseFloat(((EditText) findViewById(R.id.numberTwo)).getText().toString());

        goToActivity(""+ (first - second));
    }

    public void clickMulti(View view) {
        float first = Float.parseFloat(((EditText) findViewById(R.id.numberOne)).getText().toString());
        float second = Float.parseFloat(((EditText) findViewById(R.id.numberTwo)).getText().toString());

        goToActivity(""+ (first * second));
    }

    public void clickDivided(View view) {
        float first = Float.parseFloat(((EditText) findViewById(R.id.numberOne)).getText().toString());
        float second = Float.parseFloat(((EditText) findViewById(R.id.numberTwo)).getText().toString());

        if (second == 0) {
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            return;
        } else {
            goToActivity(""+ (first / second));
        }
    }
}