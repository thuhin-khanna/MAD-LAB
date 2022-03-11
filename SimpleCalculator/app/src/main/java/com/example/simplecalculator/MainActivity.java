package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2, num3;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.editTextNumberDecimal1);
        num2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        num3 = (EditText) findViewById(R.id.editTextNumberDecimal3);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
    }

    //@Override
    public void onClick(View view){

        if(view==btn1){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            Float n3 = n1+n2;
            num3.setText(n3.toString());
        }
        if(view==btn2){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            Float n3 = n1-n2;
            num3.setText(n3.toString());
        }
        if(view==btn3){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            Float n3 = n1*n2;
            num3.setText(n3.toString());
        }
        if(view==btn4){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            Float n3 = n1/n2;
            num3.setText(n3.toString());
        }
    }
}