package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Accountedit extends AppCompatActivity {

    Button buttonSubmitedit;
    EditText textnama, textusername, textemail, textphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountedit);

        buttonSubmitedit = findViewById(R.id.buttonSubmitedit);

        textnama = findViewById(R.id.editTextNama);
        textusername = findViewById(R.id.editTextUsername);
        textemail = findViewById(R.id.editTextEmail);
        textphone = findViewById(R.id.editTextPhone);

        Intent intent = getIntent();
        final String emailsent = intent.getStringExtra("email");
        final String namesent = intent.getStringExtra("name");
        final String usernamesent = intent.getStringExtra("username");
        final String password = intent.getStringExtra("password");
        final String phonesent = intent.getStringExtra("phone");

        textemail.setText(String.valueOf(emailsent));
        textusername.setText(String.valueOf(usernamesent));
        textnama.setText(String.valueOf(namesent));
        textphone.setText(String.valueOf(phonesent));

        final String username = textusername.getText().toString();
        final String namefix = textnama.getText().toString();
        final String email = textemail.getText().toString();
        final String phone = textphone.getText().toString();



        buttonSubmitedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accountedit.this, Account.class);
                intent.putExtra("username", username);
                intent.putExtra("name", namefix);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });
    }
}
