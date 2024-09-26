package com.pesquisaEmSet.listaDeTarefas;

public class Main {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.adicionarTarefa("Fazer compras");
        listaDeTarefas.adicionarTarefa("Ir para a academia");
        listaDeTarefas.adicionarTarefa("Ir na casa da Sabrina");
        listaDeTarefas.adicionarTarefa("Ir no aniversario do Gustavo");

        listaDeTarefas.contarTarefas();
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.marcarTarefaConcluidas("fazer compras");
        listaDeTarefas.removerTarefa("ir na casa da sabrina");
        listaDeTarefas.contarTarefas();
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.limparListaTarefas();
        listaDeTarefas.contarTarefas();
        listaDeTarefas.exibirTarefas();
    }   
}
