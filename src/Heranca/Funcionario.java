package Heranca;

public class Funcionario extends Pessoa {
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprimirFuncionario() {
        imprimirPessoa();
        System.out.println("Cargo: " + this.cargo);
        System.out.printf("Salário: R$%.2f\n", salario);
    }

    public void editarFuncionario(String dado, int opcao) {
        switch (opcao) {
            case 1, 2, 3 -> editarPessoa(dado, opcao);
            case 4 -> this.salario = Double.parseDouble(dado);
            case 5 -> this.cargo = dado;
        }
    }
}
