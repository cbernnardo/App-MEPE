package com.claudiobernardo.www.mepe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao_omuseu = findViewById(R.id.botao_omuseu);
        botao_omuseu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MuseuActivity.class);
                startActivity(intent);
            }
        });

        Button botao_exposicoes = findViewById(R.id.botao_exposicoes);
        botao_exposicoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExpoActivity.class);
                startActivity(intent);
            }
        });

        Button botao_colecoes = findViewById(R.id.botao_colecoes);
        botao_colecoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColecoesActivity.class);
                startActivity(intent);
            }
        });

        Button botao_bibliotecas = findViewById(R.id.botao_bibliotecas);
        botao_bibliotecas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BiblioActivity.class);
                startActivity(intent);
            }
        });

        Button botao_acontece = findViewById(R.id.botao_acontece);
        botao_acontece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AcontActivity.class);
                startActivity(intent);
            }
        });

        Button botao_atividades = findViewById(R.id.botao_atividades);
        botao_atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AtiviActivity.class);
                startActivity(intent);
            }
        });

        Button botao_visite = findViewById(R.id.botao_visite);
        botao_visite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VisiteActivity.class);
                startActivity(intent);
            }
        });

        Button botao_contato = findViewById(R.id.botao_contato);
        botao_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContatoActivity.class);
                startActivity(intent);
            }
        });
    }
}
