package examenRepaso;

public enum TipoIVA {
    GENERAL(21), REDUCIDO(10), SUPERREDUCIDO(4);
    private int iva;

    TipoIVA(int iva) {
        this.iva = iva;
    }

    public int getIva() {
        return iva;
    }
}
