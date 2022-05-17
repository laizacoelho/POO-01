package Heranca;

import java.util.ArrayList;
import java.util.List;

public class SistemaEscola {
    public List<Aluno> alunos = new ArrayList<>();
    public List<Funcionario> funcionarios = new ArrayList<>();
    public List<Professor> professores = new ArrayList<>();
    public List<Disciplina> disciplinas = new ArrayList<>();
    public List<Turma> turmas = new ArrayList<>();

    public SistemaEscola() {
    }

    public Turma procurarTurma(String nomeDaTurma) {
        for (Turma  turma : turmas) {
            if (turma.getNomeTurma().equalsIgnoreCase(nomeDaTurma)) {
                return turma;
            }
        }
        System.out.println("Não existe esta turma cadastrada na escola");
        return null;
    }

    public Disciplina procurarDisciplina(String nomeDaDisciplina) {
        for (Disciplina  disciplina : disciplinas) {
            if (disciplina.getNomeDisciplina().equalsIgnoreCase(nomeDaDisciplina)) {
                return disciplina;
            }
        }
        System.out.println("Não existe esta turma cadastrada na escola");
        return null;
    }

    public Funcionario procurarFuncionario(String cpfFuncionario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpfFuncionario)) {
                return funcionario;
            }
        }
        return null;
    }

    public Professor procurarProfessor(String cpfProfessor) {
        for (Professor professor : professores) {
            if (professor.getCpf().equals(cpfProfessor)) {
                return professor;
            }
        }
        return null;
    }

    public Aluno procurarAluno(String cpfAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpfAluno)) {
                return aluno;
            }
        }
        return null;
    }

    public void excluirPessoaDoSistema(String cpf) {
        boolean foiExcluido = false;
        Aluno aluno = procurarAluno(cpf);
        if (aluno != null) {
            alunos.remove(aluno);
            foiExcluido = true;
        } else {
            Professor professor = procurarProfessor(cpf);
            if (professor != null) {
                professores.remove(professor);
                foiExcluido = true;
            }
            Funcionario funcionario = procurarFuncionario(cpf);
            if (funcionario != null) {
                funcionarios.remove(funcionario);
                foiExcluido = true;
            }
        }
        if (foiExcluido) {
            System.out.println("Excluído do sistema com sucesso.");
        } else {
            System.out.println("CPF inválido. Não existe esta pessoa no sistema da escola");
        }
    }

    public void imprimirDisciplina() {
        System.out.println("Disciplinas cadastras no sistema da escola:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }

    public void imprimirTurma() {
        System.out.println("Turmas cadastras no sistema da escola:");
        for (Turma turma : turmas) {
            System.out.println(turma);
        }
    }
}
