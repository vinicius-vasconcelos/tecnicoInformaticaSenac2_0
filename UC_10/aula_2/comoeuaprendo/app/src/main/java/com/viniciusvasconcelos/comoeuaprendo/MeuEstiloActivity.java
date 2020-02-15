package com.viniciusvasconcelos.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MeuEstiloActivity extends AppCompatActivity {

    private ArrayList<Pergunta> perguntas;
    private TextView tvPergunta;
    private TextView tvNum;
    private int i;

    private Tipo auditivo;
    private Tipo cinestesico;
    private Tipo leitura;
    private Tipo visual;

    private Button btnSim;
    private Button btnNao;
    private Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_estilo);

        tvPergunta = findViewById(R.id.tvPergunta);
        tvNum = findViewById(R.id.tvNum);
        btnSim = findViewById(R.id.btnSim);
        btnNao = findViewById(R.id.btnNao);
        btnSair = findViewById(R.id.btnSair);
        btnSair.setVisibility(View.INVISIBLE);

        criaTipos();
        criarPergunta();

        i = 0;
        game(i);
    }

    public void criaTipos() {
        auditivo = new Tipo("AUDITVO");
        cinestesico = new Tipo("CINESTÉSICO");
        leitura = new Tipo("LEITURA E ESCRITA");
        visual = new Tipo("VISUAL");
    }

    public void criarPergunta() {
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
    }

    public void game(int per) {
        if(per < perguntas.size()) {
            tvNum.setText(String.valueOf(i+1));
            tvPergunta.setText(perguntas.get(i).getEnunciado());
        }
        else
            exibeResultado();
    }

    public void onClickSim(View v) {
        perguntas.get(i).setResp(true);
        perguntas.get(i).getTipo().setCount(perguntas.get(i).getTipo().getCount() + 1);
        game(++i);
    }

    public void onClickNao(View v) {
        game(++i);
    }

    private void exibeResultado() {
        Tipo arr[] = new Tipo [4];
        arr[0] = this.auditivo;
        arr[1] = this.cinestesico;
        arr[2] = this.leitura;
        arr[3] = this.visual;
        Tipo aux;
        int tl = arr.length;


        while (tl > 1) {
            for(int j = 0; j < tl-1; j++) {
                if(arr[j].getCount() > arr[j+1].getCount()) {
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
            tl--;
        }


       String result = "";
        for(int j = arr.length-1; j >= 0; j--) {
            result += arr[j].getTipo() + ": " + arr[j].getCount() + "\n";
        }

       //result += "\n\nParabéns você é: " + arr[arr.length-1].getTipo();

       /*tvNum.setText("");
       tvPergunta.setText(result);

        btnSim.setVisibility(View.INVISIBLE);
       btnNao.setVisibility(View.INVISIBLE);
       btnSair.setVisibility(View.VISIBLE);*/

      Intent intent = new Intent(this, ResultadoFinalEstiloActivity.class);
      intent.putExtra("res", result);
      intent.putExtra("btnRes", arr[arr.length-1].getTipo());
      startActivity(intent);
    }
}
