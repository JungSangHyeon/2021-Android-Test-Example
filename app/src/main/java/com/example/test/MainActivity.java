package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final int NOW_YEAR = 2021;
    
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LoginManager loginManager = new LoginManager();

        binding.testButton.setOnClickListener(v->{
            String firstName = binding.firstNameEditText.getText().toString();
            String lastName = binding.lastNameEditText.getText().toString();
            String wholeName = loginManager.getWholeName(firstName, lastName);
            binding.wholeNameTextView.setText(wholeName);

            int birthYear = Integer.parseInt(binding.birthYearEditText.getText().toString());
            int age = loginManager.getAge(birthYear, NOW_YEAR);
            binding.ageTextView.setText(Integer.toString(age));
        });
    }
}