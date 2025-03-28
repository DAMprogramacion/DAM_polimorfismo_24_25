package examenes.examenA;

public interface ObraCultural {
    int getDuracion();
    void setAutor(String autor);
    void setTituto(String tituto);
    void setIdioma(Idioma idioma);
    default String getInformacion() {
        return String.format("DURACIÓN: %d minutos", getDuracion());
    }
}
