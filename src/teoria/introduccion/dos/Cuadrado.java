package teoria.introduccion.dos;

public final class Cuadrado extends FiguraRegular{

    public Cuadrado(int numeroLados, double longitudLado) {
        super(numeroLados, longitudLado);
    }

    @Override
    protected double getArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
