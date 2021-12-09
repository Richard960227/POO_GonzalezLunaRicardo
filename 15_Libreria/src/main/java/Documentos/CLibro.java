/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

/**
 *
 * @author dears
 */
import java.util.*;

public class CLibro {

    //las variables de un libro
    private String nombre;
    private String autor;
    private String editorial;
    private float precio;

    public CLibro() {

    }

    public CLibro(String nombre, String autor, String editorial, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void aceptarDatos() {

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("\n" + "Ingresa el Nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingresa el Nombre del Autor");
            autor = entrada.nextLine();
            System.out.println("Ingresa la Editorial");
            editorial = entrada.nextLine();
            System.out.println("Ingresa el Precio");
            precio = entrada.nextFloat();
        } catch (Exception e) {
            System.out.println("\n" + "Error en Dato");
        }

    }
}
