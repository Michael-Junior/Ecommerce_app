package com.example.ecommerce_app.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ecommerce_app.R;
import com.example.ecommerce_app.databinding.ActivityLoginBinding;
import com.example.ecommerce_app.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        configClicks();
    }

    private void configClicks(){
        binding.btnRecuperarSenhaLogin.setOnClickListener(view ->
                startActivity(new Intent(this, RecuperaContaActivity.class)));
    }
}