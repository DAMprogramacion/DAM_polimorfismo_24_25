package teoria.interfaces.introduccion;

public class B implements A{
    @Override
    public void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    @Override
    public void despedir(String nombre) {
        System.out.println("Adios " + nombre);
    }
}
