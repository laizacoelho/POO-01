package Aula03;
//https://github.com/UXJPMN/lets-code-3T-exercicios

import java.util.Scanner;

public class ExercicioEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        System.out.println("Informe o nome do estoque para cadastro");
        String nomeEstoque = scanner.nextLine();
        Estoque estoque = new Estoque(nomeEstoque);
        boolean sair = false;

        while(!sair) {
            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastrar um produto no estoque");
                System.out.println("2 - Editar um produto");
                System.out.println("3 - Excuir um produto");
                System.out.println("4 - Imprmir produtos do estoque");
                System.out.println("5 - Sair");
                opcao = scanner.nextInt();
            } while (opcao < 1 || opcao > 5);
            scanner.nextLine();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Qual o nome do produto?");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Qual a sessão deste produto?");
                    String nomeSessao = scanner.nextLine();
                    System.out.println("Qual o tipo deste produto?");
                    String nomeTipo = scanner.nextLine();
                    System.out.println("Qual a quantidade?");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Qual a marca deste produto?");
                    String nomeMarca = scanner.nextLine();
                    Produto novoProduto = new Produto(nomeProduto, nomeSessao, nomeTipo, quantidade, nomeMarca);
                    estoque.inserirProdutoNoEstoque(novoProduto);
                    System.out.println(nomeProduto + " cadastrado!");
                }
                case 2 -> {
                    estoque.imprimirListaDeProdutosEstoque();
                    System.out.println("Informe o ID do produto que deseja editar:");
                    String idProdutoParaEditar = scanner.nextLine();
                    Produto produtoParaEditar = estoque.procurarProdutoNoEstoque(idProdutoParaEditar);
                    if (produtoParaEditar == null) {
                        System.out.println("Não existe este produto no estoque");
                    } else {
                        int menu;
                        do {
                            System.out.println("O que deseja editar?");
                            System.out.println("1 - Nome do produto");
                            System.out.println("2 - Sessão");
                            System.out.println("3 - Tipo");
                            System.out.println("4 - Quantidade");
                            System.out.println("5 - Marca");
                            System.out.println("6 - Cancelar");
                            menu = scanner.nextInt();
                        } while ( menu < 1 || menu > 6);
                        scanner.nextLine();
                        System.out.println("Digite o novo");
                        String novoDado = scanner.nextLine();
                        produtoParaEditar.editarProduto(menu, novoDado);
                    }
                }
                case 3 -> {
                    estoque.imprimirListaDeProdutosEstoque();
                    System.out.println("Informe o ID do produto que deseja excluir:");
                    String idProdutoParaExcluir = scanner.nextLine();
                    Produto produtoParaExcluir = estoque.procurarProdutoNoEstoque(idProdutoParaExcluir);
                    if (produtoParaExcluir == null) {
                        System.out.println("Não existe este produto no estoque");
                    } else {
                        estoque.deletarProdutoNoEstoque(produtoParaExcluir);
                    }
                }
                case 4 -> estoque.imprimirListaDeProdutosEstoque();
                case 5 -> {
                    scanner.close();
                    sair = true;
                }
            }
        }
    }
}
