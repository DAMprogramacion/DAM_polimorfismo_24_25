package repaso;

public final class Gerente extends Empleado {
    private String area;

    public Gerente(String nombreEmpleado, String telefonoEmpleado, double sueldoBase,
                   String area) {
        super(nombreEmpleado, telefonoEmpleado, sueldoBase);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    //nombreEmpleado,telefonoEmpleado,sueldo
    @Override
    public String toString() {
        double dSueldo = calcularSueldoMensual();
        String sSueldo = String.format("%.2f", dSueldo).replace(',', '.');
        return String.format("GERENTE: %s,%s,%s", getNombreEmpleado(), getTelefonoEmpleado(),sSueldo);
    }
}
