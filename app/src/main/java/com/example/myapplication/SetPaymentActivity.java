package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivitySetPaymentBinding;

public class SetPaymentActivity extends AppCompatActivity {

    private ActivitySetPaymentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySetPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnPay.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
    }
}