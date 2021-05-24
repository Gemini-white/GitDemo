package com.example.gitdemo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author cheng 韩志城
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

        if (savedInstanceState != null) {
            number = savedInstanceState.getInt("NUMBER");
        }

        mTextView.setText(String.valueOf(number));
        mButtonadd.setOnClickListener(v -> mTextView.setText(String.valueOf(++number)));
        mButtonSub.setOnClickListener(v -> mTextView.setText(String.valueOf(--number)));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("NUMBER", number);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.zero: {
                mTextView.setText(String.valueOf(number = 0));
                break;
            }
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}