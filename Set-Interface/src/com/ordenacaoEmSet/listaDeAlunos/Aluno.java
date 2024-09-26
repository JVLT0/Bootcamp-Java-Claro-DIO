package com.ordenacaoEmSet.listaDeAlunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private double media;
    private long matricula;


    public Aluno(String nome, double media, long matricula) {
        this.nome = nome;
        this.media = media;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }


    public double getMedia() {
        return media;
    }


    public long getMatricula() {
        return matricula;
    }

    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", media=" + media + ", matricula=" + matricula + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }
    
}

class ComparatorPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }

}