package repaso;

public class Empleado {
    private String nombreEmpleado;
    private String telefonoEmpleado;
    private double sueldoBase;

    public Empleado(String nombreEmpleado, String telefonoEmpleado, double sueldoBase) {
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.sueldoBase = sueldoBase;
    }

    protected String getNombreEmpleado() {
        return nombreEmpleado;
    }

    protected void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    protected String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    protected void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }
    //renombramos este metodo como getter del atributo sueldoBase, afecta a Vendedor
    protected double getSueldoBase() {
        return sueldoBase;
    }

    protected void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        double dSueldo = getSueldoBase();
        String sSueldo = String.format("%.2f", dSueldo).replace(',', '.');
        return String.format("EMPLEADO: %s,%s,%s", getNombreEmpleado(), getTelefonoEmpleado(),sSueldo);
    }
}
