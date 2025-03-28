package examenRepaso;

public abstract class ProductoGenerico implements Producto{
    private final String numeroReferencia;
    private final boolean productosAlimentarios;

    public ProductoGenerico(String numeroReferencia, boolean productosAlimentarios) {
        this.numeroReferencia = numeroReferencia;
        this.productosAlimentarios = productosAlimentarios;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public boolean isProductosAlimentarios() {
        return productosAlimentarios;
    }

    @Override
    public String toString() {
        String alimento =  productosAlimentarios ? "SI" : "NO";
        return String.format("PRODUCTO: %S, ALIMENTARIO %s", numeroReferencia, alimento);
    }


}
