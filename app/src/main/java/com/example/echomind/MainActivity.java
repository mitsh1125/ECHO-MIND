package com.example.echomind;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.create_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, create_account.class);
            }
        });

    }
}
//https://www.youtube.com/watch?v=yndGD5UDX2s&list=PLk7v1Z2rk4hhGfJw-IQCm6kjywmuJX4Rh&index=6