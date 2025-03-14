package teoria.introduccion.tres;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

//nombre, fecha nacimiento (f) y dni (f)
public class Persona {
    private String nombrePersona;
    private final LocalDate fechaNacimiento;
    private final String dni;

    public Persona(LocalDate fechaNacimiento, String dni, String nombrePersona) {
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.nombrePersona = nombrePersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        //luis garcia,1/11/2000,12345678a
        StringBuilder builder = new StringBuilder();
        builder.append(nombrePersona).append(',').
                append(fechaNacimiento.getDayOfMonth()).append('/').
                append(fechaNacimiento.getMonthValue()).append('/').
                append(fechaNacimiento.getYear()).append(',').
                append(dni);
        return builder.toString();

    }
    public int getEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }
}
