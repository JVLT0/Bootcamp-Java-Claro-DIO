package com.ordenacaoEmSet.cadastroDeProdutos;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private int quantidade;
    private long cod;
    
    public Produto(String nome, double preco, int quantidade, long cod) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCod() {
        return cod;
    }

    @Override
    public int compareTo(Produto p) {
        return this.nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
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
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", cod=" + cod + "]";
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
       return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
