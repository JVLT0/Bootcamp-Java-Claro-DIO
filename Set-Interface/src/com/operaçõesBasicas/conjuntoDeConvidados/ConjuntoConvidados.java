package com.operaçõesBasicas.conjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoRemover = null;

        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
 
