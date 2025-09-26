package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ForgetPasswordMainBinding;

public class ForgetPasswordActivity extends AppCompatActivity {

    private ForgetPasswordMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ForgetPasswordMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnConfirm.setOnClickListener(v -> {
            Intent intent = new Intent(ForgetPasswordActivity.this, EnterNewPasswordActivity.class);
            startActivity(intent);
            finish();
        });
    }
}