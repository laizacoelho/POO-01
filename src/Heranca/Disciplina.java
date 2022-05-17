package Heranca;

public class Disciplina {
    private String nomeDisciplina;
    private double nota;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = 0;
    }

    public void setNota(double nota) {
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
