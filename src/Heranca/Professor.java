package Heranca;

import java.util.ArrayList;
import java.util.List;

public class Professor extends  Funcionario{
    public List<Turma> turmas = new ArrayList<>();
    public List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg, cargo, salario);
    }

    public void vincularTurma(Turma turma) {
        this.turmas.add(turma);
        System.out.printf("Turma %s vincula com o professor\n", turma.getNomeTurma());
    }

    public void vincularDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
        System.out.printf("Disciplina %s vincula com o professor\n", disciplina.getNomeDisciplina());
    }

    public void imprimirProfessor() {
        imprimirFuncionario();
        System.out.println("Turmas: ");
        for (Turma turma : this.turmas) {
            System.out.println(turma);
        }
        System.out.println("Disciplinas: ");
        for (Disciplina disciplina : this.disciplinas) {
            System.out.println(disciplina);
        }
    }

    public void editarProfessor(String dado, int opcao, Disciplina disciplinaParaAlterar, Turma turmaParaAlterar, int opcao2) {
        switch (opcao) {
            case 1, 2, 3, 4 -> editarFuncionario(dado, opcao);

            case 5 -> {
                if (opcao2 == 1) {
                    for (Disciplina disciplina : this.disciplinas) {
                        if (disciplina.getNomeDisciplina().equalsIgnoreCase(disciplinaParaAlterar.getNomeDisciplina())) {
                            this.disciplinas.remove(disciplina);
                            break;
                        }
                    }
                } else {
                    this.disciplinas.add(disciplinaParaAlterar);
                }
            }

            case 6 -> {
                if (opcao2 == 1) {
                    for (Turma turma : this.turmas) {
                        if (turma.getNomeTurma().equalsIgnoreCase(turmaParaAlterar.getNomeTurma())) {
                            this.turmas.remove(turma);
                            break;
                        }
                    }
                } else {
                    this.turmas.add(turmaParaAlterar);
                }
            }

            default -> System.out.println("Opção inválida.");
        }
    }
}
