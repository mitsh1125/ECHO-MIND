package com.example.echomind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    TextInputEditText editTextPassword, editTextAnonymous;
    Button buttonLogin;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        editTextPassword =findViewById(R.id.password_input);
        editTextAnonymous =findViewById(R.id.username_input);
        buttonLogin = findViewById(R.id.login_btn);
        progressBar = findViewById(R.id.progressbar);
        textView = findViewById(R.id.create_btn);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), create_account.class);
                startActivity(intent);
                finish();

            }
        });

        buttonLogin.



    }
}
//https://www.youtube.com/watch?v=yndGD5UDX2s&list=PLk7v1Z2rk4hhGfJw-IQCm6kjywmuJX4Rh&index=6
//login-createaccount-16ef4