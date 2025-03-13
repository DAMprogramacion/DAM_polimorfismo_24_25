package teoria.introduccion.uno;

public final class TrianguloEquilatero extends FiguraRegular {
    public TrianguloEquilatero(double longitudLado) {
        super(3, longitudLado);
    }
    public double getArea() {
        return Math.sqrt(3) * Math.pow(getLongitudLado(), 2) / 4;
    }
}
