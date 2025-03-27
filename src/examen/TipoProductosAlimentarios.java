package examen;

public enum TipoProductosAlimentarios {
    PANADERIA(TipoIVA.SUPERREDUCIDO), ACEITE(TipoIVA.REDUCIDO) , LICOR(TipoIVA.GENERAL);
    private TipoIVA tipoIVA;

    TipoProductosAlimentarios(TipoIVA tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    public TipoIVA getTipoIVA() {
        return tipoIVA;
    }
}
