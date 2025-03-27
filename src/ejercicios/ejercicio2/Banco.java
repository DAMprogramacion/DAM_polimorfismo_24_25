package ejercicios.ejercicio2;

public interface Banco {

    double getSaldo();
    void ingresarDinero(double cantidad);
    void sacarDinero(double cantidad);

    private boolean puedeRetirarDinero(double cantidad) {
        return getSaldo() - cantidad >= 0;
    }

    private void mostrarInformacionTransacion (TipoTransaccion tipoTransaccion, double cantidad) {
        StringBuilder builder = new StringBuilder();
        builder.append("Transación: ").append(tipoTransaccion).append('\n');
        builder.append("Cantidad: ").append(String.format("%.2f €", cantidad)).append('\n');
        builder.append("Saldo: ").append(String.format("%.2f €", getSaldo())).append('\n');
        System.out.println(builder);
    }

    default void ejecutarTransacion (TipoTransaccion tipoTransaccion, double cantidad) {
        if (tipoTransaccion.equals(TipoTransaccion.RETIRADA)) {
            if (puedeRetirarDinero(cantidad))
                sacarDinero(cantidad);
            else
                System.out.println("No se puede realizar dicha transación");
            mostrarInformacionTransacion(tipoTransaccion, cantidad);
        }
        if (tipoTransaccion.equals(TipoTransaccion.INGRESO)) {
            ingresarDinero(cantidad);
            mostrarInformacionTransacion(tipoTransaccion, cantidad);
        }
    }
    static Banco crearCuantaCorriente(double saldo) {
        return new CuentaCorriente(saldo);
    }
}





