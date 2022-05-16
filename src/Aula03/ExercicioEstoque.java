package Aula03;
//https://github.com/UXJPMN/lets-code-3T-exercicios

import java.util.Scanner;

public class ExercicioEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();
        int opcao;
        boolean sair = false;
        while(!sair) {
            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastrar um estoque na loja");
                System.out.println("2 - Cadastrar um produto no estoque");
                System.out.println("3 - Editar um produto");
                System.out.println("4 - Excuir um produto");
                System.out.println("5 - Imprmir produtos do estoque");
                System.out.println("6 - Sair");
                opcao = scanner.nextInt();
            } while (opcao < 1 || opcao > 6);
            scanner.nextLine();
            if (loja.estoques.size() == 0 && opcao != 1) {
                System.out.println("Não há estoque cadastrado na loja. Cadastre um estoque.");
            }
            else {
                switch (opcao) {
                    case 1 -> {
                        System.out.println("Qual o nome do estoque?");
                        String nomeEstoque2 = scanner.nextLine();
                        Estoque estoque2 = new Estoque(nomeEstoque2);
                        loja.estoques.add(estoque2);
                    }
                    case 2 -> {
                        System.out.println("Informe o Id do estoque que deseja cadastrar o produto:");
                        loja.imprimirListaDeEstoque();
                        System.out.println("Qual o estoque deseja cadastrar o produto?");
                        String idEstoqueEscolhido = scanner.nextLine();
                        Estoque estoque = loja.procurarEstoque(idEstoqueEscolhido);
                        if (estoque == null) {
                            System.out.println("Não existe este estoque na loja");
                        } else {
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
                    }
                    case 3 -> {

                        for (Estoque storage : loja.estoques) {
                            storage.imprimirListaDeProdutosEstoque();
                        }
                        System.out.println("Informe o ID do produto que deseja editar:");
                        String idProdutoParaEditar = scanner.nextLine();
                        Produto produtoParaEditar = loja.procurarProduto(idProdutoParaEditar);
                        if (produtoParaEditar == null) {
                            System.out.println("Não existe este produto cadastrado nos estoques da loja");
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
                            if (menu != 6) {
                                System.out.println("Digite o novo dado");
                                String novoDado = scanner.nextLine();
                                produtoParaEditar.editarProduto(menu, novoDado);
                            }
                        }
                    }
                    case 4 -> {
                        for (Estoque storage : loja.estoques) {
                            storage.imprimirListaDeProdutosEstoque();
                        }
                        System.out.println("Informe o ID do produto que deseja excluir:");
                        String idProdutoParaExcluir = scanner.nextLine();
                        Produto produtoParaExcluir = loja.procurarProduto(idProdutoParaExcluir);
                        if (produtoParaExcluir == null) {
                            System.out.println("Não existe este produto cadastrado nos estoques da loja");
                        } else {
                            Estoque estoqueDoProdutoEscolhido =  loja.procurarEstoquePorProduto(idProdutoParaExcluir);
                            estoqueDoProdutoEscolhido.deletarProdutoNoEstoque(produtoParaExcluir);
                        }
                    }
                    case 5 -> {
                        System.out.println("Informe o ID do estoque que deseja ver a lista de produtos:");
                        loja.imprimirListaDeEstoque();
                        String idEstoqueEscolhido = scanner.nextLine();
                        Estoque estoque = loja.procurarEstoque(idEstoqueEscolhido);
                        estoque.imprimirListaDeProdutosEstoque();
                    }
                    case 6 -> {
                        scanner.close();
                        sair = true;
                    }
                }
            }
        }
    }
}
