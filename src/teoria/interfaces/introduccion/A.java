package teoria.interfaces.introduccion;

public interface A {
    double PI = 3.14;
    void saludar(String nombre);
    void despedir(String nombre);
    default void saludarYDespedir(String nombre) {
        saludar(nombre);
        despedir(nombre);
    }
}
