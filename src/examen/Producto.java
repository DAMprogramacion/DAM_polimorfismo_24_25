package examen;

import java.util.Comparator;
import java.util.List;

public interface Producto {
    double getPrecioFinal();
    static List<Alimento> getProductosPorTipoOrdenadosPorPrecio(
            TipoProductosAlimentarios tipoProductosAlimentarios, List<Alimento> productos) {
        return  productos.stream().
                    filter(
                            producto -> producto.getTipoProductosAlimentarios().equals(tipoProductosAlimentarios)).
                    sorted(Comparator.comparing(Producto::getPrecioFinal)).
                    toList();
    }
    static double getTotalPrecioProductos (List<Producto> productos) {
        return  productos.stream().
                    mapToDouble(Producto::getPrecioFinal).
                    sum();
    }
}
