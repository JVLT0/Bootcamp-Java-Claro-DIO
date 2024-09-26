package com.ordenacaoEmSet.cadastroDeProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Nutela", 15.5, 2, 001);
        cadastroProdutos.adicionarProduto("Coca-Cola Zero", 12.5, 2, 002);
        cadastroProdutos.adicionarProduto("Agua com gas", 8.5, 2, 003);
        cadastroProdutos.adicionarProduto("Pao de Forma", 9.0, 1, 004);

        cadastroProdutos.exibirProdutosPorNome();
        cadastroProdutos.exibirPorPreco();

    }
    
}
