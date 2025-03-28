package examenes.examenA;

public abstract class Obra implements ObraCultural{
    private String autor;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void setTituto(String tituto) {
        this.titulo = tituto;
    }

    @Override
    public String getInformacion() {
        return String.format("TÍTULO: %s, AUTOR: %s, DURACIÓN: %d minutos",
                titulo, autor, getDuracion());
    }
}
