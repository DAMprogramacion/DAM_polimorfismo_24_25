package repaso;
//cada Gerente tiene un plus adicional en el suedo en función
//del área donde se encuentra
public enum Area {
    PERSONAL(600), FABRICA(1_000), ADMINISTRACION(200);
    private double gratificacion;

    Area(double gratificacion) {
        this.gratificacion = gratificacion;
    }

    public double getGratificacion() {
        return gratificacion;
    }
}
