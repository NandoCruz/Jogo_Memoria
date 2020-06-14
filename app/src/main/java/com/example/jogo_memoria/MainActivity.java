package com.example.jogo_memoria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 1) Declaração das Variáveis:
    EditText campoNome;
    ImageView campoTitulo, campoFiguras;
    TextView txtNome;
    Button buttonAvancar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2) Integração do XML com JAVA:
        campoNome = findViewById(R.id.nome);
        campoTitulo = findViewById(R.id.imgTitulo);
        campoFiguras = findViewById(R.id.img_figuras);
        txtNome = findViewById(R.id.txtNome);

        buttonAvancar = findViewById(R.id.btn_tela);

        // 3) Botão Avançar para ir à Tela2
        buttonAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tela2.class);
                startActivity(intent);
            }
        });
    } // Fim do Oncreate

    // 4) Inflando o Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    // 5) Selecionando o Item do Menu:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menuInfo) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
            alerta.setTitle("AVISO");
            alerta
                    // .setIcon(R.mipmap.ic_launcher_round)
                    .setMessage("Este é o Jogo da Memória, selecione as imagens iguais a imagens que aparece em cima")
                    .setCancelable(false)
                    .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Cancelar escolhido", Toast.LENGTH_SHORT).show();
                        }
                    });
            return true;
        } else finish();
        return true;
    } // Fim do Item Menu

} // Fim da Classe
