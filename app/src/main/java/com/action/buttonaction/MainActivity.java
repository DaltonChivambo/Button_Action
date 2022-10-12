package com.action.buttonaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView tvFrases;
    private Button btnGerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        tvFrases = findViewById(R.id.tv_frases);
        btnGerar = findViewById(R.id.btn_gerar);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] arrayFrases = {"aaaa","bbbbb","ccccc"};
                tvFrases.setText("Welcome");
            }
        });
    }
}