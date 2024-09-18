import java.util.ArrayList;
import java.util.List;


public class Produto {
    public Produto(String string, double d) {
        
    }

    private static List<Produto> getProducts(){
        List<Produto> produtoList = new ArrayList<>();

        produtoList.add(new Produto("camiseta", 10d));
        produtoList.add(new Produto("meia", 20d));
        produtoList.add(new Produto("luvas", 100d));
        produtoList.add(new Produto("agasalho", 45d));
        return produtoList;
    }
}
