package ejercicios.ejercicio1;

import java.util.Arrays;

public class ArrayReales implements Estadisticas{
    private double[] valores;

    public ArrayReales(double[] valores) {
        this.valores = valores;
    }

    @Override
    public int obtenerNumeroValoresDistintos() {
        return (int) Arrays.stream(valores).
                distinct().
                count();
    }

    @Override
    public double obtenerValorMinimo() {
        return Arrays.stream(valores).
                min().orElse(Double.MIN_VALUE);
    }

    @Override
    public double obtenerValorMaximo() {
        return Arrays.stream(valores).
                max().orElse(Double.MAX_VALUE);
    }

    @Override
    public double calcularSuma() {
        return Arrays.stream(valores).
                sum();
    }

    @Override
    public double calcularValorMedio() {
        return Arrays.stream(valores).
                average().getAsDouble();
    }

    @Override
    public double calcularDesviacionTipica() {
        double valorMedio = calcularValorMedio(); //se calcula una sola vez
        double acumulador = 0;
        for (double valor : valores){
            acumulador = Math.pow( valor - valorMedio , 2);
        }
        return Math.sqrt(acumulador / (valores.length - 1));
    }
}





