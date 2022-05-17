package Heranca;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private int idade;
    private Turma turma;
    private List<Disciplina> notas = new ArrayList<>();

    public Aluno(String nome, String cpf, String rg, int idade, Turma turma) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
    }

    public double calcularMediaDasNotas() {
        int countDisciplinas = 0;
        double somaNotas = 0;
        if (notas.isEmpty()) {
            System.out.println(nome + "de cpf " + cpf + " não tem nota cadastrada no sistema");
            return 0;
        }
        for (Disciplina nota : notas) {
            countDisciplinas++;
            somaNotas += nota.getNota();
        }
        return somaNotas/countDisciplinas;
    }

    public void lancarNota (double nota, Disciplina disciplina) {
        disciplina.setNota(nota);
        this.notas.add(disciplina);
        System.out.println("Nota registrada!");
    }

    public void imprmirAluno() {
        System.out.println("Imprimindo dados do aluno:");
        imprimirPessoa();
        System.out.printf("Idade: %d anos\n", this.idade);
        System.out.println("Turma: " + this.turma);
        if (!notas.isEmpty()) {
            for (Disciplina nota :  notas) {
                System.out.println(nota.getNomeDisciplina() + ": " + nota.getNota());
            }
            double mediaDasNotas = calcularMediaDasNotas();
            System.out.printf("Nota média: %.2f\n", mediaDasNotas);
        }
    }

    public void editarAluno (String dado, int opcao,Turma turma) {
        switch (opcao) {
            case 1, 2, 3 -> editarPessoa(dado, opcao);
            case 4 -> this.idade = Integer.parseInt(dado);
            case 5 -> this.turma = turma;
            default -> System.out.println("Opção inválida");
        }
    }
}
