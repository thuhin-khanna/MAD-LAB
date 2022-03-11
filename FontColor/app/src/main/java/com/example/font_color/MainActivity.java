package com.example.font_color;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1;
    Button btn1, btn2, btn3;
    ConstraintLayout cl1;
    int color=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        cl1 = (ConstraintLayout) findViewById(R.id.cl1);

        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {

        if(view==btn1){
            int text_size= (int) tv1.getTextSize();
            if(text_size<50){ tv1.setTextSize(text_size+5); }
            else if(text_size>=50){ tv1.setTextSize(5); }
        }

        if(view==btn2){
            switch(tv1.getCurrentTextColor()){
                case Color.RED: tv1.setTextColor( Color.GREEN );
                    break;
                case Color.GREEN: tv1.setTextColor( Color.BLUE );
                    break;
                default: tv1.setTextColor( Color.RED );
            }
        }
        if(view==btn3){
            cl1.setBackgroundColor(Color.BLUE);
            switch (color) {
                case 1: {
                    cl1.setBackgroundColor(Color.RED);
                    color = 2;
                }
                break;
                case 2: {
                    cl1.setBackgroundColor(Color.GREEN);
                    color = 3;
                }
                break;
                case 3: {
                    cl1.setBackgroundColor(Color.BLUE);
                    color = 0;
                }
                break;
                default: {
                    cl1.setBackgroundColor(Color.WHITE);
                    color = 1;
                }
            }
        }
    }
}