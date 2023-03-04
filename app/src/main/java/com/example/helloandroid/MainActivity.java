package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteActionProvider;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Aijem Gwapo");
        Log.d(TAG, "dsfsfasf");
        Log.i(TAG, "sfsfasdfasf");
        Log.w(TAG, "dsfsadfasdfgdfgds");
        Log.e(TAG, "dfsfasferqwer");
    Button button = (Button) findViewById(R.id.buttonMain);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Log.i(TAG, "This button is clicked");
    }
});
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    Log.i(TAG, "Button is clicked");
    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
    }
});
    }
}