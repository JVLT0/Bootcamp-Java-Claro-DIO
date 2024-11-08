package com.operacoesBasicas.agendaDeContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 1233455678);
        agendaContatos.adicionarContato("Maria", 87654321);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Joao");
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    }
}
