package com.example.attcarol;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    TextView txtPerfilNome;
    ImageButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_perfil);

        txtPerfilNome = findViewById(R.id.txtPerfilNome);
        btnVoltar = findViewById(R.id.btnVoltar);

        String nome = getIntent().getStringExtra("nome");

        if (nome != null && txtPerfilNome != null) {
            txtPerfilNome.setText(nome);
        }

        if (btnVoltar != null) {
            btnVoltar.setOnClickListener(v -> {
                finish();
            });
        }
    }
}