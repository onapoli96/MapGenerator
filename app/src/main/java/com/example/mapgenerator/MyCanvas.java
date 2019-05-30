package com.example.mapgenerator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyCanvas extends View {
    private Paint road;
    private Paint wall;
    private Integer matrix[][];
    private Context context;

    public MyCanvas(Context context) {
        super(context);
        this.context = context;

        road = new Paint();
        wall = new Paint();

    }

    public void setMatrix(Integer matrix[][]){
        this.matrix = matrix;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        wall.setColor(Color.RED);
        wall.setStrokeWidth(4);
        road.setColor(Color.BLUE);
        road.setStrokeWidth(4);
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(matrix[i][j] == 1){
                    canvas.drawRect(j*100,i*100, (j+1)*100, (i+1)*100,wall);

                }
                else{
                    canvas.drawRect(j*100,i*100, (j+1)*100, (i+1)*100,road);
                }
            }
        }
    }
}
