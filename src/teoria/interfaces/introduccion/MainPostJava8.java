package teoria.interfaces.introduccion;

public class MainPostJava8 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println("SALUDANDO:");
        a.saludar("Verónica");
        System.out.println("DESPIDIENDO:");
        a.despedir("Verónica");
        System.out.println("SALUDANDO Y DESPIDIENDO");
        a.saludarYDespedir("Verónica");
    }
}
