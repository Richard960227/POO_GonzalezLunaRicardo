

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Libro libro1= new Libro();

        String titulo=JOptionPane.showInputDialog("Introduce el titulo");
        String autor=JOptionPane.showInputDialog("Introduce el Autor");
        int cantidadPrestados=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de libros prestados"));
        int cantidadEjemplares=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de inventario"));

        libro1.setTitulo(titulo);
        libro1.setAutor(autor);
        libro1.setCantidadEjemplares(cantidadEjemplares);
        libro1.setCantidadPrestados(cantidadPrestados);

        if(libro1.darPrestamo()){
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        }else{
            System.out.println("No quedan ejemplares del libro" + libro1.getTitulo());
        }
        if (libro1.devuelveLibros()){
            System.out.println("Se ha devuelto el libro" + libro1.getTitulo());
        }else{
            System.out.println("No hay ejemplares de ese libro " + libro1.getTitulo() + " prestados");
        }

        System.out.println("Se han prestado " + libro1.getCantidadPrestados() + " del libro " + libro1.getTitulo());
    }
}