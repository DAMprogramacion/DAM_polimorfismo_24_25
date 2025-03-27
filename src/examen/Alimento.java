package examen;

public abstract class Alimento extends ProductoGenerico{
    private final TipoProductosAlimentarios tipoProductosAlimentarios;

    public Alimento(String numeroReferencia,
                    TipoProductosAlimentarios tipoProductosAlimentarios) {
        super(numeroReferencia, true);
        this.tipoProductosAlimentarios = tipoProductosAlimentarios;
    }

    public TipoProductosAlimentarios getTipoProductosAlimentarios() {
        return tipoProductosAlimentarios;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), tipoProductosAlimentarios);
    }
}
