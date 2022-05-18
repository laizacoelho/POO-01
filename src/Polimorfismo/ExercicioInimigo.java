package Polimorfismo;

public class ExercicioInimigo {
    public static void main(String[] args) {
        Personagem cobra = new Cobra("Nagini");
        Personagem vampiro = new Vampiro("Dráucla");
        Personagem gigante = new Gigante("Golias");
        Personagem heroi = new Heroi("Herói");

        cobra.interagir();
        cobra.atacar(heroi);
        heroi.atacar(cobra);

        vampiro.interagir();
        vampiro.atacar(heroi);
        heroi.atacar(vampiro);

        gigante.interagir();
        gigante.atacar(heroi);
        heroi.atacar(gigante);
        gigante.atacar(heroi);
        heroi.atacar(gigante);
        gigante.atacar(heroi);
        heroi.atacar(gigante);
        heroi.atacar(gigante);
        heroi.atacar(gigante);
        heroi.atacar(gigante);
        heroi.atacar(gigante);

        System.out.println("vida do herói: " + heroi.vida);

    }
}
