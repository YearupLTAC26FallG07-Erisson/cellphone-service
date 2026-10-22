package com.pluralsight;

public class Dice {
    public int roll() {
        int minValue = 1;
        int maxValue = 6;

        // Algorithm provided in the prompt to get a random number between 1 and 6
        return (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}


