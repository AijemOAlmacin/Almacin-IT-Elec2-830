package com.example.myapplication3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Aijem Almacin");

        actionBar.setSubtitle("BSIT");

        actionBar.setIcon(android.R.drawable.sym_def_app_icon);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
 @Override
public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
 }
 @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.dropdown_menu:
                showAlertDialog();
                break;

            case R.id.search:
                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.show(getSupportFragmentManager(),"My Fragment");
                break;
            case R.id.copy:
                Toast.makeText(this, "This is a Toast!!!!!", Toast.LENGTH_SHORT).show();
                break;


        }
     return super.onOptionsItemSelected(item);
 }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aijem Almacin")
                .setMessage("BSIT");
        builder.setPositiveButton("Yeah", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}