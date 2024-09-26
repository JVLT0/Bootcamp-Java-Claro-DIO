package com.operaçõesBasicas.conjuntoDeConvidados;

public class Main {
    
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Joao", 001);
        conjuntoConvidados.adicionarConvidado("Sabrina", 002);
        conjuntoConvidados.adicionarConvidado("Matheus", 003);

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigo(003);
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();
        
    }

}
