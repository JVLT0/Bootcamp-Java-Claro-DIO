package com.ordenacaoList.ordenacaPessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Joao", 20, 1.77);
        ordenacaoPessoas.adicionarPessoa("Matheus", 20, 1.75);
        ordenacaoPessoas.adicionarPessoa("Gustavo", 21, 1.70);
        ordenacaoPessoas.adicionarPessoa("Danilo", 20, 1.72);
        ordenacaoPessoas.adicionarPessoa("Sabrina", 19, 1.65);

        ordenacaoPessoas.ordenarPorAltura();
        ordenacaoPessoas.ordenarPorIdade();
    }
}
