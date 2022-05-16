package Heranca;

public class Disciplina {
    private String nomeDisciplina;
    private double nota;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = 0;
    }

    public Disciplina(String nomeDisciplina, double nota) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nomeDisciplina;
    }
}
