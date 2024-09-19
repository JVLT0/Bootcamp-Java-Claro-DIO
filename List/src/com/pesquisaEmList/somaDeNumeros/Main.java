package com.pesquisaEmList.somaDeNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(12);

        somaNumeros.encotrarMaiorNumero();
        somaNumeros.encotrarMenorNumero();
        somaNumeros.exibirNumeros();
        somaNumeros.calcularSoma();

    }
}
