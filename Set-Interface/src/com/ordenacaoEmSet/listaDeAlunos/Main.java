package com.ordenacaoEmSet.listaDeAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Joao", 01, 8);
        gerenciadorAlunos.adicionarAluno("Maria", 02, 7);
        gerenciadorAlunos.adicionarAluno("Matheus", 03, 6);
        gerenciadorAlunos.adicionarAluno("Gustavo", 04, 10);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(03);
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

    }
}
