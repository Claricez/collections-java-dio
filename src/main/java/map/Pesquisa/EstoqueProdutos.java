package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Chave e produto
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProduto(){
        System.out.println(estoqueProduto);
    }
    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProduto.isEmpty()){
           for(Produto p: estoqueProduto.values()){
               valorTotal += p.getQuantidade() * p.getPreco();
           }
       }
        return valorTotal;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }

        }
        return produtoMaisCaro;
    }
    public static void main(String[] args){
        EstoqueProdutos produtos = new EstoqueProdutos();
        produtos.exibirProduto();

        produtos.adicionarProduto(123, "Produto 1", 2.5, 20);
        produtos.adicionarProduto(145, "Produto 2", 10.0, 15);
        produtos.adicionarProduto(123, "Produto 3", 25.0, 50);

       System.out.println("Valor do Estoque: " + produtos.calcularValorTotalEstoque());
       System.out.println("Produto mais caro: " + produtos.obterProdutoMaisCaro());
    }
}
