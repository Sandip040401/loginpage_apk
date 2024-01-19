package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.loginpage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initUI();
    }

    private void initUI() {
        binding.fabBack.setOnClickListener(view -> {
            // Implement your action for fabBack click here
        });

        binding.btnSignIn.setOnClickListener(view -> {
            // Implement your action for btnSignIn click here
        });

        binding.tvForgotPassword.setOnClickListener(view -> {
            // Implement your action for tvForgotPassword click here
        });

        binding.tvSignup.setOnClickListener(view -> {
            // Start RegisterActivity when "Sign Up" is clicked
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        });
    }
}
