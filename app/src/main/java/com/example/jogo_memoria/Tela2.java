package com.example.jogo_memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.jogo_memoria.R.drawable.circulo_g;
import static com.example.jogo_memoria.R.drawable.circulo_m;
import static com.example.jogo_memoria.R.drawable.circulo_p;
import static com.example.jogo_memoria.R.drawable.quadrado_g;
import static com.example.jogo_memoria.R.drawable.quadrado_m;
import static com.example.jogo_memoria.R.drawable.quadrado_p;
import static com.example.jogo_memoria.R.drawable.retangulo_g;
import static com.example.jogo_memoria.R.drawable.retangulo_m;
import static com.example.jogo_memoria.R.drawable.retangulo_p;
import static com.example.jogo_memoria.R.drawable.triangulo_g;
import static com.example.jogo_memoria.R.drawable.triangulo_m;
import static com.example.jogo_memoria.R.drawable.triangulo_p;

public class Tela2 extends AppCompatActivity {
    // Declaração de Variáveis:
    TextView nomeImg2, valorImg, num1, num2, num3, result;
    ImageView imgTopo, imgBase;
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button botaoGerarNr;

    // Declaração de imagens
    Integer[] images = {
            R.drawable.circulo_p,
            R.drawable.quadrado_p,
            R.drawable.retangulo_p,
            R.drawable.triangulo_p,
            R.drawable.oval_p
    };

    // Declaração de ImageButtons
    Integer[] imageButtons = {
            R.drawable.circulo_m,
            R.drawable.quadrado_m,
            R.drawable.triangulo_m,
            R.drawable.triangulo_m,
            R.drawable.oval_m
    };

