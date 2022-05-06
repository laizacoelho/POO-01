package Aula02;

import java.util.Date;

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
        this. cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    @Override
    public String toString() {
        return posicao + ": " + numero + " - " + nome + " (" + apelido + ")" +
                " - " + dataNascimento + " CONDIÇÃO: PODE JOGAR";
        // FAZER AUMTOMÁTICO A CONDIÇÃO DE JOGO e acertar a impressão da data
    }

    boolean verificarCondicaoDeJogo() {


        return false;
    }


}
