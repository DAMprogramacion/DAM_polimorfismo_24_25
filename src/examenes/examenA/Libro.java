package examenes.examenA;

public class Libro extends Obra{
    private Idioma idioma;
    private String isbn;
    private final int numeroVolumenes;

    public Libro(int numeroVolumenes, String isbn) throws ISBNException {
        if (HelperLibro.getIdiomaDadoISBN(isbn) != null) {
            this.numeroVolumenes = numeroVolumenes;
            this.isbn = isbn;
        } else
            throw new ISBNException();
    }

    @Override
    public int getDuracion() {
        return 120 * numeroVolumenes;
    }

    @Override
    public void setIdioma(Idioma idioma) {
        this.idioma = Idioma.ESPAÑOL;
    }

    @Override
    public String getInformacion() {
        return String.format("LIBRO, %d VOLÚMENES, %s, IDIOMA: %s%n%s",
                numeroVolumenes, isbn, idioma, super.getInformacion());
    }
}
