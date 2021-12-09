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

public class Periodico extends CLibro {
    
    //fecha de publicacion
    
    private Date fecha = new Date();
    private String fecha2;
    
    public Periodico(){
    
    }
    
    public Periodico(String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.fecha2 = fecha2;
    }
    
    
    
    public void agregarPeriodico(){
        //primero necesito jalar el metodo de aceptar datos y despues agregar
        //el tipo de revista
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la fecha de publicacion");
        fecha2 = entrada.nextLine();
        //13 de enero de 2021
        //13/01/2021
        //13/Enero/2021
        //2021/01/13
        //casteo del objeto
        //Date = new String("el formato")
        //String = new Date("datos")
        /*System.out.println("Año: " + fecha.getYear());
        System.out.println("Mes: " + fecha.getMonth());
        System.out.println("Dia: " + fecha.getDay());
        */
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
    
    
}
