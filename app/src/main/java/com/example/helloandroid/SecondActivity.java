package com.example.helloandroid;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = (Button) findViewById(R.id.buttonSecond);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i(TAG, "Button is clicked");
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);


        }
    });
    }
}