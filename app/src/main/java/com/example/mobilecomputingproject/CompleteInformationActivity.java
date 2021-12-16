package com.example.mobilecomputingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.mobilecomputingproject.databinding.ActivityCompleteInformationBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.Date;

public class CompleteInformationActivity extends AppCompatActivity {
    private static final String TAG = "CompleteInformationActi";
    private ActivityCompleteInformationBinding binding;
    private Button saveDateBtn;
    private RadioGroup maleORFemale;
    private EditText dateOfBirth;
    private EditText weight;
    private EditText length;
    private ImageView increaseLength;
    private ImageView decreaseLength;
    private ImageView increaseWeight;
    private ImageView decreaseWeight;
    private DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompleteInformationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //get references to each view in layout file
        maleORFemale = binding.radioGroup;
        weight = binding.weigth;
        length = binding.lengEt;
        dateOfBirth = binding.dateOfBirth;
        saveDateBtn = binding.saveDateButton;

    }


    public void saveData(View view) {
        String len = length.getText().toString();
        String wei = weight.getText().toString();
        String dob = dateOfBirth.getText().toString();
        boolean isMale = maleORFemale.getCheckedRadioButtonId() == R.id.male_radio_btn ? true : false;
        long date = Long.parseLong(dob);
        long currentDate = System.currentTimeMillis();
        System.out.println(String.valueOf(currentDate - date));
        SingleUser user = new SingleUser(len, wei, dob, isMale);
        myRef.child("users").child(user.getUuid()).setValue(user);
        Toast.makeText(CompleteInformationActivity.this, "data saved.", Toast.LENGTH_LONG)
                .show();
        Intent intent = new Intent(CompleteInformationActivity.this, HomeActivity.class);
        intent.putExtra("len", len);
        intent.putExtra("wei", wei);
//        intent.putExtra("age", age);

        startActivity(intent);

    }

    public void increaseWeight(View view) {
        String wei = weight.getText().toString();
        if (wei.length() == 0) {
            wei = 0 +"";
        }
        weight.setText(Integer.parseInt(wei) + 1 +"");
    }

    public void decreaseWeight(View view) {
        String wei = weight.getText().toString();
        if (wei.length() == 0) {
            wei = 0 +"";
        }
        weight.setText(Integer.parseInt(wei) - 1 +"");
    }

    public void increaseLength(View view) {
        String len = length.getText().toString();
        if (len.length() == 0) {
            len = 0 +"";
        }
        length.setText(Integer.parseInt(len) + 1 +"");
    }

    public void decreaseLength(View view) {
        String len = length.getText().toString();
        if (len.length() == 0) {
            len = 0 +"";
        }
        length.setText(Integer.parseInt(len) - 1 +"");
    }

}