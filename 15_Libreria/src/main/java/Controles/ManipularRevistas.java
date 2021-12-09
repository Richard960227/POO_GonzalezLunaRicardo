/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author dears
 */
import Documentos.Revista;
import java.util.*;
import java.io.*;

public class ManipularRevistas implements Serializable {

    //vamos a crear un metodo para agregar varias revistas
    //los objetos que son capaces de soportar diferentes tipos de dato
    private ArrayList<Revista> listaderevistas;

    //un objeto para el archivo de mis revistas;
    private ArchivoR objetoarchivorevistas = new ArchivoR();

    /*
    Esta clase u objeto es la que se va a encargar de poder
    crear y leer los archivos del documento de revista
     */
    //vamos a hacer el crud de revistas
    //c create, r read, u update, d delete
    public ManipularRevistas() {
        //vamos a cargar la instancia de la lista de las revistas
        listaderevistas = new ArrayList<Revista>();
        //vamos aplicar una sobrecarga al objeto para mandar
        //a llamar su lectura correspondiente  del archivo creado
        listaderevistas = objetoarchivorevistas.leer();
    }

    //crud
    public void agregarRevista() {
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        //ciclo para solicitar datos de los libros
        while (resp == 's') {
            //hago un objeto de Revista y mando a llamar el metodo de los datos
            Revista objrevista = new Revista();
            objrevista.aceptarDatos();
            objrevista.agregarRevista();
            //lo agrego al array
            listaderevistas.add(objrevista);
            System.out.println("\n" + "¿Deseas Agregar Otra Revista?");
            resp = entrada.next().charAt(0);

        }
    }

    //Conaultar una revista de forma general
    public void consultaGeneral() {

        //si hay revistas
        //y si la lista esta vacia que hago
        if (listaderevistas.isEmpty()) {
            System.out.println("\n" + "No Hay Revistas Agregadas");
        } else {
            //no esta vacia
            System.out.println("\n" + "Las Revistas son: \n");
            //recorrer la lista de los libros
            for (int i = 0; i < listaderevistas.size(); i++) {
                System.out.println("ID de la Revista: " + listaderevistas.get(i));
                System.out.println("Nombre de la Revista: " + listaderevistas.get(i).getNombre());
                System.out.println("Autor de la Revista: " + listaderevistas.get(i).getAutor());
                System.out.println("Editorial de la Revista: " + listaderevistas.get(i).getEditorial());
                System.out.println("Precio de la Revista: " + listaderevistas.get(i).getPrecio());
                System.out.println("Tipo de Revista: " + listaderevistas.get(i).getTipo_revista() + "\n");
            }
        }
    }

    //Vamos a realizar una busqueda por nombre
    //sangre y fuego de juego de tronos
    private int traePosicion(String buscarNombre) {
        int pos = 0;
        boolean existe = false;

        //recorrer la lista de las revistas
        for (int i = 0; i < listaderevistas.size(); i++) {
            //busca el nombre de la revista
            if (buscarNombre.equalsIgnoreCase(listaderevistas.get(i).getNombre())) {
                //si lo encuentra
                pos = i;
                existe = true;
            } else if (!existe) {
                System.out.println("\n" + "Revista No Encontrado. Favor de Ponerse en Contacto con el Administrador");
            }
        }
        if (!existe) {
            //porque esta fuera el arreglo o la lista osea no existe
            System.out.println("\n" + "No Existe Registro de la Revista");
            pos = -1;
        }
        return pos;
    }

    //metodo de la busqueda
    //puedo buscar por nombre, editorial, precio, tipo
    public int buscar() {
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n" + "Ingresa el Nombre de la Revista que Desea Buscar");
        nombreBuscar = entrada.nextLine();

        posbuscar = traePosicion(nombreBuscar);

        //visualizo los datos
        System.out.println("\n" + "Nombre de la Revista: " + listaderevistas.get(posbuscar).getNombre());
        System.out.println("Autor de la Revista: " + listaderevistas.get(posbuscar).getAutor());
        System.out.println("Editorial de la Revista: " + listaderevistas.get(posbuscar).getEditorial());
        System.out.println("Precio de la Revista: " + listaderevistas.get(posbuscar).getPrecio());
        System.out.println("Tipo de Revista: " + listaderevistas.get(posbuscar).getTipo_revista());

        return posbuscar;
    }

