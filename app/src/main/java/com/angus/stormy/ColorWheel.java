package com.angus.stormy;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Angus on 07/01/2018.
 */

 public class ColorWheel {
    int randomNumber;
    int color;

//    public String[] colors = {
//            "#39add1", // light blue
//            "#3079ab", // dark blue
//            "#c25975", // mauve
//            "#e15258", // red
//            "#f9845b", // orange
//            "#838cc7", // lavender
//            "#7d669e", // purple
//            "#53bbb4", // aqua
//            "#51b46d", // green
//            "#e0ab18", // mustard
//            "#637a91", // dark gray
//            "#f092b0", // pink
//            "#b7c0c7"  // light gray
//    };

    // Members

    // Methods
//    public int getColor(){
//        Random randomGenerator = new Random();
//        randomNumber = randomGenerator.nextInt(colors.length);
//        color = Color.parseColor(colors[randomNumber]);
//
//        return color;
//    }
//
//    public int getDarkenColor() {
//        int r = Color.red(color);
//        int b = Color.blue(color);
//        int g = Color.green(color);
//
//        int darkerColor =  Color.rgb((int)(r*.9), (int)(g*.9), (int)(b*.9));
//        return darkerColor;
//    }

     public int makeDarkenColor(int pColor) {
        int r = Color.red(pColor);
        int b = Color.blue(pColor);
        int g = Color.green(pColor);

        int darkerColor =  Color.rgb((int)(r*.9), (int)(g*.9), (int)(b*.9));
        return darkerColor;
    }

}