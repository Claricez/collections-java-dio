package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome, codConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodConvite() == codConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args){
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set convidados");

        convidados.adicionarConvidado("Convidado 1", 123);
        convidados.adicionarConvidado("Convidado 2", 124);
        convidados.adicionarConvidado("Convidado 2", 124);
        convidados.adicionarConvidado("Convidado 3", 325);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set convidados");

        convidados.removerConvidadoPorCodigoConvite(124);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do set convidados");

        convidados.exibirConvidados();


    }
}

