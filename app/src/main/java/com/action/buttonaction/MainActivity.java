package com.action.buttonaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        tvFrases = findViewById(R.id.tv_frases);
        Button btnGerar = findViewById(R.id.btn_gerar);

        btnGerar.setOnClickListener(view -> {
            String phrase1 = "Se o sucesso estiver no cume, escalarei para obtê-lo.\n" +
                    "Se o sucesso estiver no fundo do oceano, mergulharei para obtê-lo.\n" +
                    "Se o sucesso estiver no meio da batalha, lutarei por ele.";

            String [] arrayFrases = {
                    "Comece onde você está, use o que você tem e faça o que você pode.",
                    "Não importa que você vá devagar, contanto que você não pare.",
                    "A inspiração existe, porém temos que encontrá-la trabalhando.",
                    "Conhecer a si mesmo é o começo de toda sabedoria.",
                    "Descubra quem é você, e seja essa pessoa. A sua alma foi colocada nesse mundo para ser isso, então viva essa verdade e todo resto virá.",
                    "Acredite em milagres, mas não dependa deles",
                    "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez.",
                    "Mude o modo que você olha para as coisas, e as coisas que você olha mudarão.",
                    "Toda vez que você se sentir inseguro, relembre as situações em que você se subestimou.",
                    phrase1
            };

            Random random = new Random();
            int randomNumbers = random.nextInt(arrayFrases.length);
            tvFrases.setText(arrayFrases[randomNumbers]);
        });
    }
}