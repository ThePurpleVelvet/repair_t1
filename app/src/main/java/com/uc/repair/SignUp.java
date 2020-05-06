package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText editText_Username, editText_Name, editText_Password, editText_Email, editText_Phone;
    Button button_Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editText_Email = findViewById(R.id.editText_Email);
        editText_Name = findViewById(R.id.editText_Name);
        editText_Username = findViewById(R.id.editText_Username);
        editText_Password = findViewById(R.id.editText_Password);
        editText_Phone = findViewById(R.id.editText_Phone);
        button_Register = findViewById(R.id.button_Register);

        Intent intent = getIntent();
        String signup_get = intent.getStringExtra("signup");

        button_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editText_Email.getText().toString();
                String name = editText_Name.getText().toString();
                String username = editText_Username.getText().toString();
                String password = editText_Password.getText().toString();
                String phone = editText_Phone.getText().toString();

                Intent intent = new Intent(SignUp.this, MainActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("name", name);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });




    }
}
