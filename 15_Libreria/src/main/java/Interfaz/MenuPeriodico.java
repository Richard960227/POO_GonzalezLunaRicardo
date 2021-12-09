/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author dears
 */
import Controles.ManipularPeriodicos;
import java.io.*;
import java.util.*;

public class MenuPeriodico {
    
    public void menu(){
        
        Scanner entrada = new Scanner(System.in);
        
        //menu principal para poder manipular los datos del periodico y
        //de los demas documentos
        
        //instancia de ManipularPeriodicos
        
        ManipularPeriodicos listadeperiodicosobj = new ManipularPeriodicos();
        
        int opcion;
        
        do{
            System.out.println("\n" + "Bienvenido a la Prensa del Oscurantismo" + "\n");
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1.- Agregar Nuevo Periodico");
            System.out.println("2.- Consultar Periodico");
            System.out.println("3.- Consultar Todos los Periodicos");
            System.out.println("4.- Borrar un Periodico");
            System.out.println("5.- Modificar los Datos de un Periodico");
            System.out.println("6.- Salir");
            
            opcion= entrada.nextInt();
            
            switch (opcion){
                case 1:
                    
                    //agregar un Periodico
                    listadeperiodicosobj.agregarPeriodico();
                    break;
                    
                case 2:
                    
                    //consultar Periodicos por el id
                    listadeperiodicosobj.buscar();
                    break;
                    
                case 3:
                    
                    //consulta de todos los Periodicos
                    listadeperiodicosobj.consultaGeneral();
                    break;
                    
                case 4:
                    
                    //borrar Periodico
                    listadeperiodicosobj.borrar();
                    break;
                    
                case 5:
                    
                    listadeperiodicosobj.modificar();
                    break;
                    
                case 6:
                    
                    //cuando vamos a generar el archivo
                    listadeperiodicosobj.grabar();
                    break;
                    
                default:
                    System.out.println("\n" + "Error, Ingrese una Opcion Valida");
            }
        }while((opcion >= 1) && (opcion < 6));
    }
}