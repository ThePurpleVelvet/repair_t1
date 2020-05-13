package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Account extends AppCompatActivity {
    Button buttonHomeProfile, buttonOrderProfile, buttonpayment, buttonlogout ;
    TextView textnamaaccount, textemailaccount, textphoneprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        buttonHomeProfile = findViewById(R.id.buttonHomeProfile);
        buttonOrderProfile = findViewById(R.id.buttonOrderProfile);
        buttonpayment = findViewById(R.id.buttonPaymentProfike);
        buttonlogout = findViewById(R.id.buttonlogout);

        textnamaaccount = findViewById(R.id.textUsernameprofile);
        textemailaccount = findViewById(R.id.textEmailprofile);
        textphoneprofile = findViewById(R.id.textphoneprofile);

        Intent intent = getIntent();
        final String email = intent.getStringExtra("email");
        final String name = intent.getStringExtra("name");
        final String username = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        final String phone = intent.getStringExtra("phone");

        //textnamaaccount.setText(getIntent().getStringExtra("username" ));
        textnamaaccount.setText(String.valueOf(username));
        textemailaccount.setText(String.valueOf(email));
        textphoneprofile.setText(String.valueOf(phone));


        buttonHomeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, Home.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

        buttonOrderProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, Order.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

        buttonpayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, Payment2.class);
                intent.putExtra("username", username);
                intent.putExtra("name", name);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

        buttonlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Account.this, Login.class);
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
