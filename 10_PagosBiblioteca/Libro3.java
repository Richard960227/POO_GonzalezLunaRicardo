public class Libro3 extends Costo {

    int costo;

    public Libro3() {
    }
    public Libro3(String titulo, String autor, int isbn, int ejemplares) {
        super(titulo, autor, isbn, ejemplares);
        this.costo = costo;

    }

    // recibir
    public int getCosto() {
        return costo;
    }

    // enviar
    public void setLadrido(int costo) {
        this.costo = costo;
    }

    // metodo para mostra la informacion del Perro
    public void mostrarPerro() {
        System.out.println("Titulo: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n"
                + "ISBN: " + getISBN() + "\n" + "N. Ejemplares: " + getEjemplares() + "\n" + "Costo: " + costo + "\n");
    }
	public void mostrarLibro1() {
	}
    public void mostrarLibro3() {
    }
}