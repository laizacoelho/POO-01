package Polimorfismo;

import java.util.Random;

public class InimigoGenerico extends Personagem {

    public InimigoGenerico(String nome) {
        super(nome);
        vida = 60;
        dano = 10;
    }

    @Override
    public void atacar(Personagem personagem) {
        definirTipoDeDano();
        double danoFinal = personagem.apanhar(dano, defineTipoDeDano);
        System.out.printf("%s casou %.0f de dano\n", nome, danoFinal);
    }

    @Override
    public double apanhar(double danoDoAtaque, int tipoDeDano)
     {
         double danoFinal;

         danoFinal = danoDoAtaque;
         this.vida -= danoFinal;
         System.out.printf("%s recebeu %.0f de dano\n", nome, danoFinal);

         return danoFinal;
    }

    @Override
    public boolean estaVivo() {
        if (vida > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void interagir() {
        System.out.println(nome + ": Por que eu responderia meu inimigo??");
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
