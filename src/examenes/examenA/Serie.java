package examenes.examenA;

public class Serie extends Obra{
    private Idioma idioma;
    private final String plataforma;
    private final int numeroCapitulos;

    public Serie(String plataforma, int numeroCapitulos) {
        this.plataforma = plataforma;
        this.numeroCapitulos = numeroCapitulos;
    }

    @Override
    public int getDuracion() {
        return numeroCapitulos * 45;
    }

    @Override
    public void setIdioma(Idioma idioma) {
        this.idioma = Idioma.FRANCES;
    }

    @Override
    public String getInformacion() {
        return String.format("SERIE, %d CAPÍTULOS, %s, IDIOMA: %s%n%s",
                numeroCapitulos, plataforma, idioma, super.getInformacion());
    }
}
