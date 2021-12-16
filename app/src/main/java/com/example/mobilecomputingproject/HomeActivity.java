package com.example.mobilecomputingproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mobilecomputingproject.databinding.ActivityHomeBinding;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    private Button addFoodBtn, addRecordBtn, viewFoodBtn;
    private TextView statusTv;
    private NestedScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addFoodBtn = binding.addFoodBtn;
        addRecordBtn = binding.addRecordBtn;
        viewFoodBtn = binding.viewFoodBtn;
        statusTv = binding.statusTv;
        scrollView = binding.list;

//        scrollView.addView();
    }


    public void addFood(View view) {
        startActivity(new Intent(this, AddFoodDetailsActivity.class));
    }

    public void addRecord(View view) {
        startActivity(new Intent(this, NewRecordActivity.class));
    }

    public void viewFood(View view) {
        startActivity(new Intent(this, FoodListActivity.class));

    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(this, LoginActivity.class));
        finish();

    }
}