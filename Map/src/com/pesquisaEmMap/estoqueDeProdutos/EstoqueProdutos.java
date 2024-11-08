package com.pesquisaEmMap.estoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotal = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produtos p: estoqueProdutosMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produtos p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    
}
