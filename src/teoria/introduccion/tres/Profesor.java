package teoria.introduccion.tres;

import java.time.LocalDate;

//especialidad (enum)
public abstract class Profesor extends Persona{ //hereda de Persona
    private Especialidad especialidad;

    public Profesor(LocalDate fechaNacimiento, String dni, String nombrePersona,
                    Especialidad especialidad) {
        super(fechaNacimiento, dni, nombrePersona);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), especialidad);
    }
    public abstract int getMesesContratados();
    //creo un metodo para que nos diga el tipo de profesor: interino o titular
    public abstract String getTipoProfesor();
}
//metodo abstracto, que es antiguedad en meses