/*
1- 20
Suma de los cotos de la biblioteca
Costo mayor
Costo menor
costro promedio
costo total de los productos (libros)
*/

import java.util.*;
import javax.swing.*;
import java.lang.Math;

public class Proveedores {

    private String nombre_cliente, producto;
    private int costo, producto_existente;

    public Proveedores() {
    }

    public Proveedores(String nombre_cliente, String producto, int costo, int producto_existe) {
        this.nombre_cliente = nombre_cliente;
        this.producto = producto;
        this.costo = costo;
        this.producto_existente = producto_existe;

    }

    // los metodos Getter Y Setter de cada variable

    // recibir
    public String getNombre_Cliente() {
        return nombre_cliente;
    }

    // enviar
    public void setNombre_Cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    // recibir
    public String getProducto() {
        return producto;
    }

    // enviar
    public void setProducto(String producto) {
        this.producto = producto;
    }

    // recibir
    public int getCosto() {
        return costo;
    }

    // enviar
    public void setCosto(int costo) {
        this.costo = costo;
    }

    // recibir
    public int getProducto_Existente() {
        return producto_existente;
    }

    // enviar
    public void setProducto_Existente(int producto_existente) {
        this.producto_existente = producto_existente;
    }

    // menu

    public void MenuProveedores() {

            Libro1 libro1 = new Libro1 ("La Conjura de los necios","TOOLE, Jhon Kennedy", 001, 50, 359);
            Libro2 libro2 = new Libro2 ("La casa de los espiritus","ALLENDE, Isabel", 002, 68, 539);
            Libro3 libro3 = new Libro3 ("Teoria y metodos de investigacion social","GALTUNG, Johan", 003, 20, 360);
            Libro4 libro4 = new Libro4 ("Eat What You Want and Die Like a Man","GRAHAM, Steve", 004, 6, 279);
            Libro5 libro5 = new Libro5 ("El tio Petros y la conjetura de Goldbach","DIOXADIS", 005, 75, 699);
    
            libro1.mostrarLibro1();
            libro2.mostrarLibro2();
            libro3.mostrarLibro3();
            libro4.mostrarLibro4();
            libro5.mostrarLibro5();

        String text;
        int opcion = 0;
        // try catch para el manejo de errores
        // un ciclo do while para repetir las opciones
        text = JOptionPane.showInputDialog(
                "Seleccione la funcion deseada: " + "\n 1.- Suma total de costos" + "\n 2.- Costo Mayor (Ingresaras Costos Manualmente)"
                        + "\n 3.- Costo Menor (Ingresaras Costos Manualmente)" + "\n 4.- Costo Promedio" + "\n 5.- Costo Total del Producto");

        opcion = Integer.parseInt(text);

        /*
         * 
         * De los libros que se crearon deberan de agregar la clase costo aplicando
         * herencia para que se pueda manejar el costo de cada libro Libro drama = new
         * Libro("La cumbre escarlata", "No me lo se", "12345-BN", 5, 44); Libro
         * fantasmas = new Libro("Las cronicas Mutantes", "No me lo se", "00345-BN", 3,
         * 608); Si elijo la opcion 1 total del costo de la cumbre escarlata : 5*44 Si
         * elijo la opcion 2 se debe de obtener cual es el libro que tiene mayor costo:
         * Las cronicas mutantes con 608 Si eljijo la opcion 3 debe de salir el libro
         * mas barato : la cumbre escarlata 44 Si elijo la opcion 4 se debe de sacar el
         * promedio de los costos de los libros Si eljjo la opcion 5 : deben de
         * multiplicar cantidad de libros los ejemplares * costo de cada uno
         * 
         */

        // aqui hay que agregar el menu de las opciones

        switch (opcion) {
        case 1:
            SumaTotal();
            break;
        case 2:
            CostoMayor();
            break;
        case 3:
            CostoMenor();
            break;
        case 4:
            CostoPromedio();
            break;

        case 5:
            CostoTotal();
            break;

        default:
            // un mensajito de gracias :3
            break;
        }
    }

    public void SumaTotal() {

        double suma;

        suma = 359 + 539 + 360 + 279 + 699;

        JOptionPane.showMessageDialog(null, "Suma de Costos: " +suma);  
        
    }

    public void CostoMayor() {

        int cantidadlibros = 0;
        int libro = 0, libromaximo = 0;
        boolean primerlibro = false;
        cantidadlibros = Integer.parseInt(JOptionPane.showInputDialog("Libros a Capturar"));
        for (int i = 1; i <= cantidadlibros; i++) {
            libro = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Costo"));
            if (primerlibro == false) {
                libromaximo = libro;
                primerlibro = true;
            }
            if (libro > libromaximo)
                libromaximo = libro;
        }
        JOptionPane.showMessageDialog(null, "El Costo Mayor es: " + libromaximo);
    }

    public void CostoMenor() {

        int cantidadlibros = 0;
        int libro = 0, libromaximo = 0;
        boolean primerlibro = false;
        cantidadlibros = Integer.parseInt(JOptionPane.showInputDialog("Libros a Capturar"));
        for (int i = 1; i <= cantidadlibros; i++) {
            libro = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Costo"));
            if (primerlibro == false) {
                libromaximo = libro;
                primerlibro = true;
            }
            if (libro < libromaximo)
                libromaximo = libro;
        }
        JOptionPane.showMessageDialog(null, "El Costo Menor es: " + libromaximo);
    }

    public void CostoPromedio() {

        double suma, media;

        suma= 359 + 539 + 360 + 279 + 699;

        media= suma/5;

        JOptionPane.showMessageDialog(null, "Costo Promedio: " +media);
    }

    public void CostoTotal() {

        double suma;

        suma= (359*50 )+(539*68 )+(360*20)+(279*6)+(699*75);

        JOptionPane.showMessageDialog(null, "Costo por los Ejemplares: " +suma);

    }

}
