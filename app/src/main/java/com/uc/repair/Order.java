package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order extends AppCompatActivity {

    Button buttonHome, buttonPayment, buttonPrev, buttonNext, buttonAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        buttonHome = findViewById(R.id.buttonHome);
        buttonPrev = findViewById(R.id.buttonPrev);
        buttonNext = findViewById(R.id.buttonNext);
        buttonPayment = findViewById(R.id.buttonPayment);
        buttonAccount = findViewById(R.id.buttonAccount);

        Intent intent = getIntent();
        final String email = intent.getStringExtra("email");
        final String name = intent.getStringExtra("name");
        final String username = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        final String phone = intent.getStringExtra("phone");

        buttonPrev.setText("<");
        buttonNext.setText(">");

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, Home.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

        buttonPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, Payment2.class);
                startActivity(intent);
            }
        });

        buttonAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, Account.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

    }
}
