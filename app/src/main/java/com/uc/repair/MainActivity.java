package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_Login, button_Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        final String email = intent.getStringExtra("email");
        final String name = intent.getStringExtra("name");
        final String username = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        final String phone = intent.getStringExtra("phone");


        button_Signup = findViewById(R.id.button_Signup);
        button_Login = findViewById(R.id.button_Login);


        button_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String signup = "signup";

                Intent intent = new Intent(MainActivity.this, SignUp.class);
                intent.putExtra("signup", signup);
                startActivity(intent);
            }
        });

        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });

    }
}
