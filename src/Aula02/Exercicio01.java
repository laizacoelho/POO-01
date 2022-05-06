package Aula02;

import java.util.Date;

public class Exercicio01 {
    public static void main(String[] args) {
        Date aniversario01 = new Date(1996,5,8);
        Jogador jogador01 = new Jogador(1, "Claudio Taffarel", "Taffarel", aniversario01,1,"goleiro",100,0,0, false);
        System.out.println(jogador01);

        Date aniversario02 = new Date(1964,8,17);
        Jogador jogador02 = new Jogador(2,"Jorge de Amorim", "Jorginho", aniversario02, 2, "lateral direito", 100, 0,0, false);
        System.out.println(jogador02);

        Date aniversario03 = new Date(1969,9,15);
        Jogador jogador03 = new Jogador(3, "Márcio Santos", "Márcio Santos", aniversario03, 15, "zagueiro", 100, 0,0,false);
        System.out.println(jogador03);

        Date aniversario04 = new Date(1962,9,11);
        Jogador jogador04 = new Jogador(4,"Ricardo Rocha", "Ricardo Rocha", aniversario04, 3, "zagueiro", 100,0,0,false);
        System.out.println(jogador04);

        Date aniversario05 = new Date(1969,9,5);
        Jogador jogador05 = new Jogador(5, "Leonardo Nascimento", "Leonardo", aniversario05, 16, "lateral esquerdo", 100,0,0,false);
        System.out.println(jogador05);

        Date aniversario06 = new Date(1968,1,12);
        Jogador jogador06 = new Jogador(6, "Mauro Silva", "Mauro Silva", aniversario06, 5, "volante", 100, 0,0, false);
        System.out.println(jogador06);

        Date aniversario07 = new Date(1963,10,31);
        Jogador jogador07 = new Jogador(7, "Carlos Verri", "Dunga", aniversario07, 8,"volante", 100, 0,0,false);
        System.out.println(jogador07);

        Date aniversario08 = new Date(1967,6,17);
        Jogador jogador08 = new Jogador(8, "Crizam Filho", "Zinho", aniversario08, 9, "meio campo", 100,0,0,false);
        System.out.println(jogador08);

        Date aniversario09 = new Date(1965,5,15);
        Jogador jogador09 = new Jogador(9, "Raí de Oliveira", "Raí", aniversario09, 10, "meio campo", 100,0,0, false);
        System.out.println(jogador09);

        Date aniversario10 = new Date(1964,2,16);
        Jogador jogador10 = new Jogador(10, "José Roberto", "Bebeto", aniversario10, 7, "atacante", 100,0,0, false);
        System.out.println(jogador10);

        Date aniversario11 = new Date(1966,1,29);
        Jogador jogador11 = new Jogador(11, "Romário de Souza", "Romário", aniversario11, 11, "centroavante", 100,0,0,false);
        System.out.println(jogador11);

    }
}
