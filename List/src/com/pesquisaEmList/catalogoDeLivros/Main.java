package com.pesquisaEmList.catalogoDeLivros;

public class Main {
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Maus", "Art Spiegelman", 1986);
        catalagoLivros.adicionarLivro("Uma Breve Historia do Tempo", "Stephen Hawking", 1988);

        catalagoLivros.pesquisarPorAutor("Stephen Hawking");
        catalagoLivros.pesquisarPorTitulo("Maus");
        catalagoLivros.pesquisarPorIntervaloDeAnos(1980, 1990);
    }
}
