package Heranca;
//https://github.com/UXJPMN/lets-code-3T-exercicios/tree/main/03%20-%20escola

import java.util.Scanner;

public class ExercicioEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
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
                escola.imprimirDisciplina();
                sair = true;
            }
        }
        sair = false;
        menu = 0;

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
                escola.imprimirTurma();
                sair = true;
            }
        }
        sair = false;
        menu = 0;

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
                menu = scanner.nextInt();

            } while(menu < 1 || menu > 7);
            int opcao = 0;
            switch(menu) {
                case 1:
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
                        System.out.println("Informe a turma:");
                        String turma = scanner.nextLine();
                        Aluno aluno = new Aluno(nome, cpf, rg, idade, turma);
                        escola.alunos.add(aluno);
                    } else {
                        System.out.println("Informe o cargo:");
                        String cargo = scanner.nextLine();
                        System.out.println("Informe o salário:");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        Funcionario funcionario = new Funcionario(nome, cpf, rg, cargo, salario);
                        escola.funcionarios.add(funcionario);
                        if (cargo.equalsIgnoreCase("professor")) {
                            opcao = 0;
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
                    break;
                case 2:
                    System.out.println("Informe a disciplina");
                    String nomeDaDisciplina = scanner.nextLine();
                    Disciplina  disciplina = new Disciplina(nomeDaDisciplina);
                    escola.disciplinas.add(disciplina);
                    break;
                case 3:
                    System.out.println("Informe a turma");
                    String nomeDaTurma = scanner.nextLine();
                    Turma turma = new Turma(nomeDaTurma);
                    escola.turmas.add(turma);
                    break;
                case 4:
                    opcao = 0;
                    do {
                        System.out.println("1 - Informar nota do aluno");
                        System.out.println("2 - Sair");
                        opcao = scanner.nextInt();

                    } while (opcao < 1 || opcao > 2);
                    scanner.nextLine();

                    if (opcao == 1){
                        System.out.println("Qual o cpf do aluno?");
                        String cpfParaNota = scanner.nextLine();
                        Aluno aluno = escola.procurarAluno(cpfParaNota);
                        if (aluno != null) {
                            System.out.println("Qual a disciplina?");
                            String nomeDisciplinaParaNota = scanner.nextLine();
                            Disciplina disciplinaParaNota = escola.procurarDisciplina(nomeDisciplinaParaNota);
                        }

                        
                    }

            }

        }





/*


        scanner.nextLine();
        if (escola.pessoas == null) {
            System.out.println("Não há nenhuma pessoa cadastrada no sistema da escola");
        } else {
            switch (menu) {
                case 1:
                    int opcao = 0;
                    do {
                        System.out.println("Escolha a opção desejada:");
                        System.out.println("1 - Cadastrar um aluno");
                        System.out.println("2 - Cadastrar um funcionário");
                        opcao = scanner.nextInt();

                    } while(opcao < 1 || opcao > 2);
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
                        System.out.println("Informe a turma:");
                        String turma = scanner.nextLine();
                        Aluno aluno = new Aluno(nome, cpf, rg, idade, turma);
                    } else {
                        System.out.println("Informe o cargo:");
                        String cargo = scanner.nextLine();
                        System.out.println("Informe o salário:");
                        double salario = scanner.nextDouble();
                        Funcionario funcionario = new Funcionario(nome, cpf, rg, cargo, salario);
                        if (cargo.equalsIgnoreCase("professor")) {
                            System.out.println("Informe uma disciplina que este professor dará aula");
                            String disciplina = scanner.nextLine();
                            Disciplina  disciplina1 = new Disciplina(disciplina);
                            escola.disciplinas.add(disciplina1);
                            while(true) {
                                System.out.println("Este professor dará outra disciplina");
                                System.out.println("1 - sim");
                                System.out.println("2 - não");
                                int resposta = scanner.nextInt();
                                if (resposta == 1) {
                                    System.out.println("Qual o nome da disciplina?");
                                    String outraDisciplina = scanner.nextLine();
                                    Disciplina outraDiscplina1 = new Disciplina(outraDisciplina);
                                    escola.disciplinas.add(outraDiscplina1);
                                } else {
                                    scanner.nextLine();
                                    break;
                                }
                            }
                            Professor professor = new Professor(nome, cpf, rg, cargo, salario, escola.disciplinas);
                        }

                    }



                case 2:

                case 3:
                    if (escola.alunos == null) {
                        System.out.println("Não há nenhum aluno cadastrado no sistema da escola.");
                    } else {

                    }

                case 4:

                case 5:

                case 6:
            }
        } */


    }

}
