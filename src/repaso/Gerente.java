package repaso;
//cambiamos atributo area de String a Area (que es un enum, que asocia nombre y gratificación)
public final class Gerente extends Empleado {
    private Area area;

    public Gerente(String nombreEmpleado, String telefonoEmpleado, double sueldoBase,
                   Area area) {
        super(nombreEmpleado, telefonoEmpleado, sueldoBase);
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    protected double calcularSueldoMensual() {
        return getSueldoBase() + area.getGratificacion();
    }

    /*vamos ahora implementar el metodo abstracto del padre
        //creamos el metodo calcularSueldoMensual, que antes no estaba, pues estaba el del padre
        public double calcularSueldoMensual() {
            return getSueldoBase() + area.getGratificacion();
        }*/
    //nombreEmpleado,telefonoEmpleado,sueldo
    @Override
    public String toString() {
        double dSueldo = calcularSueldoMensual();
        String sSueldo = String.format("%.2f", dSueldo).replace(',', '.');
        return String.format("GERENTE: %s,%s,%s", getNombreEmpleado(), getTelefonoEmpleado(),sSueldo);
    }
}
