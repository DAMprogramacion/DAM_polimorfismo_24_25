package teoria.interfaces.introduccion;

public class Main {
    public static void main(String[] args) {
        //A a = new A(); no se pueden crear objetos de las intefaces
        A b = new B();
        b.despedir("Manuel");
        b.saludar("David");

        A c = new C();
        c.despedir("Manuel");
        c.saludar("David");

        //D d = new D(); no se puede instanciar porque es abstracta
        A e = new E();
        e.saludar("Manuel");
        e.despedir("Manuel");

        System.out.printf("Valor PI: %.2f%n", A.PI);
        //A.PI = 1; no se puede modificar una constante
        A f = new G();
        F g1 = new G();
        g1.saludar("manuel");
        g1.despedir("manuel");
        g1.insultar("luis");
        A g2 = new G();
        g2.saludar("manuel");
        g2.despedir("manuel");
        ((G) g2).insultar("luis");

    }
}
