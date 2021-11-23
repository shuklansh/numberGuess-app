package com.jadeapss.binarysearch;

import static android.media.CamcorderProfile.get;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnum;

    public void guessedvalue() {
        Random rand = new Random();
        randomnum = rand.nextInt(20) + 1;

    }

    public void searchBinary(View view) {
        EditText userValue = (EditText) findViewById(R.id.editText);
        int userValueInt = Integer.parseInt(userValue.getText().toString());
        String message;

        if (randomnum < userValueInt) {
            message = "lower";
        } else if (randomnum > userValueInt) {
            message = "higher";
        } else {
            message = "correct!";
            guessedvalue();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guessedvalue();


    }
}