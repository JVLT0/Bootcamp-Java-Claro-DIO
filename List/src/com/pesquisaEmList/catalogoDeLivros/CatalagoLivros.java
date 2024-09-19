package com.pesquisaEmList.catalogoDeLivros;

import java.util.List;
import java.util.ArrayList;

public class CatalagoLivros {
    
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                    System.out.println("Por Autor: " + livroPorAutor);
                }
            }
        }
        return livroPorAutor;
        }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livroPorIntervaloAno.add(l);
                }
            }
            System.out.println("Por intervalo de ano: " + livroPorIntervaloAno);
        }
        return livroPorIntervaloAno;
        }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

            if(!livroList.isEmpty()){
                for(Livro l : livroList){
                    if(l.getTitulo().equalsIgnoreCase(titulo)){
                        livroPorTitulo = l;
                        System.out.println("Por titulo: " + livroPorTitulo);
                        break;
                    }
                }
            }
        return livroPorTitulo;
    }

}
