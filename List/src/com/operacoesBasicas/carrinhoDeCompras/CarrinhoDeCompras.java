package com.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for(Item i: itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }

        itemList.removeAll(itemParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;

        for(Item i: itemList){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println(valorTotal);
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
    
}
