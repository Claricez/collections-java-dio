package main.java.map.OperacoesBasicas;

import main.java.set.Pesquisa.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String , Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){

        agendaContatoMap.put(nome, telefone);
    }
    public void removerUmContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome= null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContato agendacontatos = new AgendaContato();

        agendacontatos.adicionarContato("Clarice", 123456789);
        agendacontatos.adicionarContato("Taylor Swift" , 19891213);
        agendacontatos.adicionarContato("Taylor Lautner" , 76596592);
        agendacontatos.adicionarContato("Beyoncé", 7895413);
        agendacontatos.adicionarContato("Clarice Duplicata", 78952645);

        agendacontatos.exibirContatos();

        agendacontatos.removerUmContato("Clarice Duplicata");
        agendacontatos.exibirContatos();

        System.out.println(agendacontatos.pesquisarPorNome("Taylor Swift"));

    }
}
