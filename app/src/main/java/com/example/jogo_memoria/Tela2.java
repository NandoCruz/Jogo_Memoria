package com.example.jogo_memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.jogo_memoria.R.drawable.circulo_g1;
import static com.example.jogo_memoria.R.drawable.circulo_g2;
import static com.example.jogo_memoria.R.drawable.circulo_m;
import static com.example.jogo_memoria.R.drawable.circulo_p;
import static com.example.jogo_memoria.R.drawable.quadrado_g1;
import static com.example.jogo_memoria.R.drawable.quadrado_g2;
import static com.example.jogo_memoria.R.drawable.quadrado_m;
import static com.example.jogo_memoria.R.drawable.quadrado_p;
import static com.example.jogo_memoria.R.drawable.retangulo_g1;
import static com.example.jogo_memoria.R.drawable.retangulo_g2;
import static com.example.jogo_memoria.R.drawable.retangulo_m;
import static com.example.jogo_memoria.R.drawable.retangulo_p;
import static com.example.jogo_memoria.R.drawable.triangulo_g1;
import static com.example.jogo_memoria.R.drawable.triangulo_g2;
import static com.example.jogo_memoria.R.drawable.triangulo_m;
import static com.example.jogo_memoria.R.drawable.triangulo_p;

public class Tela2 extends AppCompatActivity {
    // Declaração de Variáveis:
    TextView nomeImg2, valorImg, num1, num2, num3, result;
    ImageView imgTopo, imgBase;
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button botaoGerarNr;
    Integer casoImg, aleBtn;
    String valorCirculo, valorRetangulo, valorQuadrado, valorTriangulo;

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
                num1.setText("0");
                num2.setText("0");
                num3.setText("0");
                result.setText("0");
                numerosAleatorios();
                imagesAleatorios();
            }
        });

        // Valor das imagens
        valorCirculo = "";
        valorRetangulo = "";
        valorQuadrado = "";
        valorTriangulo = "";

        // Botão OnClick 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("4");
                        calcular();
                    } // fim do If else caso Imagem for 2 Retângulo

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 circulo

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 triangulo

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 Quadrado

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 2 Retângulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 triângulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 circulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 2 Retângulo
                } // fim do If Botão 1
            } // Fm do OnClick Botal 1
        }); // Fim do OnclickListener btn1

        // Botão OnClick 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 triangulo

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 Circulo
                } // fim do If Botão 2
            } // Fm do OnClick
        }); // Fim do OnclickListener btn2

        // Botão OnClick 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g2));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(circulo_g2));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        num1.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn3.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        num1.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo
                } // fim do If Botão 3
            } // Fm do OnClick
        }); // Fim do OnclickListener btn3

        // Botão OnClick 4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num2.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("4");
                    } // fim do If else caso Imagem for 4 triangulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 1 circulo

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 1 Circulo
                } // fim do If Botão 4
            } // Fm do OnClick
        }); // Fim do OnclickListener btn4

        // Botão OnClick 5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 2 retangulo

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("4");
                    } // fim do If else caso Imagem for 4 triangulo

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 3 quadrado

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado
                } // fim do If Botão 5
            } // Fm do OnClick
        }); // Fim do OnclickListener btn5

        // Botão OnClick 6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g2));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));
                    } // fim do If else caso Imagem for 2 retangulo

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        num2.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(quadrado_g2));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        num2.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num2.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(circulo_g2));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num2.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn6.setImageDrawable(getResources().getDrawable(retangulo_g2));
                    } // fim do If else caso Imagem for 2 Retangulo
                } // fim do If Botão 6
            } // Fm do OnClick
        }); // Fim do OnclickListener btn6

        // Botão OnClick 7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num3.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num3.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num3.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo
                } // fim do If Botão 7
            } // Fm do OnClick
        }); // Fim do OnclickListener btn7

        // Botão OnClick 8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 2 Retangulo

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("4");
                    } // fim do If else caso Imagem for 4 triangulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_g2));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_m));
                    } // fim do If else caso Imagem for 2 Retangulo
                } // fim do If Botão 8
            } // Fm do OnClick
        }); // Fim do OnclickListener btn8

        // Botão OnClick 9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // trocarImagem();
                if (aleBtn == 0) { // 1ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 1) { // 2ª séquência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        num3.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 2) { // 3ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(triangulo_g1));
                        num3.setText("4");
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 3) { // 4ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 4) { // 5ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_g1));
                        num3.setText("2");

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(retangulo_g2));
                    } // fim do If else caso Imagem for 4 Triangulo

                } else if (aleBtn == 5) { // 6ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        num3.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g2));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 6) { // 7ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));
                    } // fim do If else caso Imagem for 1 Circulo

                } else if (aleBtn == 7) { // 8ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g1));
                        num3.setText("3");

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(quadrado_g2));
                    } // fim do If else caso Imagem for 3 Quadrado

                } else if (aleBtn == 8) { // 9ª sequência das imagens nos butões
                    if (casoImg == 1) { // circulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g1));
                        num3.setText("1");

                    } else if (casoImg == 2) { // retangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 3) { // quadrado
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));

                    } else if (casoImg == 4) { // triangulo
                        btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                        btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                        btn9.setImageDrawable(getResources().getDrawable(circulo_g2));
                    } // fim do If else caso Imagem for 1 Circulo
                } // fim do If Botão 9
            } // Fm do OnClick
        }); // Fim do OnclickListener btn9

    } // fim do OnCreate

    // Calcular o valor das imagens
    private void calcular() {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        String n3 = num3.getText().toString();
        int n_1 = Integer.parseInt(n1);
        int n_2 = Integer.parseInt(n2);
        int n_3 = Integer.parseInt(n3);
        int soma = n_1 + n_2 + n_3;
        String soma1 = " "+ soma;
        result.setText(soma1);

    }


    // Método Números Aleatórios
    @SuppressLint("SetTextI18n")
    private void numerosAleatorios() {
        int[] num = new int[4];
        for (int i=0; i<4; i++){
            num[i]=(int)(Math.random()*4);

            // Exibir Nome da Imagem e Imagem no topo
            if (num[0] == 0){
                imgTopo.setImageDrawable(getResources().getDrawable(circulo_p));
                imgBase.setImageDrawable(getResources().getDrawable(circulo_p));
                nomeImg2.setText("Toque nos Círulos");
                // result.setText("3");
                valorImg.setText("= 1");
                casoImg = 1;

            } else if (num[1] == 1) {
                imgTopo.setImageDrawable(getResources().getDrawable(retangulo_p));
                imgBase.setImageDrawable(getResources().getDrawable(retangulo_p));
                nomeImg2.setText("Toque nos Retâgulos");
                // result.setText("6");
                valorImg.setText("= 2");
                casoImg = 2;

            } else if (num[2] == 2 ) {
                imgTopo.setImageDrawable(getResources().getDrawable(quadrado_p));
                imgBase.setImageDrawable(getResources().getDrawable(quadrado_p));
                nomeImg2.setText("Toque nos Quadrados");
                // result.setText("9");
                valorImg.setText("= 3");
                casoImg = 3;

            } else if (num[3] == 3) {
                imgTopo.setImageDrawable(getResources().getDrawable(triangulo_p));
                imgBase.setImageDrawable(getResources().getDrawable(triangulo_p));
                nomeImg2.setText("Toque nos Triângilos");
                // result.setText("12");
                valorImg.setText("= 4");
                casoImg = 4;
            } // fim do else if
        } // fim do For
    } // fim do numeroesAleatorios

    // Método Imagens Aleatórias:
    private void imagesAleatorios() {
        int[] img = new int[9];

        for (int i=0; i<9; i++){
            img[i] = (int)(Math.random()*9);

            if (img[0] == 0 && casoImg != 4) {
                aleBtn = 0;
                btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn9.setImageDrawable(getResources().getDrawable(circulo_m));
            } else if (img[1] == 1 && casoImg != 1 && casoImg != 2){
                aleBtn = 1;
                btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                btn2.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
            } else if (img[2] == 2 && casoImg != 1){
                aleBtn = 2;
                btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn3.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn4.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn5.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn7.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn9.setImageDrawable(getResources().getDrawable(triangulo_m));
            } else if (img[3] == 3 && casoImg != 4){
                aleBtn = 3;
                btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn6.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn8.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn9.setImageDrawable(getResources().getDrawable(circulo_m));
            } else if (img[4] == 4 && casoImg != 3){
                aleBtn = 4;
                btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                btn5.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn6.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                btn9.setImageDrawable(getResources().getDrawable(retangulo_m));
            } else if (img[5] == 5 && casoImg != 3 && casoImg != 4){
                aleBtn = 5;
                btn1.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                btn3.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn4.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn6.setImageDrawable(getResources().getDrawable(circulo_m));
                btn7.setImageDrawable(getResources().getDrawable(circulo_m));
                btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
            } else if (img[6] == 6 && casoImg != 3){
                aleBtn = 6;
                btn1.setImageDrawable(getResources().getDrawable(circulo_m));
                btn2.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn4.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn5.setImageDrawable(getResources().getDrawable(circulo_m));
                btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn8.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn9.setImageDrawable(getResources().getDrawable(circulo_m));
            } else if (img[7] == 7 && casoImg != 2 && casoImg != 4){
                aleBtn = 7;
                btn1.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn2.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn3.setImageDrawable(getResources().getDrawable(circulo_m));
                btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn7.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn8.setImageDrawable(getResources().getDrawable(circulo_m));
                btn9.setImageDrawable(getResources().getDrawable(quadrado_m));
            } else if (img[8] == 8 && casoImg != 3 && casoImg != 4){
                aleBtn = 8;
                btn1.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn2.setImageDrawable(getResources().getDrawable(circulo_m));
                btn3.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn4.setImageDrawable(getResources().getDrawable(circulo_m));
                btn5.setImageDrawable(getResources().getDrawable(quadrado_m));
                btn6.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn7.setImageDrawable(getResources().getDrawable(triangulo_m));
                btn8.setImageDrawable(getResources().getDrawable(retangulo_m));
                btn9.setImageDrawable(getResources().getDrawable(circulo_m));
            } // Fim do If e Else

        } // fim do For
    } // Fim imagesAleatórios

} // fim da classe