    public void borrar() {

        Scanner entrada = new Scanner(System.in);

        String revistaborrar;
        int posborrar;

        try {
            //verificar que lista de revistas no este vacia
            if (listaderevistas.isEmpty()) {
                System.out.println("\n" + "No Hay Revistas Registradas");
            } else {
                System.out.println("\n" + "Buscar y Eliminar");
                posborrar = buscar();

                if (posborrar < listaderevistas.size()) {
                    //si esta dentro de la lista
                    listaderevistas.remove(posborrar);
                    System.out.println("\n" + "Revista Eliminada");
                } else {
                    //esta afuera del rango
                    System.out.println("\n" + "Imposible Eliminar Registro");
                }
            }
        } catch (Exception obj) {
            System.out.println("");
        }

    }

    //modificar
    //autor, editorial, precio, tipo
    public void modificar() {

        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        char resp = 's';

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n" + "Ingresa Nombre de la Revista que Deseas Modificar: ");
        modificar = entrada.nextLine();

        while (resp == 's'){
            posmodificar = traePosicion(modificar);

            //ya se obtuvieron los datos
            System.out.println("\n" + "¿Que Dato Deseas Modificar de la Revista?"
                    + "\n 1.- Autor."
                    + "\n 2.- Editorial"
                    + "\n 3.- Precio"
                    + "\n 4.- Tipo");

            resmod = entrada.nextInt();

            switch (resmod) {
                case 1:
                    //autor
                    System.out.println("\n" + "El autor es: ");
                    System.out.println("Autor: " + listaderevistas.get(posmodificar).getAutor());
                    System.out.println("Ingresa el Nuevo Autor");
                    listaderevistas.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Autor: " + listaderevistas.get(posmodificar).getAutor());

                    break;

                case 2:
                    //editorial
                    System.out.println("\n" + "La Editorial es: ");
                    System.out.println("Editorial: " + listaderevistas.get(posmodificar).getEditorial());
                    System.out.println("Ingresa la Nueva Editorial");
                    listaderevistas.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Editorial: " + listaderevistas.get(posmodificar).getEditorial());

                    break;

                case 3:
                    //precio
                    System.out.println("\n" + "El Precio es: ");
                    System.out.println("Precio: " + listaderevistas.get(posmodificar).getPrecio());
                    System.out.println("Ingresa el Nuevo Precio");
                    listaderevistas.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Precio: " + listaderevistas.get(posmodificar).getPrecio());

                    break;

                case 4:
                    //fecha
                    System.out.println("\n" + "El Tipo es: ");
                    System.out.println("Tipo: " + listaderevistas.get(posmodificar).getTipo_revista());
                    System.out.println("Ingresa el Nuevo Tipo");
                    listaderevistas.get(posmodificar).setTipo_revista(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Tipo: " + listaderevistas.get(posmodificar).getTipo_revista());

                default:
                    System.out.println("\n" + "Opcion Invalida");
            }
            System.out.println("\n" + "¿Quieres Cambiar Algun Otro Dato? s/n");
            resp = entrada.next().charAt(0);
        }
    }

    //para grabar el archivo
    //hacer el archivo para guardar la info de las revistas
    public void grabar() {
        //mandando a llamar a que se cree el archivo
        getObjetoarchivorevistas().serializar(listaderevistas);
    }

    public ArrayList<Revista> getListaderevistas() {
        return listaderevistas;
    }

    public void setListaderevistas(ArrayList<Revista> listaderevistas) {
        this.listaderevistas = listaderevistas;
    }

    public ArchivoR getObjetoarchivorevistas() {
        return objetoarchivorevistas;
    }

    public void setObjetoarchivorevistas(ArchivoR objetoarchivorevistas) {
        this.objetoarchivorevistas = objetoarchivorevistas;
    }

}
