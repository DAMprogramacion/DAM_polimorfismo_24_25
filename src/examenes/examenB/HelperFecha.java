package examenes.examenB;

import java.time.LocalDate;

public class HelperFecha {
    public static LocalDate getFecha (String fecha) {
        if (fecha.matches("[0-9]{4}-(0[1-9]|1[012])-([1-9]|[12][0-9]|3[01])"))
            return LocalDate.parse(fecha);
        return null;
    }
    public static boolean fechaAnteriorActual (LocalDate fecha) {
        return fecha.isBefore(LocalDate.now());
    }

    public static void main(String[] args) {
        System.out.println(getFecha("2025-03-28"));
        System.out.println(getFecha("2000-13-12"));
        System.out.println(getFecha("2000-12-32"));
        System.out.println(getFecha("2000-12-31"));
        System.out.println("2000-10-10 " + fechaAnteriorActual(LocalDate.of(2000,10,10)));
        System.out.println("2000-10-10 " + fechaAnteriorActual(LocalDate.of(2030,10,10)));
        System.out.println(LocalDate.now().toString() +" " + fechaAnteriorActual(LocalDate.now()));
    }
}
