package com.example.homework16;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.homework16.databinding.ActivityMainBinding;
import com.example.homework16.databinding.ActivityMenuBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private final String userEmail = "geeks@gmail.com";
    private final String userPassword = "123";

    ActivityMainBinding binding;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        intent = new Intent(MainActivity.this, MenuActivity.class);

        binding.btnLogin.setOnClickListener(v -> {
            String email = binding.editTextEmail.getText().toString();
            String password = binding.editTextPassword.getText().toString();
            String answer;
            if (email.isEmpty() || password.isEmpty()) answer = "Please enter Email and Password";
            else if (email.equals(userEmail) && password.equals(userPassword)) {
                answer = "You have successfully registered";
                Snackbar.make(v, answer, Snackbar.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            } else answer = "Incorrect login and password";
            Snackbar.make(v, answer, Snackbar.LENGTH_SHORT).show();
        });
    }
}