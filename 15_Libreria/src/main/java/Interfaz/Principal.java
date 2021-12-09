/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author dears
 */
import java.util.*;


public class Principal{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //menu principal para poder manipular los datos del libro y
        //de los demas documentos
        int opcion;

        do {

            System.out.println("\n" + "*******************************************************"
                    + "\n Universidad Tres Culturas"
                    + "\n &"
                    + "\n González Luna Ricardo"
                    + "\n del"
                    + "\n Grupo 15"
                    + "\n da"
                    + "\n Bienvenida a la Biblioteca del Oscurantismo");
            System.out.println("******************************************************");
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1.- Gestionar Libros");
            System.out.println("2.- Gestionar Periodicos");
            System.out.println("3.- Gestionar Revistas");
            System.out.println("4.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    //menu libro
                    MenuLibro objMenuL = new MenuLibro();
                    objMenuL.menu();
                    break;

                case 2:

                    //menu periodico
                    MenuPeriodico objMenuP = new MenuPeriodico();
                    objMenuP.menu();
                    break;

                case 3:

                    //menu revista
                    MenuRevista objMenuR = new MenuRevista();
                    objMenuR.menu();
                    break;

                case 4:

                    System.out.println("\n Adios, Gracias por su Alma");

                    break;

                default:
                    System.out.println("\n Error, Ingrese una Opcion Valida");
            }
        } while ((opcion >= 1) && (opcion < 4));
    }
}
