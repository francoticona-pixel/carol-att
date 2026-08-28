package com.example.attcarol;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {

            String nome = edtNome.getText().toString().trim();

            if (nome.isEmpty()) {

                Toast.makeText(
                        MainActivity.this,
                        "Digite seu nome",
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                Intent intent = new Intent(
                        MainActivity.this,
                        HomeActivity.class
                );

                intent.putExtra("nome", nome);

                startActivity(intent);
            }
        });
    }
}