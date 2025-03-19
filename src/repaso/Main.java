package repaso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        Empleado vendedor1 = new Vendedor(
                "juan ramirez", "999556677", 1000, 10);
        Empleado vendedor2 = new Vendedor(
                "juan garciez", "999556679", 1000, 20);
        Empleado vendedor3 = new Vendedor(
                "antonio ramirez", "999556670", 1500, 30);
        Empleado gerente1 = new Gerente(
                "juani ramirez", "999556678", 2000, "personal");
        Empleado gerente2 = new Gerente(
                "esteban ramirez", "999556600", 3000, "fabrica");
        empleados.add(vendedor1); empleados.add(vendedor2); empleados.add(vendedor3);
        empleados.add(gerente1); empleados.add(gerente2);

        System.out.println("======mostrando empleados=========");
        empleados.forEach(System.out::println);
        Empleado empleadoMasCaro = getEmpleadoMasCaro(empleados);
        System.out.println("======empleado que mas gana=========");
        System.out.printf("%s%n", empleadoMasCaro.getNombreEmpleado());
        System.out.println("======mostrando nombre vendedores ordenados alfabéticamente=========");
        empleados.stream().
                filter(empleado -> empleado instanceof Vendedor).
                map(Empleado::getNombreEmpleado).
                sorted().
                forEach(System.out::println);
        System.out.println("======mostrando número de gerentes=========");
        long numeroGerentes = empleados.stream().
                filter(empleado -> empleado instanceof Gerente ).
                count();
        System.out.printf("Nº de gerentes: %d%n", numeroGerentes);
        System.out.println("======mostrando suma sueldo de todos los gerentes=========");
        double totalSueldoGerentes = empleados.stream().
                filter(empleado -> empleado instanceof Gerente).
                mapToDouble(Empleado::calcularSueldoMensual).
                sum();
        System.out.printf("El total de sueldo de todos los gerentes es %.2f%n", totalSueldoGerentes);
    }

    private static Empleado getEmpleadoMasCaro(List<Empleado> empleados) {
        return empleados.stream().
                max(Comparator.comparing(Empleado::calcularSueldoMensual)).
                get();
    }

}
