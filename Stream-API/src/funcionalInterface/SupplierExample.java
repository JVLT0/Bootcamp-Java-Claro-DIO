package funcionalInterface;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Ola seja bem vindo";

        List<String> listaSaudacao = Stream.generate(() -> "Ola seja bem vindo")
        .limit(5)
        .toList();

        listaSaudacao.forEach(System.out::println);
    }
}
