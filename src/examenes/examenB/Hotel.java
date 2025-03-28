package examenes.examenB;

import java.time.LocalDate;

public class Hotel extends Alojamiento{
    private TipoHabitacion tipoHabitacion;
    private int numeroEstrellas;

    public Hotel(int numeroDiasReserva, LocalDate fechaEntrada, String nombreAlojamiento,
                 TipoHabitacion tipoHabitacion, int numeroEstrellas)
            throws ClasificacionHotelEception {
        super(tipoHabitacion.getHuespedes(), numeroDiasReserva, fechaEntrada, nombreAlojamiento);
        if (numeroEstrellas <= 5) {
            this.tipoHabitacion = tipoHabitacion;
            this.numeroEstrellas = numeroEstrellas;
        } else
            throw new ClasificacionHotelEception("NO EXISTE HOTEL DE ESA CATEGORIA");
    }

    @Override
    public double getPrecioSinIVA() {
        return tipoHabitacion.getHuespedes() * PRECIO_POR_HUESPED_HOTEL + numeroEstrellas * 5;
    }
}
