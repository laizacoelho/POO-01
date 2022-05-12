package Aula02;
//https://docs.google.com/document/d/1L31TwnI-GE16wuMo-81K2ttmbAPfDHdraFScKRu-juU/edit

import java.util.Calendar;
import java.util.Date;

public class Exercicio01 {
    public static void main(String[] args) {
        Date aniversario01 = new Date(96, Calendar.MAY,8);
        Jogador jogador01 = new Jogador(1, "Claudio Taffarel", "Taffarel", aniversario01,1,"Goleiro",100,0,0, false);
        jogador01.verificarCondicaoDeJogo();

        Date aniversario02 = new Date(64, Calendar.AUGUST,17);
        Jogador jogador02 = new Jogador(2,"Jorge de Amorim", "Jorginho", aniversario02, 2, "Lateral direito", 100, 0,0, false);
        jogador02.verificarCondicaoDeJogo();

        Date aniversario03 = new Date(69, Calendar.SEPTEMBER,15);
        Jogador jogador03 = new Jogador(3, "Márcio Santos", "Márcio Santos", aniversario03, 15, "Zagueiro", 100, 0,0,false);
        jogador03.verificarCondicaoDeJogo();

        Date aniversario04 = new Date(62, Calendar.SEPTEMBER,11);
        Jogador jogador04 = new Jogador(4,"Ricardo Rocha", "Ricardo Rocha", aniversario04, 3, "Zagueiro", 100,0,0,false);
        jogador04.verificarCondicaoDeJogo();

        Date aniversario05 = new Date(69, Calendar.SEPTEMBER,5);
        Jogador jogador05 = new Jogador(5, "Leonardo Nascimento", "Leonardo", aniversario05, 16, "Lateral esquerdo", 100,0,1,false);
        jogador05.verificarCondicaoDeJogo();

        Date aniversario06 = new Date(68, Calendar.JANUARY,12);
        Jogador jogador06 = new Jogador(6, "Mauro Silva", "Mauro Silva", aniversario06, 5, "Volante", 100, 0,0, false);
        jogador06.verificarCondicaoDeJogo();

        Date aniversario07 = new Date(63, Calendar.OCTOBER,31);
        Jogador jogador07 = new Jogador(7, "Carlos Verri", "Dunga", aniversario07, 8,"Volante", 100, 0,0,false);
        jogador07.verificarCondicaoDeJogo();

        Date aniversario08 = new Date(67, Calendar.JUNE,17);
        Jogador jogador08 = new Jogador(8, "Crizam Filho", "Zinho", aniversario08, 9, "Meio campo", 100,0,0,false);
        jogador08.verificarCondicaoDeJogo();

        Date aniversario09 = new Date(65, Calendar.MAY,15);
        Jogador jogador09 = new Jogador(9, "Raí de Oliveira", "Raí", aniversario09, 10, "Meio campo", 100,0,0, false);
        jogador09.verificarCondicaoDeJogo();

        Date aniversario10 = new Date(64, Calendar.FEBRUARY,16);
        Jogador jogador10 = new Jogador(10, "José Roberto", "Bebeto", aniversario10, 7, "Atacante", 100,0,0, false);
        jogador10.verificarCondicaoDeJogo();

        Date aniversario11 = new Date(66, Calendar.JANUARY,29);
        Jogador jogador11 = new Jogador(11, "Romário de Souza", "Romário", aniversario11, 11, "Centroavante", 100,0,0,false);
        jogador11.verificarCondicaoDeJogo();

        jogador04.aplicarCartaoAmarelo(3);

        jogador02.aplicarCartaoVermelho();
        jogador02.cumprirSuspencao();

        jogador10.sofrerLesao();
        jogador10.executarTreinamento();
        jogador10.executarTreinamento();

        jogador11.aplicarCartaoAmarelo(2);
        jogador11.aplicarCartaoAmarelo(1);

        System.out.println(jogador01);
        System.out.println(jogador02);
        System.out.println(jogador03);
        System.out.println(jogador04);
        System.out.println(jogador05);
        System.out.println(jogador06);
        System.out.println(jogador07);
        System.out.println(jogador08);
        System.out.println(jogador09);
        System.out.println(jogador10);
        System.out.println(jogador11);
    }
}
