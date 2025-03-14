package teoria.introduccion.tres;

import java.time.LocalDate;
import java.time.Period;

//fecha incorporacion (f)
public final class ProfesorTitular extends Profesor{ //hereda Profesor, clase final
    private final LocalDate fechaIncorporacion;

    public ProfesorTitular(LocalDate fechaNacimiento, String dni, String nombrePersona, Especialidad especialidad,
                           LocalDate fechaIncorporacion) {
        super(fechaNacimiento, dni, nombrePersona, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public int getMesesContratados() {
        Period periodo = Period.between(fechaIncorporacion, LocalDate.now());
        return periodo.getMonths();
    }

    @Override
    public String getTipoProfesor() {
        return "Profesor titular";
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d/%d/%d", getTipoProfesor(), super.toString(),
                fechaIncorporacion.getDayOfMonth(),
                fechaIncorporacion.getMonthValue(), fechaIncorporacion.getYear());
    }
}
