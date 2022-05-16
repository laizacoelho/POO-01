package Heranca;

import java.util.ArrayList;
import java.util.List;

public class Professor extends  Funcionario{
    public List<Turma> turmas = new ArrayList<>();
    public List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg, cargo, salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
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
        for (Turma turma : turmas) {
            System.out.println(turma);
        }
        System.out.println("Disciplinas: ");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }


}
