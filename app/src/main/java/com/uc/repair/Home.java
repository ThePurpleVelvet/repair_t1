package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button buttonOrder, buttonPayment, buttonAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        Intent intent = getIntent();
        final String email = intent.getStringExtra("email");
        final String name = intent.getStringExtra("name");
        final String username = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        final String phone = intent.getStringExtra("phone");

        buttonOrder = findViewById(R.id.buttonOrder);
        buttonPayment = findViewById(R.id.buttonPayment);
        buttonAccount = findViewById(R.id.buttonAccount);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Order.class);
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
                Intent intent = new Intent(Home.this, Payment2.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

        buttonAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Account.class);
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
