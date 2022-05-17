package Heranca;
//https://github.com/UXJPMN/lets-code-3T-exercicios/tree/main/03%20-%20escola

import java.util.Scanner;

public class ExercicioEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean sair = false;
        SistemaEscola escola = new SistemaEscola();
        System.out.println("Inicializando o sistema da escola");
        while (!sair) {
            do {
                System.out.println("1 - Cadastrar disciplina");
                System.out.println("2 - Sair");
                menu = scanner.nextInt();
            } while (menu < 1 || menu > 2);
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("Informe a disciplina");
                String nomeDaDisciplina = scanner.nextLine();
                Disciplina  disciplina = new Disciplina(nomeDaDisciplina);
                escola.disciplinas.add(disciplina);
                } else {
                    if (escola.disciplinas.isEmpty()) {
                        System.out.println("É necessário cadastrar pelo menos 1 disciplina");
                    } else {
                        escola.imprimirDisciplina();
                        sair = true;
                    }
            }
        }
        sair = false;
       // menu = 0;

        while (!sair) {
            do {
                System.out.println("1 - Cadastrar turma");
                System.out.println("2 - Sair");
                menu = scanner.nextInt();
            } while (menu < 1 || menu > 2);
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("Informe a turma");
                String nomeDaTurma = scanner.nextLine();
                Turma turma = new Turma(nomeDaTurma);
                escola.turmas.add(turma);
            } else {
                if (escola.turmas.isEmpty()) {
                    System.out.println("É necessário cadastrar ao menos uma turma");
                } else {
                    escola.imprimirTurma();
                    sair = true;
                }
            }
        }
        sair = false;
       // menu = 0;

        while (!sair) {
            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastrar uma pessoa");
                System.out.println("2 - Cadastrar disciplinas");
                System.out.println("3 - Cadastrar turma");
                System.out.println("4 - Cadastrar notas de aluno");
                System.out.println("5 - Editar dados de uma pessoa");
                System.out.println("6 - Imprimir dados de uma pessoa");
                System.out.println("7 - Excluir uma pessoa do cadastro");
                System.out.println("8 - Imprimir turmas cadastradas");
                System.out.println("9 - Imprimir disciplinas cadastradas;");
                System.out.println("0 - Sair");
                menu = scanner.nextInt();

            } while(menu < 0 || menu > 9);
            scanner.nextLine();

            int opcao;
            switch (menu) {
                case 1 -> {
                    do {
                        System.out.println("Escolha a opção desejada:");
                        System.out.println("1 - Cadastrar um aluno");
                        System.out.println("2 - Cadastrar um funcionário");
                        opcao = scanner.nextInt();

                    } while (opcao < 1 || opcao > 2);
                    scanner.nextLine();
                    System.out.println("Informe o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o CPF:");
                    String cpf = scanner.nextLine();
                    System.out.println("Informe o RG:");
                    String rg = scanner.nextLine();
                    if (opcao == 1) {
                        System.out.println("Informe a idade:");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        escola.imprimirTurma();
                        System.out.println("Informe a turma:");
                        String turma = scanner.nextLine();
                        Turma turmaDoAluno = escola.procurarTurma(turma);
                        if (turmaDoAluno != null) {
                            Aluno aluno = new Aluno(nome, cpf, rg, idade, turmaDoAluno);
                            escola.alunos.add(aluno);
                        }
                    } else {
                        System.out.println("Informe o cargo:");
                        String cargo = scanner.nextLine();
                        System.out.println("Informe o salário:");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        Funcionario funcionario = new Funcionario(nome, cpf, rg, cargo, salario);
                        escola.funcionarios.add(funcionario);
                        if (cargo.equalsIgnoreCase("professor")) {
                            // opcao = 0;
                            Professor professor = new Professor(nome, cpf, rg, cargo, salario);
                            escola.professores.add(professor);
                            boolean cadastroConcluido = false;
                            while (!cadastroConcluido) {
                                do {
                                    System.out.println("1 - Informar a turma que este professor irá dar aula.");
                                    System.out.println("2 - Concluir o cadastro de turmas deste professor");
                                    opcao = scanner.nextInt();

                                } while (opcao < 1 || opcao > 2);
                                scanner.nextLine();

                                if (opcao == 2 && professor.turmas.isEmpty()) {
                                    System.out.println("Necessário cadastrar ao menos uma turma para o professor.");
                                } else if (opcao == 1) {
                                    escola.imprimirTurma();
                                    System.out.println("Informe a turma: ");
                                    String nomeDaTurma = scanner.nextLine();
                                    Turma turma = escola.procurarTurma(nomeDaTurma);
                                    if (turma != null) {
                                        professor.vincularTurma(turma);
                                    }
                                } else {
                                    cadastroConcluido = true;
                                }
                            }
                            cadastroConcluido = false;
                            while (!cadastroConcluido) {
                                do {
                                    System.out.println("1 - Informar a disciplina que este professor irá dar aula.");
                                    System.out.println("2 - Concluir o cadastro de disciplinas deste professor");
                                    opcao = scanner.nextInt();

                                } while (opcao < 1 || opcao > 2);
                                scanner.nextLine();

                                if (opcao == 2 && professor.disciplinas.isEmpty()) {
                                    System.out.println("Necessário cadastrar ao menos uma disciplina para o professor.");
                                } else if (opcao == 1) {
                                    escola.imprimirDisciplina();
                                    System.out.println("Informe a Disciplina: ");
                                    String nomeDaDisciplina = scanner.nextLine();
                                    Disciplina disciplina = escola.procurarDisciplina(nomeDaDisciplina);
                                    if (disciplina != null) {
                                        professor.vincularDisciplina(disciplina);
                                    }
                                } else {
                                    cadastroConcluido = true;
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Informe a disciplina");
                    String nomeDaDisciplina = scanner.nextLine();
                    Disciplina disciplina = new Disciplina(nomeDaDisciplina);
                    escola.disciplinas.add(disciplina);
                }
                case 3 -> {
                    System.out.println("Informe a turma");
                    String nomeDaTurma = scanner.nextLine();
                    Turma turma = new Turma(nomeDaTurma);
                    escola.turmas.add(turma);
                }
                case 4 -> {
                    do {
                        System.out.println("1 - Informar nota do aluno");
                        System.out.println("2 - Sair");
                        opcao = scanner.nextInt();

                    } while (opcao < 1 || opcao > 2);
                    scanner.nextLine();
                    if (opcao == 1) {
                        System.out.println("Qual o cpf do aluno?");
                        String cpfParaNota = scanner.nextLine();
                        Aluno aluno = escola.procurarAluno(cpfParaNota);
                        if (aluno != null) {
                            System.out.println("Qual a disciplina?");
                            String nomeDisciplinaParaNota = scanner.nextLine();
                            Disciplina disciplinaParaNota = escola.procurarDisciplina(nomeDisciplinaParaNota);
                            if (disciplinaParaNota != null) {
                                System.out.println("Informe a nota:");
                                double nota = scanner.nextDouble();
                                scanner.nextLine();
                                aluno.lancarNota(nota, disciplinaParaNota);
                            }
                        } else {
                            System.out.println("CPF inváliado. Não existe cadastro deste aluno no sistema da escola.");
                        }
                    }
                }
                case 5 -> {
                    String dado;
                    System.out.println("Informe o cpf:");
                    String cpfPessoaParaEditar = scanner.nextLine();
                    Aluno alunoParaEditar = escola.procurarAluno(cpfPessoaParaEditar);
                    System.out.println("O que deseja editar?");
                    System.out.println("1 - Nome");
                    System.out.println("2 - CPF");
                    System.out.println("3 - RG");
                    if (alunoParaEditar != null) {
                        System.out.println("4 - Idade");
                        System.out.println("5 - Turma");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        if (opcao == 5) {
                            escola.imprimirTurma();
                            System.out.println("Informe o novo dado:");
                            dado = scanner.nextLine();
                            Turma editarTurmaDoAluno = escola.procurarTurma(dado);
                            alunoParaEditar.editarAluno(null, opcao, editarTurmaDoAluno);
                        } else {
                            System.out.println("Informe o novo dado:");
                            dado = scanner.nextLine();
                            alunoParaEditar.editarAluno(dado, opcao, null);
                        }

                    } else {
                        Professor professorParaEditar = escola.procurarProfessor(cpfPessoaParaEditar);
                        if (professorParaEditar != null) {
                            System.out.println("4 - Salário");
                            System.out.println("5 - Disicplina");
                            System.out.println("6 - Turma");
                            opcao = scanner.nextInt();
                            scanner.nextLine();
                            if (opcao == 5 || opcao == 6) {
                                if (opcao == 5) {
                                    System.out.println("1 - Excluir uma disciplina");
                                    System.out.println("2 - Incluir uma disciplina");
                                    int opcao2 = scanner.nextInt();
                                    scanner.nextLine();
                                    if (opcao2 == 1 || opcao2 == 2) {
                                        escola.imprimirDisciplina();
                                        System.out.println("Informe a disciplina que deseja incluir/excluir:");
                                        dado = scanner.nextLine();
                                        Disciplina disciplinaParaAlterar = escola.procurarDisciplina(dado);
                                        if (disciplinaParaAlterar != null) {
                                            professorParaEditar.editarProfessor(null, opcao, disciplinaParaAlterar, null, opcao2);
                                        }
                                    } else {
                                        System.out.println("Opcao inválida.");
                                    }
                                } else {
                                    System.out.println("1 - Excluir uma turma");
                                    System.out.println("2 - Incluir uma turma");
                                    int opcao2 = scanner.nextInt();
                                    scanner.nextLine();
                                    if (opcao2 == 1 || opcao2 == 2) {
                                        escola.imprimirTurma();
                                        System.out.println("Informe a turma que deseja incluir/excluir:");
                                        dado = scanner.nextLine();
                                        Turma turmaParaAlterar = escola.procurarTurma(dado);
                                        if (turmaParaAlterar != null) {
                                            professorParaEditar.editarProfessor(null, opcao, null, turmaParaAlterar, opcao2);
                                        }
                                    } else {
                                        System.out.println("Opção inválida");
                                    }
                                }
                            } else {
                                System.out.println("Informe o novo dado:");
                                dado = scanner.nextLine();
                                professorParaEditar.editarProfessor(dado, opcao, null, null, 0);
                            }

                        } else {
                            Funcionario funcionarioParaEditar = escola.procurarFuncionario(cpfPessoaParaEditar);
                            if (funcionarioParaEditar != null) {
                                System.out.println("4 - Salário");
                                System.out.println("5 - Cargo");
                                opcao = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Informe o novo dado:");
                                dado = scanner.nextLine();
                                funcionarioParaEditar.editarFuncionario(dado, opcao);
                            } else {
                                System.out.println("Não existe esta pessoa cadastrada na escola");
                            }
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Informe o cpf:");
                    String cpfPessoaParaImprimir = scanner.nextLine();
                    Aluno aluno = escola.procurarAluno(cpfPessoaParaImprimir);
                    if (aluno != null) {
                        aluno.imprmirAluno();
                    } else {
                        Professor professor = escola.procurarProfessor(cpfPessoaParaImprimir);
                        if (professor != null) {
                            professor.imprimirProfessor();
                        } else {
                            Funcionario funcionario = escola.procurarFuncionario(cpfPessoaParaImprimir);
                            if (funcionario != null) {
                                funcionario.imprimirFuncionario();
                            } else {
                                System.out.println("Não existe esta pessoa cadastrada na escola");
                            }
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Informe o cpf");
                    String cpfPessoaParaExcluir = scanner.nextLine();
                    escola.excluirPessoaDoSistema(cpfPessoaParaExcluir);
                }
                case 8 -> escola.imprimirTurma();
                case 9 -> escola.imprimirDisciplina();
                case 0 -> {
                    scanner.close();
                    sair = true;
                }
            }
        }
    }

}
