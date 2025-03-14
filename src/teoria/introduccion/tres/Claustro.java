package teoria.introduccion.tres;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//es una composición, usar un diccionario K: dni V: objeto Profesor
public class Claustro {
    public String nombreCentro;
    public final Map<String, Profesor> profesores = new HashMap<>();

    public Claustro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }
    public boolean addProfesor( Profesor profesor) {
        return profesores.put(profesor.getDni(), profesor) != null;
    }
    public boolean eliminarProfesorPorDNI (String dni) {
        return profesores.remove(dni) != null;
    }
    public Profesor buscarProfesorPorDNI (String dni) {
        return profesores.get(dni);
    }
    public Set<Profesor> getProfesores() {
        return (Set<Profesor>) profesores.values();
    }
    public double getEdadMediaProfesores() {
        return getProfesores().stream().
                mapToDouble(Persona::getEdad).
                average().orElse(0);
    }
    public Profesor getProfesorMasAntiguo() {
        return getProfesores().stream().
                max(Comparator.comparing(Profesor::getMesesContratados)).
                get();
    }
    public long getNumeroProfesoresPorEspecialidad (Especialidad especialidad) {
        return getProfesores().stream().
                filter(profesor -> profesor.getEspecialidad().equals(especialidad)).
                count();
    }
}
//Claustro , con atributos:
//Nombre del centro educativo.
//Colección de profesores.
//Métodos CRUD, para añadir un nuevo profesor, borrar un profesor
//y buscar profesor por dni y listar todos los profesores.
//Metodo que nos de la edad media de todos los profesores.
//Metodo que nos devuelva el profesor con mas antigüedad.
//Metodo que nos devuelva el número de profesores, dado una especialidad.