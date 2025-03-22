package teoria.interfaces.introduccion;

public class C implements A{
    @Override
    public void saludar(String nombre) {
        System.out.println("Hello " + nombre);
    }

    @Override
    public void despedir(String nombre) {
        System.out.println("Bye-bye " + nombre);
    }
}
