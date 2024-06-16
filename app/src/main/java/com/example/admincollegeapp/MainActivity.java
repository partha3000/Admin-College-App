package com.example.admincollegeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView uploadNotice, uploadImage, uploadEbook;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        uploadNotice = (CardView) findViewById(R.id.addNotice);
        uploadImage = (CardView) findViewById(R.id.AddGalleyImage);
        uploadEbook = (CardView) findViewById(R.id.AddEbook);
        textView = (TextView) findViewById(R.id.textView_id);

        uploadNotice.setOnClickListener(this);
        uploadImage.setOnClickListener(this);
        uploadEbook.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.addNotice){
            Intent intent = new Intent(MainActivity.this,UploadNotice.class);
            startActivity(intent);
        }else if(v.getId() == R.id.AddGalleyImage){
            Intent intent1 = new Intent(MainActivity.this,uploadImage.class);
            startActivity(intent1);
        }else{
            System.out.println("Hello");
        }

    }
}