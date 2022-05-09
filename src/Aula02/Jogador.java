package Aula02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class Jogador {
    int id;
    String nome;
    String apelido;
    Date dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    Boolean suspenso;
    Boolean jaTreinou = false;

    Jogador() {

    }

    Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade,
            int cartoesAmarelos, int cartaoVermelho, Boolean suspenso){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    @Override
    public String toString() {
        String status = suspenso ? "NÃO PODE JOGAR" : "PODE JOGAR";
        String formato = "yyyy-MM-dd";
        DateFormat dataFormatada = new SimpleDateFormat(formato);
        String data = dataFormatada.format(dataNascimento);

        return posicao + ": " + numero + " - " + nome + " (" + apelido + ")" +
                " - " + data + " CONDIÇÃO: " + status;
        // FAZER AUMTOMÁTICO A CONDIÇÃO DE JOGO e acertar a impressão da data
    }

    boolean verificarCondicaoDeJogo() {
        suspenso = cartaoVermelho >= 1 || cartoesAmarelos > 2;
        return suspenso;
    }

    void aplicarCartaoAmarelo(int quantidade) {
        cartoesAmarelos += quantidade;
        if (cartoesAmarelos > 2) {
            suspenso = true;
        }
    }

    void aplicarCartaoVermelho () {
        cartaoVermelho = 1;
        suspenso = true;
    }

    void cumprirSuspencao() {
        cartaoVermelho = 0;
        cartoesAmarelos = 0;
        suspenso = false;
        System.out.printf("%s cumpriu suspensão e está apto a jogar novamente\n", apelido);
    }

    void sofrerLesao() {
        Random rand = new Random();
        int lesao = rand.nextInt(100) + 1;
        if (lesao <= 40) {
            qualidade--;
        } else if (lesao <= 70) {
            qualidade -= 2;
        } else if (lesao <= 85) {
            qualidade *= 0.95;
        } else if (lesao <= 95) {
            qualidade *= 0.9;
        } else {
            qualidade *= 85;
        }
    }

    void executarTreinamento() {
       if (!jaTreinou) {
           Random rand = new Random();
           int treinar = rand.nextInt(3) + 1;
           qualidade += treinar;
           jaTreinou = true;
       } else {
           System.out.printf("%s já treinou antes da patida.\n", apelido);
       }
    }
}
