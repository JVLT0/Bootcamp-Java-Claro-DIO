package com.operacoesBasicas.carrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("feijao", 25.0, 4);
        carrinhoDeCompras.adicionarItem("arroz", 30.0, 2);
        carrinhoDeCompras.adicionarItem("salgadinho", 11.0, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("feijao");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        
    }
}
