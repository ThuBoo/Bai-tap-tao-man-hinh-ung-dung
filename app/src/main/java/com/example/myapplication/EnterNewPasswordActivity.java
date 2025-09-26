package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityEnterNewPasswordBinding;

public class EnterNewPasswordActivity extends AppCompatActivity {

    private ActivityEnterNewPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEnterNewPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSave.setOnClickListener(v -> {
            Intent intent = new Intent(EnterNewPasswordActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
    }
}