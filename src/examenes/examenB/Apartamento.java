package examenes.examenB;

import java.time.LocalDate;

public class Apartamento extends Alojamiento{
    private final int numeroHabitaciones;
    private final boolean piscina;

    public Apartamento(int numeroDiasReserva, LocalDate fechaEntrada, String nombreAlojamiento,
                       int numeroHabitaciones, boolean piscina) {
        super(numeroHabitaciones * 2, numeroDiasReserva, fechaEntrada, nombreAlojamiento);
        this.numeroHabitaciones = numeroHabitaciones;
        this.piscina = piscina;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public boolean isPiscina() {
        return piscina;
    }



    @Override
    public double getPrecioSinIVA() {
        return numeroHabitaciones * PRECIO_POR_HABITACION_APARTAMENTO;
    }
}
