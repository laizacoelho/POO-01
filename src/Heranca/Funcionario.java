package Heranca;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

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
}
