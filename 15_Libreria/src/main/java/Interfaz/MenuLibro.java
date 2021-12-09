/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author dears
 */
import Controles.ManipularLibros;
import java.io.*;
import java.util.*;

public class MenuLibro {
    
    public void menu(){
        
        Scanner entrada = new Scanner(System.in);
        
        //menu principal para poder manipular los datos del libro y
        //de los demas documentos
        
        //instancia de ManipularLibros
        
        ManipularLibros listadelibrosobj = new ManipularLibros();
        
        int opcion;
        
        do{
            System.out.println("\n" + "Bienvenido a la Libreria del Oscurantismo" + "\n");
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1.- Agregar Nuevo Libro");
            System.out.println("2.- Consultar Libro");
            System.out.println("3.- Consultar Todos los Libros");
            System.out.println("4.- Borrar un Libro");
            System.out.println("5.- Modificar los Datos de un Libro");
            System.out.println("6.- Salir");
            
            opcion= entrada.nextInt();
            
            switch (opcion){
                case 1:
                    
                    //agregar un libro
                    listadelibrosobj.agregarLibro();
                    break;
                    
                case 2:
                    
                    //consultar libros por el id
                    listadelibrosobj.buscar();
                    break;
                    
                case 3:
                    
                    //consulta de todos los libros
                    listadelibrosobj.consultaGeneral();
                    break;
                    
                case 4:
                    
                    //borrar libro
                    listadelibrosobj.borrar();
                    break;
                    
                case 5:
                    
                    listadelibrosobj.modificar();
                    break;
                    
                case 6:
                    
                    //cuando vamos a generar el archivo
                    listadelibrosobj.grabar();
                    break;
                    
                default:
                    System.out.println("\n" + "Error, Ingrese una Opcion Valida");
            }
        }while((opcion >= 1) && (opcion < 6));
    }

}
