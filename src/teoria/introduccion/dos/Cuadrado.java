package teoria.introduccion.dos;

public final class Cuadrado extends FiguraRegular{

    public Cuadrado(double longitudLado) {
        super(4, longitudLado);
    }

    @Override
    protected double getArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
