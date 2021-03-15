package com.g.aleprojetos.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Gáucia eu te amo",
                "Acredite que você pode, assim, você já estará no meio do caminho.",
                "Otimismo é esperar pelo melhor. Confiança é saber lidar com o pior.",
                "Pedras no caminho? Eu guardo todas. Um dia, vou construir um castelo.",
                "O destino é moldado pela força do pensamento. Pense sempre positivo.",
                "É no fundo do poço que se cava o eu posso.",
                "Os homens de sucesso são doadores e não tomadores de energia positiva.",
                "Para encontrar o seu equilíbrio, na maioria das vezes, é preciso antes perdê-lo.",
                "Promova uma faxina mental com afirmações e pensamentos positivos.",
                "Busque ser feliz, sem ocultar a felicidade de ninguém.",
                "Quanto mais você se supera, mais motivado fica.",
                "É pra frente que se anda, é pra cima que se olha e é lutando que se conquista.",
                "As melhores coisas da vida são gratuitas: abraços, sorrisos, amigos, beijos, família, dormir, amor, risos e boas lembranças.",
                "Treine sua mente para ver o lado bom de qualquer situação.",
                "Se jogue no que te faz sorrir.",
                "A força de dentro é maior que todos os ventos contrários.",
                "Ninguém, além de você, está no controle da sua felicidade.",
                "É no agir que a vida muda de forma.",
                "A vida não precisa ser perfeita para ser maravilhosa.",
                "Bons pensamentos atraem acontecimentos magníficos.",
                "Espalhe amor, alegria, espiritualidade, energia boa e o que mais você puder.",
                "A diferença entre o possível e o impossível está no tamanho da sua determinação",
                "Minha meta é dez. Nove e meio nem rola.",
                "Amar a si próprio é o início de um romance para toda a vida.",
                "Nunca é tarde para ter um novo objetivo ou sonhar um sonho novo.",
                "E para os dias sem cor, guarda chuva de flor.",
                "Os sonhos antecedem as conquistas.",
                "Autoconfiança é o primeiro passo para se atingir o sucesso.",
                "De negativo, só quero a barriga.",
                "Um elogio sincero pode mudar o seu dia. Que tal mudar o dia de alguém hoje.",
                "E que nossa vida seja repleta daquilo que nos faz bem."

        };

        int numero = new Random().nextInt(30);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);

    }
}
