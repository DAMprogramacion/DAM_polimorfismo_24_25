package teoria.introduccion.tres;

import java.time.LocalDate;

//meses antigüedad
public final class ProfesorInterior extends Profesor{//herdad de Profesor y es final
    private int mesesContratados;

    public ProfesorInterior(LocalDate fechaNacimiento, String dni, String nombrePersona, Especialidad especialidad,
                            int mesesContratados) {
        super(fechaNacimiento, dni, nombrePersona, especialidad);
        this.mesesContratados = mesesContratados;
    }

    @Override
    public int getMesesContratados() {
        return mesesContratados;
    }

    @Override
    public String getTipoProfesor() {
        return "Profesor interino";
    }

    public void setMesesContratados(int mesesContratados) {
        this.mesesContratados += mesesContratados;
    }
    @Override
    public String toString() {
        return String.format("%s,%s,%d", getTipoProfesor(), super.toString(),
                mesesContratados);
    }
} //cuidado con el setter

