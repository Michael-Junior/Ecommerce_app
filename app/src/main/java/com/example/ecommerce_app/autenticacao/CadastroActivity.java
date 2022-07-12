package com.example.ecommerce_app.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ecommerce_app.R;
import com.example.ecommerce_app.databinding.ActivityCadastroBinding;

public class CadastroActivity extends AppCompatActivity {

    private ActivityCadastroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCadastroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        configClicks();
    }

    private void configClicks() {
        binding.include.ibVoltarIcon.setOnClickListener(view -> finish());
        binding.btnLogin.setOnClickListener(view -> {
            finish();
        });
    }
}