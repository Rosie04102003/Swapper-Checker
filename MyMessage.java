package com.example.fomp_05handson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessage extends AppCompatActivity {
    TextView passedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message);

        passedText = findViewById(R.id.passedText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        passedText.setText(getIntent().getStringExtra("passedText"));
    }
}