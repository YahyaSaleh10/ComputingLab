package com.example.mobilecomputingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mobilecomputingproject.databinding.ActivityFoodListBinding;

public class FoodListActivity extends AppCompatActivity {
    private ActivityFoodListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFoodListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}