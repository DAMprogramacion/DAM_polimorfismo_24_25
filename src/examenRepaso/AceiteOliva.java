package examenRepaso;

public class AceiteOliva extends Alimento{
    private final String marca;
    private final TipoIVA tipoIVA;
    private double precioSinIVA;

    public AceiteOliva(String numeroReferencia,
                       double precioSinIVA, String marca) {
        super(numeroReferencia, TipoProductosAlimentarios.ACEITE);
        this.tipoIVA = TipoProductosAlimentarios.ACEITE.getTipoIVA();
        this.precioSinIVA = precioSinIVA;
        this.marca = marca;
    }

    @Override
    public double getPrecioFinal() {
        return precioSinIVA + precioSinIVA * tipoIVA.getIva() / 100;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f € sin IVA, %.2f € con IVA ",
                super.toString(), marca, precioSinIVA, getPrecioFinal());
    }
}
