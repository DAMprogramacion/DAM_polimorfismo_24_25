package examenes.examenB;

import java.time.LocalDate;

public abstract class Alojamiento implements Reserva{
    private int numeroHuespedes;
    private int numeroDiasReserva;
    private LocalDate fechaEntrada;
    private String nombreAlojamiento;

    public Alojamiento(int numeroHuespedes, int numeroDiasReserva, LocalDate fechaEntrada, String nombreAlojamiento) {
        this.numeroHuespedes = numeroHuespedes;
        this.numeroDiasReserva = numeroDiasReserva;
        this.fechaEntrada = fechaEntrada;
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public int getNumeroHuespedes() {
        return numeroHuespedes;
    }

    public void setNumeroHuespedes(int numeroHuespedes) {
        this.numeroHuespedes = numeroHuespedes;
    }

    public int getNumeroDiasReserva() {
        return numeroDiasReserva;
    }

    public void setNumeroDiasReserva(int numeroDiasReserva) {
        this.numeroDiasReserva = numeroDiasReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    @Override
    public LocalDate getFechaSalida() {
        return fechaEntrada.plusDays(numeroDiasReserva);
    }
}
