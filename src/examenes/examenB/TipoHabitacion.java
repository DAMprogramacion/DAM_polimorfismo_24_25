package examenes.examenB;

public enum TipoHabitacion {
    INDIVIDUAL(1), DOBLE(2), SUPLEMENTO(3);
    private int huespedes;

    TipoHabitacion(int huespedes) {
        this.huespedes = huespedes;
    }

    public int getHuespedes() {
        return huespedes;
    }
}
