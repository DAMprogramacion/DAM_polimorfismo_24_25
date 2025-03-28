package examenes.examenA;

public enum TipoPelicula {
    LARGOMETRAJE(120), CORTOMETRAJE(20);
    private int duracion;

    TipoPelicula(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
}
