package teoria.introduccion.uno;

public final class Cuadrado extends FiguraRegular{
    public Cuadrado(double longitudLado) {
        super(4, longitudLado);
    }
    public double getArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
