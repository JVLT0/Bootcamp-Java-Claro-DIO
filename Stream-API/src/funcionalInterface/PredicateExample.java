package funcionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java","javascript","c","phyton","go","roby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
        .filter(n -> n.length() > 5)
        .forEach(System.out::println);
    }   
}
