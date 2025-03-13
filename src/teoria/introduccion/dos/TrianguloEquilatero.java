package teoria.introduccion.dos;

public class TrianguloEquilatero extends FiguraRegular{
    public TrianguloEquilatero(double longitudLado) {
        super(3, longitudLado);
    }

    @Override
    protected double getArea() {
        return Math.sqrt(3) * Math.pow(getLongitudLado(), 2) / 4;
    }
}
