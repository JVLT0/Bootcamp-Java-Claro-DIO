package com.pesquisaEmSet.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaDeTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa removerTarefa = null;

        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                removerTarefa = t;
                break;
            }
        }
        tarefaSet.remove(removerTarefa);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t: tarefaSet){
            if(t.isConclusao() == true){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> taredasPendentes = new HashSet<>();

        for(Tarefa t: tarefaSet){
            if(t.isConclusao() == false){
                taredasPendentes.add(t);
            }
        }
        return taredasPendentes;
    }

    public void marcarTarefaConcluidas(String descricao){

        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConclusao(true);;
            }
        }
    }

    public void marcarTarefaPendentes(String descicao){
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descicao)){
                t.setConclusao(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }
    
}
