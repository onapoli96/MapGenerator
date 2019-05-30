package com.example.mapgenerator;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer matrix[][] = new Integer[4][4];
        for(int i = 0 ; i < 4 ; i ++){
            for(int j= 0 ; j < 4 ; j++){
                if(j%2==0 && i%2!=0){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }

        map = new MyCanvas(this);
        ((MyCanvas) map).setMatrix(matrix);
        /*int id = R.id.contenuto;
        map.setId(id);*/
        System.out.println(map.getLayoutParams());
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.centrale);
        layout.addView(map);





    }


}
