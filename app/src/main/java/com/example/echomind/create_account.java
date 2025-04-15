package com.example.echomind;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class create_account {
    public class CreateAccountActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.create_account); // Your XML layout
            Button createAccountButton = findViewById(R.id.created_btn);
            // Set OnClickListener
            createAccountButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Navigate to Log In screen
                    Intent intent = new Intent(CreateAccountActivity.this,MainActivity.class);
                    startActivity(intent);


                }
            });
        }
    }

}
