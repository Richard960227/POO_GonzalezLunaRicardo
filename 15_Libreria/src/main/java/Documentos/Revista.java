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
public class Revista extends CLibro{
    
    //Tipo_Revista -< espectaculos, chismes, de no tengo idea pq no compro
    private String tipo_revista;
    
    public Revista(){
    
    }

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }

    public String getTipo_revista() {
        return tipo_revista;
    }

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    
    //los datos del tipo de revista 
    
    public void agregarRevista(){
        //primero necesito jalar el metodo de aceptar datos y despues agregar
        //el tipo de revista
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa Tipo de Revista");
        tipo_revista = entrada.nextLine();
    }
   
}