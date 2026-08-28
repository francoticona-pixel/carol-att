package com.example.attcarol;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtNome;
    Button btnPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        txtNome = findViewById(R.id.txtNome);
        btnPerfil = findViewById(R.id.btnPerfil);

        String nome = getIntent().getStringExtra("nome");

        if (nome != null) {
            txtNome.setText("Olá, " + nome + "!");
        }

        btnPerfil.setOnClickListener(v -> {

            Intent intent = new Intent(
                    HomeActivity.this,
                    PerfilActivity.class
            );

            intent.putExtra("nome", nome);

            startActivity(intent);
        });
    }
}