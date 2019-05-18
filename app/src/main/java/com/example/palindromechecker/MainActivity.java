package com.example.palindromechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textStart;
    EditText textQuestion;
    TextView textResult;
    Button   buttonSubmit;

    boolean  isPalindrome = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textStart    = findViewById(R.id.text_start);
        textQuestion = findViewById(R.id.text_question);
        buttonSubmit = findViewById(R.id.button_submit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPalindrome == false) {

                    updateUI(textResult);

                } else
                Log.i("Palindrome", "The Palindrom button was clicked");

            }
        });
    }
}
