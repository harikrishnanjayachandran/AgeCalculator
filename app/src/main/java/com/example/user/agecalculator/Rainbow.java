package com.example.user.agecalculator;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by User on 29-10-2017.
 */

public class Rainbow {
    private String[] colors= {
            "#39add1",//light blue
            "#3079ab",//dark blue
            "#c25975",//mauve
            "#00ff00",//blue
    };
    int getcolour()
    {
        Random randomgenerator=new Random();
        int randomnumber=randomgenerator.nextInt(colors.length);
        int color= Color.parseColor(colors[randomnumber]);
        return color;
    }



}
