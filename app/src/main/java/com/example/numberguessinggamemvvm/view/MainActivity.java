package com.example.numberguessinggamemvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.numberguessinggamemvvm.R;
import com.example.numberguessinggamemvvm.databinding.ActivityMainBinding;
import com.example.numberguessinggamemvvm.viewmodel.NumberGuessingGameViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new NumberGuessingGameViewModel());
        activityMainBinding.executePendingBindings();
    }
}