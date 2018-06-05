package biblioteca;

public class Libro {

    private String titulo;
    private Autor[] autor;
    private int anio;
    private Boolean favorito;

    public Libro(String titulo, Autor[] autor, int anio, Boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        String Stringlibros= "Titulo: "+  this.titulo + " Anio: " + this.anio + " ";
        Stringlibros+= "Autor: " + this.autor;
        return  Stringlibros;
    }
}
