package biblioteca;

public class Autor {
    String nombreAutor;
    String pais;

    public Autor(String nombreAutor, String pais) {
        this.nombreAutor = nombreAutor;
        this.pais = pais;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Nombre del autor: " + this.nombreAutor + " Pais de origen: " + this.pais;
    }
}
