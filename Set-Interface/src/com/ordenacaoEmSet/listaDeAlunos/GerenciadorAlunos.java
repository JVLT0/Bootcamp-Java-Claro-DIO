package com.ordenacaoEmSet.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos{
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, media, matricula));
    }

    public void removerAluno(long matricula){
        alunoSet.removeIf(a -> a.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunosPorNome);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        System.out.println(alunosPorNota);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
    
}
