public class Libro5 extends Costo {

    int costo;

    public Libro5() {
    }
    public Libro5(String titulo, String autor, int isbn, int ejemplares, int costo) {
        super(titulo, autor, isbn, ejemplares);
        this.costo = costo;

    }

    // recibir
    public int getCosto() {
        return costo;
    }

    // enviar
    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void mostrarLibro5() {
        System.out.println("Titulo: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n"
                + "ISBN: " + getISBN() + "\n" + "N. Ejemplares: " + getEjemplares() + "\n" + "Costo: " + costo + "\n");
    }
}