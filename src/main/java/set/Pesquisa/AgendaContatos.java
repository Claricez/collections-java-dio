package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adcionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
  public Contato atualizarNumeroContatos(String nome, int novoNumero){
        //Para atualizar o numero iremos o utlizar o atributo nome, que possui valor exclusivo para identificar o indice
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
  }

    public static void main(String[] args){
        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContato();

        contatos.adcionarContato("Clarice", 123456789);
        contatos.adcionarContato("Taylor Swift" , 19891213);
        contatos.adcionarContato("Taylor Lautner" , 76596592);
        contatos.adcionarContato("Beyoncé", 7895413);
        contatos.adcionarContato("Clarice Duplicata", 78952645);

        contatos.exibirContato();

        System.out.println(contatos.pesquisarPorNome("Taylor"));

        System.out.println(" Contato Atualizado" + contatos.atualizarNumeroContatos("Clarice Duplicata", 97856626));
        contatos.exibirContato();
    }

}
