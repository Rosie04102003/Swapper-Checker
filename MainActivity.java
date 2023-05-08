package com.example.fomp_05handson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt1;
    EditText txt2;
    AppCompatButton btn1;
    AppCompatButton btn2;
    String textCont1;
    String textCont2;
    String checkText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.swapButton);
        btn2 = findViewById(R.id.checkButton);
        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textCont1 = txt1.getText().toString();
                textCont2 = txt2.getText().toString();

                txt1.setText(textCont2);
                txt2.setText(textCont1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textCont1 = txt1.getText().toString();
                textCont2 = txt2.getText().toString();
                
                if (textCont1.equalsIgnoreCase(textCont2)){
                    checkText = "Same";
                } else {
                    checkText = "Not the same";
                }

                Intent i = new Intent(getApplicationContext(), MyMessage.class);
                i.putExtra("passedText", checkText);
                startActivity(i);
            }
        });
    }
}