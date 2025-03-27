package ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] numbers =
                new Random().doubles(0,350).limit(1_000).toArray();
        Arrays.stream(numbers).
                forEach(System.out::println);
        ArrayReales arrayReales = new ArrayReales(numbers);
        System.out.printf("Valor medio: %.2f%n",arrayReales.calcularValorMedio());
        System.out.printf("Valor distintos: %d%n",arrayReales.obtenerNumeroValoresDistintos());
        System.out.printf("Valor máximo: %.2f%n",arrayReales.obtenerValorMaximo());
        System.out.printf("Valor mínimo: %.2f%n",arrayReales.obtenerValorMinimo());
        System.out.printf("Suma de valores: %.2f%n", arrayReales.calcularSuma());
    }
}
