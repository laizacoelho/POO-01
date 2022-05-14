package Aula03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

    public void editarProduto() {
        Scanner scanner = new Scanner(System.in);
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
        //scanner.close();
        scanner.nextLine();
        switch (menu) {
            case 1:
                System.out.println("Qual o novo nome do produto?");
                this.nomeProduto = scanner.nextLine();
                scanner.close();
                break;
            case 2:
                System.out.println("Qual é a nova sessão?");
                this.sessao  = scanner.nextLine();
                scanner.close();
                break;
            case 3:
                System.out.println("Qual é o novo tipo?");
                this.tipo = scanner.nextLine();
                scanner.close();
                break;
            case 4:
                System.out.println("Qual é a nova quantidade?");
                this.qtd = scanner.nextInt();
                scanner.close();
                break;
            case 5:
                System.out.println("Qual é a nova marca?");
                this.marca = scanner.nextLine();
                scanner.close();
                break;
            case 6:
                //chama menu geral
                scanner.close();
                break;
        }
    }

    @Override
    public String toString() {
        return "Id: " + idProduto + " - Produto: "+ nomeProduto + " - Sessão: " + sessao + " - Tipo: " + tipo +
                " - Marca: " + marca + " - Quantidade no estoque: " + qtd;
    }
}
