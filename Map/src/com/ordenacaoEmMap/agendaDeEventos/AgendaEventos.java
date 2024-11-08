package com.ordenacaoEmMap.agendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        if(!eventoMap.isEmpty()){
            for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    System.out.println("O Evento " + entry.getValue() + " vai acontecer " + entry.getKey());
                    break;
                }
            }
        }
    }
}
