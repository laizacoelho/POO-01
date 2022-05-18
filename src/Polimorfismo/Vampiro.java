package Polimorfismo;


public class Vampiro extends  InimigoGenerico {

    public Vampiro(String nome) {
        super(nome);
        vida = 100;
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
                System.out.println(personagem.nome + " está sangrando");
            }
        } else {
            System.out.println(personagem.nome + " está morto!");
        }
        System.out.println();

    }

    @Override
    public double apanhar(double danoDoAtaque, int tipoDeDano)
     {
         double danoFinal;
         if(tipoDeDano == 1) {
             danoFinal = danoDoAtaque * 2;
             this.vida -= danoFinal;
             System.out.println(TipoDano.PERFURANTE.getDescricao());
             System.out.printf("%s recebeu %.0f de dano\n", nome, danoFinal);
         } else {
             danoFinal = danoDoAtaque;
             this.vida -= danoFinal;
             System.out.printf("%s recebeu %.0f de dano\n", nome, danoFinal);
         }

         this.vivo = estaVivo();
         if (!vivo) {
             System.out.println(nome + " está morto!");
         }

         return danoFinal;
    }


    @Override
    public  void interagir() {
        System.out.println(nome + ": O que é um homem??");
        System.out.println();
    }

}
