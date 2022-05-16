package Heranca;

public class Turma {
    private String nomeTurma;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    @Override
    public String toString() {
        return nomeTurma;
    }
}
