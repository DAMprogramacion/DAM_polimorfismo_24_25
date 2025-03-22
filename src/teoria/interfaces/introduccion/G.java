package teoria.interfaces.introduccion;

public class G implements F{
    @Override
    public void insultar(String nombre) {
        System.out.println("Eres idiota: " + nombre);
    }

    @Override
    public void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    @Override
    public void despedir(String nombre) {
        System.out.println("Adios " + nombre);
    }
}
