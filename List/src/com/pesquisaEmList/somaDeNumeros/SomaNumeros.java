package com.pesquisaEmList.somaDeNumeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {

    public List<Numeros> numList;

    public SomaNumeros() {
        this.numList = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        numList.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;

        if(!numList.isEmpty()){
            for(Numeros n : numList){
                soma += n.getNumero();
            }
            System.out.println("Soma dos Numeros: " + soma);
        }

        return soma;
    } 

    public int encotrarMaiorNumero(){
        int maiorNumero = 0;

        if(!numList.isEmpty()){
            for(Numeros n : numList){
                if(maiorNumero <= n.getNumero()){
                    maiorNumero = n.getNumero();
                }
            }
            System.out.println("Maior Numero: " + maiorNumero);    
        }
        return maiorNumero;
    }

    public int encotrarMenorNumero(){
        int menorNumero = numList.get(0).getNumero();

        if(!numList.isEmpty()){
            for(Numeros n : numList){
                if(menorNumero >= n.getNumero()){
                    menorNumero = n.getNumero();
                }
            }
            System.out.println("Menor Numero: " + menorNumero);
        }
        return menorNumero;
    }

    public List<Numeros> exibirNumeros(){
        List<Numeros> exibirNumeros = new ArrayList<>();
        if(!numList.isEmpty()){
            for(Numeros n : numList){
                exibirNumeros.add(n);
            }
            System.out.println(exibirNumeros);
        }

        return exibirNumeros;
    }
    
}