    // Declaração de Buttons



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        // Integrando XML ao JAVA
        valorImg = findViewById(R.id.valor_img);
        nomeImg2 = findViewById(R.id.nome_img);
        num1 = findViewById(R.id.num01);
        num2 = findViewById(R.id.num02);
        num3 = findViewById(R.id.num03);
        result = findViewById(R.id.resultado);
        imgTopo = findViewById(R.id.img_topo);
        imgBase = findViewById(R.id.img_base);
        botaoGerarNr = findViewById(R.id.btn_avancar);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        // Botão Gerar Números Aleatórios
        botaoGerarNr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numerosAleatorios();
                imagesAleatorios();
            }
        });

        // Botões das Imagens
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botoes();
            }
        }); // Fim do Onclick btn1

        /*

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn2 == imgTopo) {
                    btn2.setImageDrawable(getResources().getDrawable(circulo_g));
                } else {
                    btn2.setImageDrawable(getResources().getDrawable(circulo_p));
                }
            }
        }); // Fim do Onclick btn2

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn3 == imgTopo) {
                    btn3.setImageDrawable(getResources().getDrawable(quadrado_g));
                } else {
                    btn3.setImageDrawable(getResources().getDrawable(quadrado_p));
                }
            }
        }); // Fim do Onclick btn3

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn4 == imgTopo) {
                    btn4.setImageDrawable(getResources().getDrawable(triangulo_g));
                } else {
                    btn4.setImageDrawable(getResources().getDrawable(triangulo_p));
                }
            }
        }); // Fim do Onclick btn4

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn5 == imgTopo) {
                    btn5.setImageDrawable(getResources().getDrawable(retangulo_g));
                } else {
                    btn5.setImageDrawable(getResources().getDrawable(retangulo_p));
                }
            }
        }); // Fim do Onclick btn5

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn6 == imgTopo) {
                    btn6.setImageDrawable(getResources().getDrawable(quadrado_g));
                } else {
                    btn6.setImageDrawable(getResources().getDrawable(quadrado_p));
                }
            }
        }); // Fim do Onclick btn6

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn7 == imgTopo) {
                    btn7.setImageDrawable(getResources().getDrawable(retangulo_g));
                } else {
                    btn7.setImageDrawable(getResources().getDrawable(retangulo_p));
                }
            }
        }); // Fim do Onclick btn7

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn8 == imgTopo) {
                    btn5.setImageDrawable(getResources().getDrawable(triangulo_g));
                } else {
                    btn8.setImageDrawable(getResources().getDrawable(triangulo_p));
                }
            }
        }); // Fim do Onclick btn8

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn9 == imgTopo) {
                    btn9.setImageDrawable(getResources().getDrawable(circulo_g));
                } else {
                    btn9.setImageDrawable(getResources().getDrawable(circulo_p));
                }
            }
        }); // Fim do Onclick btn9 */

    } // fim do OnCreate

    // Método Imagens Aleatórias:
    private void imagesAleatorios() {
        int[] img = new int[10];

        for (int i=0; i<imageButtons.length; i++){
            img[i] = (int)(Math.random()*10);
        } // fim do For

        if (img[0] == 0){
            btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(circulo_m));
            btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn4.setImageDrawable(getResources().getDrawable(circulo_m));
            btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn9.setImageDrawable(getResources().getDrawable(circulo_m));
        } else if (img[1] == 1){
            btn1.setImageDrawable(getResources().getDrawable(circulo_m));
            btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn5.setImageDrawable(getResources().getDrawable(circulo_m));
            btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn8.setImageDrawable(getResources().getDrawable(circulo_m));
            btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
        } else if (img[2] == 2){
            btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
        } else if (img[3] == 3){
            btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(circulo_m));
            btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn4.setImageDrawable(getResources().getDrawable(circulo_m));
            btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(circulo_m));
            btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
        } else if (img[4] == 4){
            btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(circulo_m));
            btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn4.setImageDrawable(getResources().getDrawable(circulo_m));
            btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(circulo_m));
            btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
        } else if (img[5] == 5){
            btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(circulo_m));
            btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn4.setImageDrawable(getResources().getDrawable(circulo_m));
            btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn9.setImageDrawable(getResources().getDrawable(circulo_m));
        } else if (img[6] == 6){
            btn1.setImageDrawable(getResources().getDrawable(circulo_m));
            btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn5.setImageDrawable(getResources().getDrawable(circulo_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(circulo_m));
            btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
        } else if (img[7] == 7){
            btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(circulo_m));
            btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn4.setImageDrawable(getResources().getDrawable(circulo_m));
            btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(circulo_m));
            btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
        } else if (img[8] == 8){
            btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn2.setImageDrawable(getResources().getDrawable(circulo_m));
            btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
            btn4.setImageDrawable(getResources().getDrawable(circulo_m));
            btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
            btn7.setImageDrawable(getResources().getDrawable(circulo_m));
            btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
            btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
        } // Fim do If e Else

    } // Fim imagesAleatórios

    // Método Números Aleatórios
    @SuppressLint("SetTextI18n")
    private void numerosAleatorios() {
        int[] num = new int[4];

        for (int i=0; i<num.length; i++){
            num[i]=(int)(Math.random()*3);
        } // fim do For

        // Exibir Nome da Imagem e Imagem no topo
        if (num[0] == 0){
            imgTopo.setImageDrawable(getResources().getDrawable(R.drawable.circulo_p));
            nomeImg2.setText("Toque nos Círulos");
            valorImg.setText("= 1");
        } else if (num[1] == 1) {
            imgTopo.setImageDrawable(getResources().getDrawable(R.drawable.retangulo_p));
            nomeImg2.setText("Toque nos Retâgulos");
            valorImg.setText("= 2");
        } else if (num[2] == 2 ) {
            imgTopo.setImageDrawable(getResources().getDrawable(R.drawable.quadrado_p));
            nomeImg2.setText("Toque nos Quadrados");
            valorImg.setText("= 3");
        } else if (num[3] == 3) {
            imgTopo.setImageDrawable(getResources().getDrawable(R.drawable.triangulo_p));
            nomeImg2.setText("Toque nos Triângilos");
            valorImg.setText("= 4");
        } // fim do Else If
    } // fim do numeroesAleatorios

    // Seleção de Botões
    private void botoes() {
        String contaString = valorImg.getText().toString();
        int valor = Integer.parseInt(contaString);
        switch (valor){
            case 1:
                if (btn1 == imgTopo) {
                    btn1.setImageDrawable(getResources().getDrawable(circulo_g));
                } else {
                    btn1.setImageDrawable(getResources().getDrawable(circulo_g));
                } // Fim do If

        } // fim do SWITCH

    } // fim do Método Botoões

} // fim da classe
