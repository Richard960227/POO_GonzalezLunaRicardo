/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author dears
 */
import Controles.ManipularRevistas;
import java.io.*;
import java.util.*;

public class MenuRevista {
    
    public void menu(){
        
        Scanner entrada = new Scanner(System.in);
        
        //menu principal para poder manipular los datos del periodico y
        //de los demas documentos
        
        //instancia de ManipularPeriodicos
        
        ManipularRevistas listaderevistasobj = new ManipularRevistas();
        
        int opcion;
        
        do{
            System.out.println("\n" + "Bienvenido a la Revisteria del Oscurantismo" + "\n");
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1.- Agregar Nueva Revista");
            System.out.println("2.- Consultar Revista");
            System.out.println("3.- Consultar Todas las Revistas");
            System.out.println("4.- Borrar una Revista");
            System.out.println("5.- Modificar los Datos de una Revista");
            System.out.println("6.- Salir");
            
            opcion= entrada.nextInt();
            
            switch (opcion){
                case 1:
                    
                    //agregar un Periodico
                    listaderevistasobj.agregarRevista();
                    break;
                    
                case 2:
                    
                    //consultar Periodicos por el id
                    listaderevistasobj.buscar();
                    break;
                    
                case 3:
                    
                    //consulta de todos los Periodicos
                    listaderevistasobj.consultaGeneral();
                    break;
                    
                case 4:
                    
                    //borrar Periodico
                    listaderevistasobj.borrar();
                    break;
                    
                case 5:
                    
                    listaderevistasobj.modificar();
                    break;
                    
                case 6:
                    
                    //cuando vamos a generar el archivo
                    listaderevistasobj.grabar();
                    break;
                    
                default:
                    System.out.println("\n" + "Error, Ingrese una Opcion Valida");
            }
        }while((opcion >= 1) && (opcion < 6));
    }
}
