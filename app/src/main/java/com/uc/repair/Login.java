package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editText_Username, editText_Password;
    Button button_Confirm;

    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_Username = findViewById(R.id.editText_Username);
        editText_Password = findViewById(R.id.editText_Password);
        button_Confirm = findViewById(R.id.button_Confirm);

        Intent intent = getIntent();
        final String sentName = intent.getStringExtra("name");
        final String sentUsername = intent.getStringExtra("username");
        final String sentPassword = intent.getStringExtra("password");




        button_Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = editText_Username.getText().toString();
                password = editText_Password.getText().toString();

                if (username.equals(sentUsername)  && password.equals(sentPassword)){
                    Toast.makeText(getApplicationContext(),"You are logged in " + sentName + " !",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this, Home.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(getApplicationContext(),"Incorrect username or password " + username + " " + sentUsername,Toast.LENGTH_LONG).show();
                }




            }
        });


    }
}
