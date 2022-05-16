package Aula03;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public List<Estoque> estoques = new ArrayList<>();

    public Produto procurarProduto(String idProduto) {
        for (Estoque estoque : estoques) {
            for (Produto produto : estoque.getListaDeProdutos()) {
                if (produto.getIdProduto().equalsIgnoreCase(idProduto)){
                    return produto;
                }
            }
        } return null;
    }

    public void imprimirListaDeEstoque() {
        System.out.println("Produtos cadastrados na loja");
        for (Estoque estoque : estoques) {
            System.out.println(estoque);
        }
    }

    public Estoque procurarEstoque(String idEstoque) {
        for (Estoque estoque : estoques) {
            if (estoque.getIdEstoque().equalsIgnoreCase(idEstoque)){
                return estoque;
            }
        } return null;
    }

    public Estoque procurarEstoquePorProduto(String idProduto) {
        for (Estoque estoque : estoques) {
            for (Produto produto : estoque.getListaDeProdutos()) {
                if (produto.getIdProduto().equalsIgnoreCase(idProduto)){
                    return estoque;
                }
            }
        } return null;
    }

}
