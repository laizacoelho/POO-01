package Aula03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estoque {
    public String nome;
    private List<Produto> listaDeProdutos = new ArrayList<>();
    private String idEstoque;


    public Estoque(String nome) {
        this.nome = nome;
        Date data = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("yyyyMMddHHmmsss");
        idEstoque = dataFormatada.format(data);
        idEstoque = idEstoque.concat(this.nome);
    }

    public void inserirProduto(Produto novoProduto) {
        boolean jaExisteProduto = false;
        for (Produto produto : listaDeProdutos) {
            if (produto.nomeProduto.equals(novoProduto.nomeProduto) && produto.getMarca().equals(novoProduto.getMarca())) {
                int qtd = produto.getQtd() + novoProduto.getQtd();
                produto.setQtd(qtd);
                jaExisteProduto = true;
                System.out.println("Produto já existe no estoque, acrescentada esta quantidade ao estoque.");
                System.out.println(produto);
            }
        }
        if (!jaExisteProduto) {
            listaDeProdutos.add(novoProduto);
            System.out.println("Novo produto cadastrado:");
            System.out.println(novoProduto);
        }
    }

    public void deletarProduto (Produto produto) {
        boolean produtoDeletado = false;
        for (Produto item : listaDeProdutos) {
            if (item.getIdProduto().equals(produto.getIdProduto())) {
                listaDeProdutos.remove(produto);
                produtoDeletado = true;
                System.out.println("Produto deletado!");
                break;
            }
        }
        if (!produtoDeletado) {
            System.out.println("Este produto não existe no estoque");
        }
    }

    public void imprimirListaDeProdutosEstoque() {
        System.out.println("Produtos cadastrados no " + this.nome);
        for (Produto item : listaDeProdutos) {
            System.out.println(item);
        }
    }
}
