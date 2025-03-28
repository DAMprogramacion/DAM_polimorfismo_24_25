package examenes.examenB;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public interface Reserva {
    int PRECIO_POR_HABITACION_APARTAMENTO = 75;
    int PRECIO_POR_HUESPED_HOTEL = 55;
    double getPrecioSinIVA();
    default double getPrecionConIVA() {
        return getPrecioSinIVA() + getPrecioSinIVA() * 21 / 100;
    }
    LocalDate getFechaSalida();

    static double getPrecioTotalAlojamientos(List<Alojamiento> alojamientos) {
        return alojamientos.stream().
                mapToDouble(Reserva::getPrecionConIVA).
                sum();
    }
    static void mostrarAlojamientosPorPrecio(List<Alojamiento> alojamientos) {
        alojamientos.stream().
                sorted(Comparator.comparing(Reserva::getPrecionConIVA).reversed()).
                map(Alojamiento::getNombreAlojamiento).
                forEach(System.out::println);
    }
    static List<Alojamiento> getApartamentosPorPrecio(List<Alojamiento> alojamientos, double precio) {
        return alojamientos.stream().
                filter(alojamiento -> alojamiento instanceof Apartamento).
                filter(alojamiento -> alojamiento.getPrecionConIVA() <= precio).
                sorted(Comparator.comparing(Reserva::getPrecionConIVA).reversed()).
                toList();
    }

    }
