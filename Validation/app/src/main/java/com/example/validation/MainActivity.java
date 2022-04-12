package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    EditText et1,et2;
    String usn, pwd;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        btn1.setOnClickListener(this);
    }

    public void onClick(View view){

        if(view==btn1) {

            usn = et1.getText().toString();
            pwd = et2.getText().toString();

            if(usn.length()==0 && pwd.length()==0){
                t = Toast.makeText(getApplicationContext(), "All Fields Empty", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(usn.length()==0){
                t = Toast.makeText(getApplicationContext(), "Username Should not be Empty", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(pwd.length()==0){
                t = Toast.makeText(getApplicationContext(), "Password Should not be Empty", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(pwd.length()<4){
                t = Toast.makeText(getApplicationContext(), "Password is too short", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(pwd.length()>4){
                t = Toast.makeText(getApplicationContext(), "Password is too long", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(!pwd.matches("[0-9]+")){
                t = Toast.makeText(getApplicationContext(), "Password should be numbers only", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(!usn.matches("[a-zA-z]+")){
                t = Toast.makeText(getApplicationContext(), "Username should be alphabets only", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(usn.matches("[a-zA-z]+") && pwd.length()==4 && pwd.matches("[0-9]+")){
                t = Toast.makeText(getApplicationContext(), "Validation Successful", Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
}