package com.example.graphicalprimitives;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    myCanvas mc;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mc = new myCanvas(this);
        setContentView(mc);
    }

    private class myCanvas extends View {

        Paint paint = new Paint();

        public myCanvas(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            super.onDraw(canvas);

            paint.setColor(Color.RED);
            paint.setTextSize(65);
            canvas.drawPaint(paint);

            paint.setColor(Color.CYAN);
            canvas.drawText("Circle",100,420, paint);
            canvas.drawCircle(200, 200, 150, paint);

            paint.setColor(Color.CYAN);
            canvas.drawText("Rectangle",55,1600, paint);
            canvas.drawRect(55, 450, 350, 1500, paint);

            paint.setColor(Color.YELLOW);
            canvas.drawText("Square",640,420, paint);
            canvas.drawRect(600, 50, 900, 350, paint);

            paint.setColor(Color.YELLOW);
            canvas.drawText("Line",710,1600, paint);
            paint.setStrokeWidth(5);
            canvas.drawLine(750, 450, 750, 1500, paint);
        }
    }
}