public class Libro2 extends Costo {

    int costo;

    public Libro2() {
    }
    public Libro2(String titulo, String autor, int isbn, int ejemplares, int costo) {
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

    public void mostrarLibro2() {
        System.out.println("Titulo: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n"
                + "ISBN: " + getISBN() + "\n" + "N. Ejemplares: " + getEjemplares() + "\n" + "Costo: " + costo + "\n");
    }
}