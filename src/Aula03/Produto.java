package Aula03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    public String nomeProduto;
    private String sessao;
    private String tipo;
    private int qtd;
    private String marca;
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
    }

    public String getMarca() {
        return this.marca;
    }

    public int getQtd() {
        return this.qtd;
    }

    public String getIdProduto() {
        return this.idProduto;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void editarProduto(int menu, String novoDado) {
        switch (menu) {
            case 1 -> this.nomeProduto = novoDado;
            case 2 -> this.sessao = novoDado;
            case 3 -> this.tipo = novoDado;
            case 4 -> this.qtd = Integer.parseInt(novoDado);
            case 5 -> this.marca = novoDado;
            default -> {
            }
        }
    }

    @Override
    public String toString() {
        return "Id: " + idProduto + " - Produto: "+ nomeProduto + " - Sessão: " + sessao + " - Tipo: " + tipo +
                " - Marca: " + marca + " - Quantidade no estoque: " + qtd;
    }
}
