package com.github.lukovitch.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.mainGoButton);
        EditText text = findViewById(R.id.mainName);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), GreetingActivity.class);
                String name = text.getText().toString();
                intent.putExtra("t", name);
                view.getContext().startActivity(intent);
            }
        });
    }
}