package com.viniciusvasconcelos.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MeuEstiloActivity extends AppCompatActivity {

    /*private ArrayList<Pergunta> perguntas;
    private TextView tvPergunta;
    private int i;

    private Tipo auditivo;
    private Tipo cinestesico;
    private Tipo leitura;
    private Tipo visual;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_estilo);

       // tvPergunta = findViewById(R.id.tvPergunta);
       // criarPergunta();
        //criaTipos();
        //i = 0;
        //game(i);
    }

    /*public void criaTipos() {
        auditivo = new Tipo("AUDITVO");
        cinestesico = new Tipo("CINESTÉSICO");
        leitura = new Tipo("LEITURA E ESCRITA");
        visual = new Tipo("VISUAL");
    }*/

    /*public void criarPergunta() {
        perguntas = new ArrayList();

        perguntas.add(new Pergunta("Você é bom ouvinte.", auditivo));
        perguntas.add(new Pergunta("Você lê tudo o que você tem na frente, desde jornais a caixas de cereais.", leitura));
        perguntas.add(new Pergunta("Você é cheio de energia, fisicamente ativo (pratica atividades físicas regularmente).", cinestesico));


        perguntas.add(new Pergunta("Você cantarola ou canta em voz alta frequência.", auditivo));
        perguntas.add( new Pergunta("Você possui um vocabulário amplo.", leitura));
        perguntas.add(new Pergunta("Muitas vezes, você rabisca quando tem caneta e papel à mão.", leitura));


        perguntas.add(new Pergunta("Você aprecia realizar atividades em grupo, como jogos de tabuleiro.", visual));
        perguntas.add(new Pergunta("Você usa exemplos específicos quando expõe seus pontos de vista.", leitura));
        perguntas.add(new Pergunta("Você tem um bom senso de direção quando viaja.", visual));


        perguntas.add( new Pergunta("Você é um bom comunicador.", auditivo));
        perguntas.add(new Pergunta("Você consegue facilmente expressar o que está pensando.", leitura));
        perguntas.add(new Pergunta("Você organiza suas atividades usando listas de tarefas pendentes.", visual));


        perguntas.add(new Pergunta("Você usa as mãos para falar.", cinestesico));
        perguntas.add(new Pergunta("Você gosta de estar sozinho quando se dedica a algum hobby.", cinestesico));
        perguntas.add(new Pergunta("Você fica animado ao realizar orçamentos e metas financeiras.", visual));


        perguntas.add(new Pergunta("Você tem ciência de seus pontos fortes e fracos.", cinestesico));
        perguntas.add(new Pergunta("Você costuma associar memórias com música.", auditivo));
        perguntas.add(new Pergunta("Você se sente revigorado quando tem um tempo sozinho.", visual));


        perguntas.add(new Pergunta("Você gosta de atividades físicas, tais como jardinagem ou construção", cinestesico));
        perguntas.add(new Pergunta("Você entende melhor as coisas com imagens ou diagramas.", visual));
        perguntas.add(new Pergunta("Você ouve música enquanto cozinha ou estuda.", auditivo));
    }*/

    /*public void game(int per) {
        if(per < perguntas.size())
            tvPergunta.setText(perguntas.get(i).getEnunciado());
        else
            exibeResultado();
    }

    public void onClickSim() {
        perguntas.get(i).setResp(true);
        game(i++);
    }

    public void onClickNao() {
        game(i++);
    }*/

    /*private void exibeResultado() {
        int[] respCount = new int[3];
        Tipo tipMaior;
        int maior;

      for(int i = 0; i < perguntas.size(); i++) {
            if(perguntas.get(i).isResp())
                perguntas.get(i).getTipo().setCount(perguntas.get(i).getTipo().getCount()+1);

            if(perguntas.get(i).getTipo().getCount() > maior){
                tipMaior = perguntas.get(i).getTipo();
                maior = perguntas.get(i).getTipo().getCount();
            }
       }

        tvPergunta.setText("Seu estilo de aprendizado é: " + perguntas.get(i).getTipo().getTipo());

    }*/
}
