package com.uc.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView imageViewIcon;
    TextView textViewTitle, textViewDesc, textViewPrice;
    Button buttonConfirm;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageViewIcon = findViewById(R.id.imageViewIcon);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewDesc = findViewById(R.id.textViewDesc);
        textViewPrice = findViewById(R.id.textViewPrice);

        buttonConfirm = findViewById(R.id.buttonConfirm);

        getData();
        setData();

    }

    private void getData(){
        if (getIntent().hasExtra("imageViewIcon") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2"))
        {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("imageViewIcon", 1);


        }else
        {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        textViewTitle.setText(data1);
        textViewDesc.setText(data2);
        imageViewIcon.setImageResource(myImage);
    }

}
