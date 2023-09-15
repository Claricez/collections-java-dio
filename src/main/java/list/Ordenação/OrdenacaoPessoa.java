package main.java.list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        //O collections.sort vai ordenar os números através do Comparable
        Collections.sort(pessoasPorIdade);
        return  pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        //O collections.sort vai ordenar os números através do Comparator
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Clarice", 22, 1.63);
        ordenacaoPessoa.adicionarPessoa("Taylor", 33, 1.79);
        ordenacaoPessoa.adicionarPessoa("Selena", 31, 1.65);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        System.out.println(ordenacaoPessoa.ordernarPorAltura());
    }
}
