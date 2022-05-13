package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(this);
    }

    public void onClick(View view) {

        if(view==btn1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Proceed to Login ?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        openActivity2();
                    }
                })
                .setNegativeButton("Cancel", null);
            AlertDialog alert = builder.create();
            alert.show();
        }
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}