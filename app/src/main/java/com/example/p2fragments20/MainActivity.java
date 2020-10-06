package com.example.p2fragments20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.p2fragments20.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());


    }
}