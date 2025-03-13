package teoria.introduccion.uno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FiguraRegular cuadrado1  = new Cuadrado(3.7);
        FiguraRegular cuadrado2  = new Cuadrado(5);
        FiguraRegular triangulo1 = new TrianguloEquilatero(2.2);
        FiguraRegular triangulo2 = new TrianguloEquilatero(6);
        List<FiguraRegular> figuras = new ArrayList<>();
        figuras.add(cuadrado1); figuras.add(triangulo1);
        figuras.add(cuadrado2); figuras.add(triangulo2);
        mostrarDatosFiguras(figuras);
    }

    private static void mostrarDatosFiguras(List<FiguraRegular> figuras) {
        for (FiguraRegular figuraRegular : figuras) {
          //  System.out.printf("Perímetro: %.2f%n", figuraRegular.getPerimetro());
            if (figuraRegular instanceof Cuadrado) {
                Cuadrado cuadrado = (Cuadrado) figuraRegular;
                System.out.printf("CUADRADO\nPerimetro: %.2f y Área: %.2f%n",
                        cuadrado.getPerimetro(), cuadrado.getArea());
            }
          //  System.out.printf("Perímetro: %.2f%n", figuraRegular.getPerimetro());
            if (figuraRegular instanceof TrianguloEquilatero) {
                TrianguloEquilatero trianguloEquilatero = (TrianguloEquilatero) figuraRegular;
                System.out.printf("TRIÁNGULO EQUILATERO\nPerimetro: %.2f y Área: %.2f%n",
                        trianguloEquilatero.getPerimetro(), trianguloEquilatero.getArea());            }
        }
    }
}








