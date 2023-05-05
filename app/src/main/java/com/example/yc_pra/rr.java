package com.example.yc_pra;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class rr extends AppCompatActivity {
    private Button sozdat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sozda_klient);
        sozdat = findViewById(R.id.sozdat);
        sozdat.setOnClickListener(v ->

        {
            Intent intent = new Intent(rr.this, ee.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}