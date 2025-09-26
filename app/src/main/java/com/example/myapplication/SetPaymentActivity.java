package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivitySetPaymentBinding;

public class SetPaymentActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    EditText etCardNumber, etExpiry, etCVV, etAmount;
    Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_payment);

        etCardNumber = findViewById(R.id.etCardNumber);
        etExpiry = findViewById(R.id.etExpiry);
        etCVV = findViewById(R.id.etCVV);
        etAmount = findViewById(R.id.etAmount);
        btnPay = findViewById(R.id.btnPay);

        btnPay.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, PaymentSuccessActivity.class);
            startActivity(intent);
            finish();
        });
    }
}