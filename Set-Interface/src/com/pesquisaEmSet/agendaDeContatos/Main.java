package com.pesquisaEmSet.agendaDeContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 920008664);
        agendaContatos.adicionarContato("Maria", 123456789);
        agendaContatos.adicionarContato("Joao Feijao", 123456890);
        agendaContatos.adicionarContato("Maria", 987654321);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Joao");
        agendaContatos.atualizarNumeroDeContato("Joao", 123457890);

        agendaContatos.exibirContatos();
    }
}
