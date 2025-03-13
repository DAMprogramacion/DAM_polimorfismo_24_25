package teoria.introduccion.dos;


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
            String tipoObjeto =  figuraRegular.getClass().
                    toString().replace("class teoria.introduccion.dos.", "").
                    toUpperCase();
            System.out.printf("%s: Perimetro: %.2f y Área: %.2f%n",
                    tipoObjeto, figuraRegular.getPerimetro(), figuraRegular.getArea());
        }
    }
}





