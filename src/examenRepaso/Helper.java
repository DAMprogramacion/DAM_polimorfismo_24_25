package examenRepaso;

public class Helper {
    public static boolean validarNumeroReferencia (String numeroReferencia) {
        return numeroReferencia.toUpperCase().matches("([GR]|SR)E[1-9][0-9]{2}");
    }
}
