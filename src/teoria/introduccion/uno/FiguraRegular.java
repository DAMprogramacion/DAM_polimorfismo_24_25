package teoria.introduccion.uno;

public class FiguraRegular {
    private final int numeroLados;
    private final double longitudLado;

    public FiguraRegular(int numeroLados, double longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }
    protected double getPerimetro() {
        return numeroLados * longitudLado;
    }

    protected double getLongitudLado() {
        return longitudLado;
    }
}
