package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public  void makeToast(String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();

    }

    public void guessFunction(View view) {

        EditText editText = findViewById(R.id.editTextNumber);

        int guessInt = Integer.parseInt(editText.getText().toString());

        if(guessInt > randomNumber) {

            makeToast("Lower !! ");

        } else if (guessInt < randomNumber) {

            makeToast("Higher !! ");

        } else {

            makeToast("That's Right !!  TRY AGAIN......");

            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;

    }
}