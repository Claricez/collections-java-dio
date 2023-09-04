package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class CarrinhoDeCompras {

    private List<Item> itensLista;

    public CarrinhoDeCompras(){
        this.itensLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        if(!itensLista.isEmpty()) {
            for (Item i : itensLista) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensRemovidos.add(i);
                }
            }
            itensLista.removeAll(itensRemovidos);
        }else{
            System.out.println("Lista Vazia");
        }
    }

    public double precoTotal(){
        double valorTotal = 0d;
        if(!itensLista.isEmpty()){
            for(Item i: itensLista){
                double valor = i.getPreco() * i.getQuantidade();
                valorTotal += valor;
            }
            return  valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibeItens() {
        System.out.println(this.itensLista);

    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itensLista=" + itensLista +
                '}';
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("MacBook", 10000, 10);
        carrinhoDeCompras.adicionarItem("Ipad", 6000, 5);
        carrinhoDeCompras.adicionarItem("Iphone", 5000, 8);

        carrinhoDeCompras.exibeItens();
        System.out.println("Valor total: " + carrinhoDeCompras.precoTotal());
        carrinhoDeCompras.exibeItens();
        carrinhoDeCompras.removerItem("Ipad");
        carrinhoDeCompras.exibeItens();
    }

}
