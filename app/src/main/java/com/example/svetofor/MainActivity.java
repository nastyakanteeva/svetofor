package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Integer colors= Color.argb(255,255,255,255);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null && savedInstanceState.containsKey("colors")){
            colors = savedInstanceState.getInt("colors");
            ((LinearLayout)findViewById(R.id.LL_color)).setBackgroundColor(colors);
        }
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("colors")){
            colors = savedInstanceState.getInt("colors");
            ((LinearLayout)findViewById(R.id.LL_color)).setBackgroundColor(colors);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("colors", colors);
    }
    public void onClikBtnAddPhone(View view){
        colors= Color.argb(255,255,1,1);
        LinearLayout colorView = (LinearLayout)findViewById(R.id.LL_color);
        colorView.setBackgroundColor(colors);
    }
    public void onClikBtnAddPhone_2(View view){
        colors= Color.argb(255,255,226,34);
        LinearLayout colorView = (LinearLayout)findViewById(R.id.LL_color);
        colorView.setBackgroundColor(colors);
    }
    public void onClikBtnAddPhone_3(View view){
        colors= Color.argb(255,1,255,1);
        LinearLayout colorView = (LinearLayout)findViewById(R.id.LL_color);
        colorView.setBackgroundColor(colors);
    }}
