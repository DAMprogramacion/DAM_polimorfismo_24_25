package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.crearCuantaCorriente(100);
        banco.ejecutarTransacion(TipoTransaccion.INGRESO, 200);
        banco.ejecutarTransacion(TipoTransaccion.RETIRADA, 500);
        banco.ejecutarTransacion(TipoTransaccion.RETIRADA, 150);
    }
}
