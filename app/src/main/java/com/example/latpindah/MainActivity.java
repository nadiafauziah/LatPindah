package com.example.latpindah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    EditText kata;
    String koper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPindah = (Button) findViewById(R.id.btn_pindah);
        kata=(EditText)findViewById(R.id.editText) ;
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String katanya = kata.getText().toString();
                koper = "ini koper yang pindah";
                Intent pindah = new Intent(MainActivity.this,keduaActivity2.class);
                pindah.putExtra("data1", katanya);
                startActivity(pindah);

            }
        });

    }
}