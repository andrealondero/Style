package com.example.styleout12;

import android.graphics.Color;

import java.util.Random;

public class BackgroundColorChanger {

    // put your color in hex below
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#e15258", // red
            "#f9845b", // orange
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
    };

    // Methods
    public int getColor() {
        String color;
        // Randomly number gen
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
