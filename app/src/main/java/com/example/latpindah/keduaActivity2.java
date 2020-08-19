package com.example.latpindah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class keduaActivity2 extends AppCompatActivity {
    TextView txtKoper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua2);
        txtKoper=(TextView)findViewById(R.id.txt_koper);
        Intent datanya=getIntent();
        String tulisannya=datanya.getStringExtra("data1");
        txtKoper.setText(tulisannya);
    }
}