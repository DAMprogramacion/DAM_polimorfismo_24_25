package examenes.examenA;

public class Pelicula extends Obra{
    private Idioma idioma;
    private final String[] actores;
    private final TipoPelicula tipoPelicula;

    public Pelicula(String[] actores, TipoPelicula tipoPelicula) {
        this.actores = actores;
        this.tipoPelicula = tipoPelicula;
    }

    @Override
    public int getDuracion() {
        return tipoPelicula.getDuracion();
    }

    @Override
    public void setIdioma(Idioma idioma) {
        this.idioma = Idioma.INGLES;
    }

    @Override
    public String getInformacion() {
        return String.format("PELÍCULA, %s, %d ACTORES PRINCIPALES, IDIOMA: %s%n%s",
                tipoPelicula, actores.length, idioma, super.getInformacion());
    }
}
