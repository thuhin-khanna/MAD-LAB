package com.example.sdcard;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2, et3;
    Button btn1, btn2;
    String filename, student_name, CGPA;
    String[] text = new String[]{"",""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editTextTextPersonName); // filename
        et2 = findViewById(R.id.editTextTextPersonName2); // student name
        et3 = findViewById(R.id.editTextTextPersonName3); // CGPA
        btn1 = findViewById(R.id.button); // write
        btn2 = findViewById(R.id.button2); // read
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    public void onClick(View view) {
        if(view==btn1) {
            filename = et1.getText().toString();
            student_name = et2.getText().toString();
            CGPA = et3.getText().toString();
            try {
                FileOutputStream writer = openFileOutput(filename, Context.MODE_PRIVATE);
                writer.write(student_name.getBytes());
                writer.write("\n".getBytes());
                writer.write(CGPA.getBytes());
                writer.flush();
                writer.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        if(view==btn2){
            filename = et1.getText().toString();
            try {
                FileInputStream reader = openFileInput(filename);
                int x,i=0;
                while((x = reader.read())!=-1){
                    if((char)x=='\n') i++;
                    text[i]+=(char)x;
                }
                et2.setText(text[0]);
                et3.setText(text[1]);
                reader.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}