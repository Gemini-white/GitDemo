package com.example.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author cheng
 */
public class MainActivity extends AppCompatActivity {
    private int number = 0;
    private Button mButtonadd, mButtonSub;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonadd = findViewById(R.id.buttonApp);
        mTextView = findViewById(R.id.textView);
        mButtonSub = findViewById(R.id.buttonSub);

        mTextView.setText(String.valueOf(number));
        mButtonadd.setOnClickListener(v -> mTextView.setText(String.valueOf(++number)));
        mButtonSub.setOnClickListener(v -> mTextView.setText(String.valueOf(--number)));
    }
}