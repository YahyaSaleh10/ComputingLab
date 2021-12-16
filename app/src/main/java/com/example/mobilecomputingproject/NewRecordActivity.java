package com.example.mobilecomputingproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.mobilecomputingproject.databinding.ActivityNewRecordBinding;

public class NewRecordActivity extends AppCompatActivity {
    private ActivityNewRecordBinding binding;
    private Button saveBtn;
    private EditText time;
    private EditText date;
    private EditText weight;
    private EditText length;
    private ImageView increaseWeight, decreaseWeight;
    private ImageView increaseLength, decreaseLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewRecordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        date = binding.dateEt;
        time = binding.timeEt;
        length = binding.lenEt;
        weight = binding.weitEt;
        saveBtn = binding.saveBtn;


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = length.getText().toString().trim();
                String w = weight.getText().toString().trim();
                String d = date.getText().toString().trim();
                String t = time.getText().toString().trim();
                new Record(l, w, d, t);
////////////////  not finished
            }
        });
    }
}