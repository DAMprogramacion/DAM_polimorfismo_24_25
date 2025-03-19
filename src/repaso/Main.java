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
                "juani ramirez", "999556678", 2000, Area.FABRICA);
        Empleado gerente2 = new Gerente(
                "esteban ramirez", "999556600", 3000, Area.PERSONAL);
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
        //los objetos Empleado ya no tienen el metodo calcularSueldoMensual, solución:
        //un bucle for y el operador instaceof
        /*double totalSueldoGerentes = empleados.stream().
                filter(empleado -> empleado instanceof Gerente).
                mapToDouble(Empleado::calcularSueldoMensual).
                sum();*/
        double totalSueldoGerentes = 0;
        for (Empleado empleado : empleados)
            if (empleado instanceof Gerente) {
                Gerente gerente = (Gerente) empleado;
                totalSueldoGerentes += gerente.calcularSueldoMensual();
            }
        System.out.printf("El total de sueldo de todos los gerentes es %.2f%n", totalSueldoGerentes);
    }
    /*no existe el metodo calcularSueldoMensual, hacemos algo similar que arriba
    private static Empleado getEmpleadoMasCaro(List<Empleado> empleados) {
        return empleados.stream().
                max(Comparator.comparing(Empleado::calcularSueldoMensual)).
                get();
    }*/
    private static Empleado getEmpleadoMasCaro(List<Empleado> empleados) {
        Empleado empleadoMasCaro = null;
        double sueldoMasCaro     = 0;
        for (Empleado empleado : empleados) {
            if (empleado instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) empleado;
                if (vendedor.calcularSueldoMensual() > sueldoMasCaro) {
                    empleadoMasCaro = vendedor;
                    sueldoMasCaro = vendedor.calcularSueldoMensual();
                }
            }
            if (empleado instanceof Gerente) {
                Gerente gerente = (Gerente) empleado;
                if (gerente.calcularSueldoMensual() > sueldoMasCaro) {
                    empleadoMasCaro = gerente;
                    sueldoMasCaro = gerente.calcularSueldoMensual();
                }
            }
        }
        return empleadoMasCaro;
    }

}








