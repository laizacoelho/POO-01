package Heranca;

public class Pessoa {
    protected  String nome;
    protected String cpf;
    protected String rg;

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    public void imprimirPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("RG: " + this.rg);
    }

    public String getCpf() {
        return cpf;
    }

    protected void editarPessoa(String dado, int opcao) {
        switch (opcao) {
            case 1 -> this.nome = dado;
            case 2 -> this.cpf = dado;
            case 3 -> this.rg = dado;
        }
    }
}
