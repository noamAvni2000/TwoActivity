package com.example.twoactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button sendButton;
    private TextView textView;
    private Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        sendButton = findViewById(R.id.sendButton);
        textView = findViewById(R.id.textView);
        closeButton = findViewById(R.id.closeButton);

        textView.setVisibility(View.GONE);
        closeButton.setVisibility(View.GONE);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString().trim();

                if (!userInput.isEmpty()) {
                    textView.setText(userInput);

                    textView.setVisibility(View.VISIBLE);
                    closeButton.setVisibility(View.VISIBLE);
                }
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

