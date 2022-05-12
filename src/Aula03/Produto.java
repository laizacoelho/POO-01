package Aula03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    public String nomeProduto;
    public String sessao;
    public String tipo;
    public int qtd;
    public String marca;
    private String idProduto;

    public Produto(String nomeProduto, String sessao, String tipo, int qtd, String marca) {
        this.nomeProduto = nomeProduto;
        this.sessao = sessao;
        this.tipo = tipo;
        this.qtd = qtd;
        this.marca = marca;

        Date data = new Date();
        DateFormat dataFormatada = new SimpleDateFormat("yyyyMMddHHmmsss");
        idProduto = dataFormatada.format(data);
        idProduto = idProduto.concat(this.nomeProduto);
        System.out.println(idProduto);
    }



}
