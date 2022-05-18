package Polimorfismo;

public abstract class Personagem {
    protected String nome;
    protected double vida;
    protected double dano;
    protected int defineTipoDeDano;
    protected  boolean vivo;

    public Personagem(String nome) {
        this.nome = nome;

    }

    public abstract void atacar(Personagem personagem);

    public abstract double apanhar(double danoDoAtaque, int tipoDeDano);

    public abstract boolean estaVivo();

    public abstract void interagir();

    public abstract void definirTipoDeDano();
}
