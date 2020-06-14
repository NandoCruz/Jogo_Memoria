package com.example.jogo_memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import static com.example.jogo_memoria.R.drawable.circulo_m;
import static com.example.jogo_memoria.R.drawable.quadrado_m;
import static com.example.jogo_memoria.R.drawable.retangulo_m;
import static com.example.jogo_memoria.R.drawable.triangulo_m;

public class Tela2 extends AppCompatActivity {
    TextView nomeImg2, valorImg, num1, num2, num3, result;
    ImageView imgTopo, imgBase;
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button botaoGerarNr;

    Integer[] images = {
            R.drawable.circulo_p,
            R.drawable.quadrado_p,
            R.drawable.retangulo_p,
            R.drawable.triangulo_p,
            R.drawable.oval_p
    };

    Integer[] imageButtons = {
            R.drawable.circulo_m,
            R.drawable.quadrado_m,
            R.drawable.triangulo_m,
            R.drawable.triangulo_m,
            R.drawable.oval_m
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

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

    } // fim do OnCreate

    // Método Imagens Aleatórias:
    private void imagesAleatorios() {
        String aux = "";
        int[] img = new int[4];

        for (int i=0; i<imageButtons.length; i++){
            img[i] = (int)(Math.random()*9);
            aux = "=" + img[i];
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
        String aux="";
        int[] num = new int[2];

        for (int i=1; i<2; i++){
            num[i]=(int)(Math.random()*5);
            if (num[i] == 0){
                num[i] = 3;
                aux = " = " + num[i];
            } else {
                aux = " = " + num[i];
            }
        } // fim do For

        // Exibir número no topo
        valorImg.setText(aux);

        // Exibir Nome da Imagem e Imagem no topo
        if ((num[0] == 0 && num[0] != 1) && (num[0] != 2 && num[0] != 3)){ // Se 0 = 0 e != de 1,2,3
            imgTopo.setImageDrawable(getResources().getDrawable(R.drawable.quadrado_p));
            nomeImg2.setText("Toque nos Quadrados");
        } else if ((num[1] != 0 && num[1] == 1) && (num[1] != 2 && num[1] != 3)) { // Se 1 = 1 e != de 0,2,3
            imgTopo.getResources().getDrawable(R.drawable.retangulo_p);
            nomeImg2.setText("Toque nos Retâgulos");
        } else if ((num[2] != 0 && num[2] != 1) && (num[2] == 2 && num[2] != 3)) { // Se 2 = 2 e != de 0,1,3
            imgTopo.getResources().getDrawable(R.drawable.circulo_p);
            nomeImg2.setText("Toque nos Círulos");
        } else if ((num[3] != 0 && num[3] != 1) && (num[3] != 2 && num[3] == 3)) { // Se 3 = 3 e != de 0, 1,2
            imgTopo.setImageDrawable(getResources().getDrawable(R.drawable.triangulo_p));
            nomeImg2.setText("Toque nos Triângilos");
        } // fim do Else If

    } // fim do numeroesAleatorios


} // fim da classe
