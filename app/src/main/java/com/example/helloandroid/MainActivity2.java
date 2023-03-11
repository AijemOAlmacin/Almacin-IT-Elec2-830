package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button FragmentA, FragmentB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentA = (Button)  findViewById(R.id.FragmentA);
        FragmentB = (Button) findViewById(R.id.FragmentB);

        Fragment



    }
}