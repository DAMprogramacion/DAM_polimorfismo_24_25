package teoria.interfaces.introduccion;

public abstract class D implements A{
    @Override
    public void saludar(String nombre) {
        System.out.println("Salut " + nombre);
    }
}
