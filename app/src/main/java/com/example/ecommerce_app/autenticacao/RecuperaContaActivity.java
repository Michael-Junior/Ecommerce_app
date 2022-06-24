package com.example.ecommerce_app.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ecommerce_app.R;
import com.example.ecommerce_app.databinding.ActivityMainBinding;
import com.example.ecommerce_app.databinding.ActivityRecuperaContaBinding;

public class RecuperaContaActivity extends AppCompatActivity {

    private ActivityRecuperaContaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecuperaContaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        configClicks();
    }

    private void configClicks(){
        binding.includeVoltarRecuperarSenhaActivity.ibVoltarIcon.setOnClickListener(view -> finish());
    }
}