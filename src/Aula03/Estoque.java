package Aula03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Estoque {
    public String nome;
    private Produto[] listaDeProdutos;
    private String idEstoque;


    public Estoque(String nome, Produto[] listaDeProdutos) {
        this.nome = nome;
        this.listaDeProdutos = listaDeProdutos;
        Date data = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("yyyyMMddHHmmsss");
        idEstoque = dataFormatada.format(data);
        idEstoque = idEstoque.concat(this.nome);
        System.out.println(idEstoque);
    }

    public void inserirProduto(String nomeProduto, String sessao, String tipo, int qtd, String marca) {
        for (Produto produto : listaDeProdutos) {
            if (produto.nomeProduto == nomeProduto && produto.marca == marca) {
                
            }
        }

        Produto novoProduto = new Produto(nomeProduto, sessao, tipo, qtd, marca);

    }



}
