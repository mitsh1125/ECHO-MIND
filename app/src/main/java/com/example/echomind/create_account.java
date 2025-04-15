package com.example.echomind;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class create_account {

    TextInputEditText editTextFirstName,editTextLastname,editTextPassword, editTextAnonymous;
    Button CreatedAccount;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;


    public class CreateAccountActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.create_account); // Your XML layout
            mAuth = FirebaseAuth.getInstance();
       editTextFirstName = findViewById(R.id.fname_input);
       editTextLastname = findViewById(R.id.lname_input);
       editTextPassword =findViewById(R.id.password_input);
       editTextAnonymous =findViewById(R.id.anony);
       CreatedAccount = findViewById(R.id.created_btn);
       progressBar = findViewById(R.id.progressbar);
       textView = findViewById(R.id.loginNow);
       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(getApplicationContext(), MainActivity.class);
               startActivity(intent);
               finish();

           }
       });

       CreatedAccount.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               progressBar.setVisibility(View.VISIBLE);

               String  FirstName, Lastname,Anonymous,Password;

               FirstName = String.valueOf(editTextFirstName.getText());
               Lastname  = String.valueOf(editTextLastname.getText());
               Anonymous = String.valueOf(editTextAnonymous.getText());
               Password = String.valueOf(editTextPassword.getText());


               if (TextUtils.isEmpty(FirstName)){
                   Toast.makeText(CreateAccountActivity.this, "ENTER FIRST NAME", Toast.LENGTH_SHORT).show();
                   return;
               }

               if (TextUtils.isEmpty(Lastname)){
                   Toast.makeText(CreateAccountActivity.this, "ENTER LAST NAME", Toast.LENGTH_SHORT).show();
                   return;
               }

               if (TextUtils.isEmpty(Anonymous)){
                   Toast.makeText(CreateAccountActivity.this, "ENTER  YOUR ANONYMOUS NAME", Toast.LENGTH_SHORT).show();
                   return;
               }

               if (TextUtils.isEmpty(Password)){
                   Toast.makeText(CreateAccountActivity.this, "PLEASE ENTER PASSWORD", Toast.LENGTH_SHORT).show();
                   return;
               }

               mAuth.signInWithEmailAndPassword(Anonymous, Password)
                       .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                           @Override
                           public void onComplete(@NonNull Task<AuthResult> task) {
                               progressBar.setVisibility(View.GONE);
                               if (task.isSuccessful()) {



                                   // Sign in success, update UI with the signed-in user's information
                                   Toast.makeText(CreateAccountActivity.this, "Authentication Created.",
                                           Toast.LENGTH_SHORT).show();
                                   FirebaseUser user = mAuth.getCurrentUser();

                               } else {
                                   // If sign in fails, display a message to the user.

                                   Toast.makeText(CreateAccountActivity.this, "Authentication failed.",
                                           Toast.LENGTH_SHORT).show();

                               }
                           }
                       });



           }
       });



        }
    }

}
