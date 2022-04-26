package com.example.numberguessinggamemvvm.model;

import java.util.Random;

public class RandomNumber {
    private final int RANDOMMAX = 9;
    private int rNum;
    private Random r = new Random();

    public RandomNumber() {
       setRandomNumber();
    }
    public int getRandomNumber() {
        return rNum;
    }
    public void setRandomNumber() {
        this.rNum = r.nextInt(RANDOMMAX);
    }
    public void reroll() {
        this.rNum = r.nextInt(RANDOMMAX);
    }
}
