package com.operaçõesBasicas.conjuntoDePalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavras(){
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra removerPalavra = null;

        for(Palavra p : palavraSet){
            if(p.getPalavra() == palavra){
                removerPalavra = p;
                break;
            }
        }
        palavraSet.remove(removerPalavra);
    }

    public void verificarPalavra(String palavra){
        Palavra verificarPalavra = null;
        
        for(Palavra p: palavraSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                verificarPalavra = p;
                break;
            }
        }
        System.out.println(verificarPalavra);
    }

    public void exibirPalavrasUnicas(){

        for(Palavra p: palavraSet){
            System.out.println(p);
        }
    }
}
