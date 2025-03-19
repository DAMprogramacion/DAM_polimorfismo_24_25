package repaso;

public final class Vendedor extends Empleado{
    private double comision;

    public Vendedor(String nombreEmpleado, String telefonoEmpleado, double sueldoBase,
                    double comision) {
        super(nombreEmpleado, telefonoEmpleado, sueldoBase);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    /*@Override  ya no aparece este metodo en el padre
    public double calcularSueldoMensual() {
        double suedo = super.calcularSueldoMensual() + super.calcularSueldoMensual() * comision / 100;
        return suedo;
    }*/
    public double calcularSueldoMensual() {
        return getSueldoBase() + getSueldoBase() * comision / 100;
    }
    //nombreEmpleado,telefonoEmpleado,sueldo
    @Override
    public String toString() {
        double dSueldo = calcularSueldoMensual();
        String sSueldo = String.format("%.2f", dSueldo).replace(',', '.');
        return String.format("VENDEDOR: %s,%s,%s", getNombreEmpleado(), getTelefonoEmpleado(),sSueldo);
    }
}




