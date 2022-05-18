package Polimorfismo;

import java.util.Random;

public class Heroi extends Personagem{

    public Heroi(String nome) {
        super(nome);
        vida = 250;
        dano = 20;
        vivo = true;
    }

    @Override
    public  void atacar(Personagem personagem) {
        if (personagem.vivo) {
            definirTipoDeDano();
            double danoFinal = personagem.apanhar(dano, defineTipoDeDano);
            System.out.printf("%s casou %.0f de dano\n", nome, danoFinal);
            if (personagem.vivo) {
                System.out.println(personagem.nome + " está incapacitado");
            }
        }
        else {
            System.out.println(personagem.nome + " está morto!");
        }
        System.out.println();
    }

    @Override
    public  double apanhar(double danoDoAtaque, int tipoDeDano) {
        double danoFinal;

        danoFinal = danoDoAtaque;
        this.vida -= danoFinal;
        System.out.printf("%s recebeu %.0f de dano\n", nome, danoFinal);

        return danoFinal;
    }

    @Override
    public boolean estaVivo() {
        if (vida >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public  void interagir() {

    }

    @Override
    public void definirTipoDeDano() {
        Random random = new Random();
        defineTipoDeDano = random.nextInt(3) + 1;
        // 1 - Perfurante
        // 2 - Fogo
        // 3 - Pancada
    }
}
