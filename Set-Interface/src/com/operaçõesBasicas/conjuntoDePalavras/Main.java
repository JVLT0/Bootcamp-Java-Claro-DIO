package com.operaçõesBasicas.conjuntoDePalavras;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        conjuntoPalavras.adicionarPalavra("Banana");
        conjuntoPalavras.adicionarPalavra("Pera");
        conjuntoPalavras.adicionarPalavra("Melancia");

        conjuntoPalavras.verificarPalavra("Pera");
        conjuntoPalavras.removerPalavra("Pera");
        conjuntoPalavras.verificarPalavra("Pera");

        conjuntoPalavras.exibirPalavrasUnicas();

    }
}
