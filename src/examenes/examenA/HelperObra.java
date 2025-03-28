package examenes.examenA;

import java.util.Comparator;
import java.util.List;

public class HelperObra {
    public static Obra getObraMaximaDuracion(List<Obra> obras) {
        return obras.stream().
                max(Comparator.comparing(ObraCultural::getDuracion)).
                orElse(null);
    }

    public static long getDuracionTotal(List<Obra> obras) {
        return obras.stream().
                mapToInt(Obra::getDuracion).
                sum();
    }
    public static List<String> getLibros(List<Obra> obras) {
          return obras.stream().
                    filter(obra -> obra instanceof Libro).
                    map(Obra::getTitulo).
                    sorted().
                    toList();
    }
}