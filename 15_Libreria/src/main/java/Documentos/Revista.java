/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

import java.util.Scanner;

/**
 *
 * @author dears
 */
public class Revista extends CLibro {

    //Tipo_Revista
    private String tipo_revista;

    public Revista() {
    }

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    public Revista(String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }

    /**
     * @return the tipo_revista
     */
    public String getTipo_revista() {
        return tipo_revista;
    }

    /**
     * @param tipo_revista the tipo_revista to set
     */
    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    //los datos del tipo de revista
    public void agregarRevista() {
        //primero necesito jalar el metodo de aceptar datos y despues agregar
        //el tipo de revista
        CLibro datoslibro = new CLibro();

        Scanner entrada = new Scanner(System.in);

        datoslibro.aceptarDatos(); //todos los datos del documento
        System.out.println("Ingresa el tipo de revista");
        tipo_revista = entrada.nextLine();

    }

}
