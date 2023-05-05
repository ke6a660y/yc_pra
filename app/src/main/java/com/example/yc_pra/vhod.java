package com.example.yc_pra;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class vhod extends AppCompatActivity {
    private Button dalee;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vhod);
        dalee = findViewById(R.id.dalee);
        dalee.setOnClickListener(v ->

        {
            Intent intent = new Intent(vhod.this, rr.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}