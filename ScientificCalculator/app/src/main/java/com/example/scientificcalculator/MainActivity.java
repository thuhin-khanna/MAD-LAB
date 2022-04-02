package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2, num3;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
    }

    //@Override
    public void onClick(View view){

        if(view==btn1){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            float n3 = n1 + n2;
            num3.setText(String.valueOf(n3));
        }
        if(view==btn2){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            float n3 = n1 - n2;
            num3.setText(String.valueOf(n3));
        }
        if(view==btn3){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            float n3 = n1*n2;
            num3.setText(String.valueOf(n3));
        }
        if(view==btn4){
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            float n3 = n1/n2;
            num3.setText(String.valueOf(n3));
        }
        if(view==btn5){
            //pow
            float n1 = Float.parseFloat(num1.getText().toString());
            float n2 = Float.parseFloat(num2.getText().toString());
            double n3 = Math.pow(n1,n2);
            num3.setText(String.valueOf(n3));
        }
        if(view==btn6){
            //sqrt
            float n1 = Float.parseFloat(num1.getText().toString());
            double n3 = Math.sqrt(n1);
            num3.setText(String.valueOf(n3));
        }
        if(view==btn7){
            //mod
            Float n1 = Float.parseFloat(num1.getText().toString());
            Float n2 = Float.parseFloat(num2.getText().toString());
            float n3 = n1%n2;
            num3.setText(String.valueOf(n3));
        }
        if(view==btn8){
            //ln - log
            float n1 = Float.parseFloat(num1.getText().toString());
            double n3 = Math.log(n1);
            num3.setText(String.valueOf(n3));
        }
        if(view==btn9){
            //sin
            float n1 = Float.parseFloat(num1.getText().toString());
            double n3 = Math.sin(n1);
            num3.setText(String.valueOf(n3));
        }
        if(view==btn10){
            //cos
            float n1 = Float.parseFloat(num1.getText().toString());
            double n3 = Math.cos(n1);
            num3.setText(String.valueOf(n3));
        }
        if(view==btn11){
            //tan
            float n1 = Float.parseFloat(num1.getText().toString());
            double n3 = Math.tan(n1);
            num3.setText(String.valueOf(n3));
        }
        if(view==btn12){
            //log - log10
            float n1 = Float.parseFloat(num1.getText().toString());
            double n3 = Math.log10(n1);
            num3.setText(String.valueOf(n3));
        }
    }
}