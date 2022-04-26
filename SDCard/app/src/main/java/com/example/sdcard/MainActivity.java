package com.example.sdcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    Button btn1, btn2;
    String filename, student_name, CGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editTextTextPersonName); // filename
        et2 = findViewById(R.id.editTextTextPersonName2); // student name
        et3 = findViewById(R.id.editTextTextPersonName3); // CGPA

        btn1 = findViewById(R.id.button); // write
        btn2 = findViewById(R.id.button2); // read

    }

    public void onClick(View view){

        if(view==btn1){

            filename = et1.getText().toString();
            student_name = et2.getText().toString();
            CGPA = et3.getText().toString();

            try {
                FileWriter Writer = new FileWriter(filename);
                Writer.write("Name : "+student_name+"\n"+"CGPA : "+CGPA);
                Writer.close();
                System.out.println("Success");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}