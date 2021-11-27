public class Costo {

    private String titulo, autor;
    private int isbn, ejemplares, costo;

    public Costo() {

    }

    public Costo(String titulo, String autor, int isbn, int ejemplares, int costo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
        this.costo = costo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return isbn;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getCosto(){
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}