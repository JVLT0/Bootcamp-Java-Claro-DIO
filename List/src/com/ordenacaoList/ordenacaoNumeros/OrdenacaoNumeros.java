package com.ordenacaoList.ordenacaoNumeros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    public List<Numero> numList;

    public OrdenacaoNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numList.add(new Numero(numero));
    }
    
    public List<Numero> ordenarAscendente(){
        List<Numero> ordenarAscendente = new ArrayList<>(numList);
        Collections.sort(ordenarAscendente);

        System.out.println(ordenarAscendente);

        return ordenarAscendente;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> ordenarDescendente = new ArrayList<>(numList);
        Collections.reverse(ordenarDescendente);

        System.out.println(ordenarDescendente);

        return ordenarDescendente;
    }
}
