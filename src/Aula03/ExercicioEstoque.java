package Aula03;
//https://github.com/UXJPMN/lets-code-3T-exercicios

import java.util.Scanner;

public class ExercicioEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Estoque_da_Loja");
        Produto macbook = new Produto("Macbook", "eletrônico", "notebook", 5, "apple");
        estoque.inserirProduto(macbook);
        Produto cama = new Produto("Cama", "móvel", "casal", 6, "sem marca");
        Produto macbook2 = new Produto("Macbook", "eletrônico", "notebook", 3, "apple");
        estoque.inserirProduto(cama);
        estoque.deletarProduto(macbook);
        estoque.imprimirListaDeProdutosEstoque();
        cama.editarProduto();
        estoque.imprimirListaDeProdutosEstoque();
    }

    void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um estoque");
            System.out.println("2 - Cadastrar um produto");
            System.out.println("3 - Editar um produto");
            System.out.println("4 - Excuir um produto");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
        } while (opcao < 1 || opcao > 5 );
        scanner.nextLine();
        switch (opcao) {
            case 1:
                System.out.println("Informe o nome do estoque");
                String nomeEstoque = scanner.nextLine();
                //Estoque
        }
    }
}
