package com.example.numberguessinggamemvvm.viewmodel;


import android.text.TextUtils;
import android.util.Patterns;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.numberguessinggamemvvm.model.NumberGuessingGame;

import java.util.Observable;

public class NumberGuessingGameViewModel extends BaseObservable {
    private NumberGuessingGame numberGuessingGame;
    @Bindable
    public ObservableField<String> numberRight, numberLeft, score;

    public NumberGuessingGameViewModel() {
        numberGuessingGame = new NumberGuessingGame();
        numberRight = new ObservableField<>();
        numberLeft = new ObservableField<>();
        score = new ObservableField<>();

        numberRight.set(""+ numberGuessingGame.getRandomNumberRight());
        numberLeft.set(""+ numberGuessingGame.getRandomNumberLeft());
        score.set("Score: "+ numberGuessingGame.getScore());
    }

    public void onButtonClicked(int button) {
        numberGuessingGame.check(button);
        numberGuessingGame.roll();
        numberRight.set(""+ numberGuessingGame.getRandomNumberRight());
        numberLeft.set(""+ numberGuessingGame.getRandomNumberLeft());
        score.set("Score: "+ numberGuessingGame.getScore());
    }
}
