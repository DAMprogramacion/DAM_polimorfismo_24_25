package ejercicios.ejercicio2;

public final class CuentaCorriente implements Banco{
    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void sacarDinero(double cantidad) {
        saldo -= cantidad;
    }
}
