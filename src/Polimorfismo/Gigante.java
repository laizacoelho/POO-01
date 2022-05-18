package Polimorfismo;


public class Gigante extends InimigoGenerico {

    public Gigante(String nome) {
        super(nome);
        vida = 130;
        dano = 25;
        vivo = true;
    }

    @Override
    public void atacar(Personagem personagem) {
        if (personagem.vivo) {
            definirTipoDeDano();
            double danoFinal = personagem.apanhar(dano, defineTipoDeDano);
            System.out.printf("%s casou %.0f de dano\n", nome, danoFinal);
            if (personagem.vivo) {
                System.out.println(personagem.nome + " está atordoado");
            }
        }
        else {
            System.out.println(personagem.nome + " está morto!");
        }
        System.out.println();
    }

    @Override
    public double apanhar(double danoDoAtaque, int tipoDeDano)
    {
        double danoFinal;
        if(tipoDeDano == 2) {
            danoFinal = danoDoAtaque*2;
            this.vida -= danoFinal;
            System.out.println(TipoDano.FOGO.getDescricao());
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
    public void interagir() {
        System.out.println(nome + ": O que é um homem??");
        System.out.println();
    }
}
