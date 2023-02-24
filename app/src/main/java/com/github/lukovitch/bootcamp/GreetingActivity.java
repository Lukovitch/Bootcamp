package com.github.lukovitch.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent parent = getIntent();
        String text = "Hello " + parent.getStringExtra("t") + "!";
        TextView view = findViewById(R.id.greetingMessage);
        view.setText(text);
    }
}