package funcionalInterface;

import java.util.*;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultados = numeros.stream()
        .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Soma dos numeros: " + resultados);
    }
}
