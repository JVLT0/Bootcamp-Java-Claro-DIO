package com.ordenacaoList.ordenacaoNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(54);

        ordenacaoNumeros.ordenarAscendente();
        ordenacaoNumeros.ordenarDescendente();
    }
}
