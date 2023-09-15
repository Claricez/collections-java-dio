package main.java.map.Ordenacao;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    public Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void proximoEvento(){
       LocalDate dataAtual = LocalDate.now();
       LocalDate proximaData = null;
       Evento proximoEvento = null;
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
       for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
           if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
               proximaData = entry.getKey();
               proximoEvento = entry.getValue();
               System.out.println("Próximo Evento: " + proximoEvento + "acontecerá na data " + proximaData);
               break;
           }
       }
    }
    public static void main(String[] args){
        AgendaEventos eventos = new AgendaEventos();
        eventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 18), "Evento 1", "Atração 1");
        eventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 24), "Evento 2", "Atração 2");
        eventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 25), "Evento 3", "Atração 3");

        eventos.exibirAgenda();

        eventos.proximoEvento();

    }
}
