package com.example.numberguessinggamemvvm.model;
import androidx.annotation.Nullable;

public class NumberGuessingGame {
    @Nullable
    private RandomNumber randomNumberLeft, randomNumberRight;
    @Nullable
    private Score score;

    public NumberGuessingGame() {
        randomNumberLeft = new RandomNumber();
        randomNumberRight = new RandomNumber();
        score = new Score();

        roll();
    }
    @Nullable
    public int getRandomNumberLeft() {
        return randomNumberLeft.getRandomNumber();
    }
    @Nullable
    public int getRandomNumberRight() {
        return randomNumberRight.getRandomNumber();
    }
    @Nullable
    public int getScore() {
        return score.getScore();
    }

    public void check(int btn) {
        if (btn == 0) {
            if(randomNumberLeft.getRandomNumber() > randomNumberRight.getRandomNumber()) {
                score.setScore(score.getScore()+1);
            }
            else {
                score.setScore(score.getScore()-1);
            }
        }

        if (btn == 1) {
            if(randomNumberRight.getRandomNumber() > randomNumberLeft.getRandomNumber()) {
                score.setScore(score.getScore()+1);
            }
            else {
                score.setScore(score.getScore()-1);
            }
        }
    }

    public void roll() {
        do {
            randomNumberRight.setRandomNumber();
            randomNumberLeft.setRandomNumber();
        } while(randomNumberRight.getRandomNumber() == randomNumberLeft.getRandomNumber());

    }
}
