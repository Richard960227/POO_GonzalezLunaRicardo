/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author dears
 */
import Documentos.Periodico;
import java.util.*;
import java.io.*;

public class ManipularPeriodicos implements Serializable {

    //vamos a crear un metodo para agregar varios periodicos
    //los objetos que son capaces de soportar diferentes tipos de dato
    private ArrayList<Periodico> listadeperiodicos;

    //un objeto para el archivo de mis periodicos;
    private ArchivoP objetoarchivoperiodicos = new ArchivoP();

    /*
    Esta clase u objeto es la que se va a encargar de poder
    crear y leer los archivos del documento de periodico
     */
    //vamos a hacer el crud de periodicos
    //c create, r read, u update, d delete
    public ManipularPeriodicos() {
        //vamos a cargar la instancia de la lista de los periodicos
        listadeperiodicos = new ArrayList<Periodico>();
        //vamos aplicar una sobrecarga al objeto para mandar
        //a llamar su lectura correspondiente  del archivo creado
        listadeperiodicos = objetoarchivoperiodicos.leer();
    }

    //crud
    public void agregarPeriodico() {
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        //ciclo para solicitar datos de los periodicos
        while (resp == 's') {
            //hago un objeto de CLibro y mando a llamar el metodo de los datos
            Periodico objperiodico = new Periodico();
            objperiodico.aceptarDatos();
            objperiodico.agregarPeriodico();
            //lo agrego al array
            listadeperiodicos.add(objperiodico);
            System.out.println("\n" + "¿Deseas Agregar Otro Periodico?");
            resp = entrada.next().charAt(0);

        }
    }

    //Conaultar un periodico de forma general
    public void consultaGeneral() {

        //si hay periodicos
        //y si la lista esta vacia que hago
        if (listadeperiodicos.isEmpty()) {
            System.out.println("\n" + "No Hay Periodicos Agregados");
        } else {
            //no esta vacia
            System.out.println("\n" + "Los Periodicos son: \n");
            //recorrer la lista de los periodicos
            for (int i = 0; i < listadeperiodicos.size(); i++) {
                System.out.println("ID del Libro: " + listadeperiodicos.get(i));
                System.out.println("Nombre del Periodico: " + listadeperiodicos.get(i).getNombre());
                System.out.println("Autor del Periodico: " + listadeperiodicos.get(i).getAutor());
                System.out.println("Editorial del Periodico: " + listadeperiodicos.get(i).getEditorial());
                System.out.println("Precio del Periodico: " + listadeperiodicos.get(i).getPrecio());
                System.out.println("Fecha de Publicacion del Periodico: " + listadeperiodicos.get(i).getFecha2() + "\n");
            }
        }
    }

    //Vamos a realizar una busqueda por nombre
    //sangre y fuego de juego de tronos
    private int traePosicion(String buscarNombre) {
        int pos = 0;
        boolean existe = false;

        //recorrer la lista de los periodicos
        for (int i = 0; i < listadeperiodicos.size(); i++) {
            //busca el nombre del periodico
            if (buscarNombre.equalsIgnoreCase(listadeperiodicos.get(i).getNombre())) {
                //si lo encuentra
                pos = i;
                existe = true;
            } else if (!existe){
                System.out.println("\n" + "Periodico No Encontrado. Favor de Ponerse en Contacto con el Administrador");
            }
        }
        if (!existe) {
            //porque esta fuera el arreglo o la lista osea no existe
            System.out.println("\n" + "No Existe Registro del Periodico");
            pos = -1;
        }
        return pos;
    }

    //metodo de la busqueda
    //puedo buscar por nombre, editorial, precio
    public int buscar() {
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n" + "Ingresa el Nombre del Periodico que Desea Buscar");
        nombreBuscar = entrada.nextLine();

        posbuscar = traePosicion(nombreBuscar);

        //visualizo los datos
        System.out.println("\n" + "Nombre del Periodico: " + listadeperiodicos.get(posbuscar).getNombre());
        System.out.println("Autor del Periodico: " + listadeperiodicos.get(posbuscar).getAutor());
        System.out.println("Editorial del Periodico: " + listadeperiodicos.get(posbuscar).getEditorial());
        System.out.println("Precio del Periodico: " + listadeperiodicos.get(posbuscar).getPrecio());
        System.out.println("Fecha de Publicacion del Periodico: " + listadeperiodicos.get(posbuscar).getFecha2());

        return posbuscar;
    }

    public void borrar() {

        Scanner entrada = new Scanner(System.in);

        String periodicoborrar;
        int posborrar;

        try {
            //verificar que lista de periodicos no este vacia
            if (listadeperiodicos.isEmpty()) {
                System.out.println("\n" + "No Hay Periodicos Registrados");
            } else {
                System.out.println("\n" + "Buscar y Eliminar");
                posborrar = buscar();

                if (posborrar < listadeperiodicos.size()) {
                    //si esta dentro de la lista
                    listadeperiodicos.remove(posborrar);
                    System.out.println("\n" + "Periodico Eliminado");
                } else {
                    //esta afuera del rango
                    System.out.println("\n" + "Imposible Eliminar ese Registro");
                }
            }
        } catch (Exception obj) {
            System.out.println("");
        }

    }

    //modificar
    //autor, editorial, precio
    public void modificar() {

        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        char resp = 's';

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n" + "Ingresa el Nombre del Periodico que Deseas Modificar: ");
        modificar = entrada.nextLine();

        while (resp == 's'){
            posmodificar = traePosicion(modificar);

            //ya se obtuvieron los datos
            System.out.println("\n" + "¿Que Dato Deseas Modificar del Periodico?"
                    + "\n 1.- Autor."
                    + "\n 2.- Editorial"
                    + "\n 3.- Precio"
                    + "\n 4.- Fecha");

            resmod = entrada.nextInt();

            switch (resmod) {
                case 1:
                    //autor
                    System.out.println("\n" + "El Autor es: ");
                    System.out.println("Autor: " + listadeperiodicos.get(posmodificar).getAutor());
                    System.out.println("Ingresa el nuevo Autor");
                    listadeperiodicos.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Autor: " + listadeperiodicos.get(posmodificar).getAutor());

                    break;

                case 2:
                    //editorial
                    System.out.println("\n" + "La Editorial es: ");
                    System.out.println("Editorial: " + listadeperiodicos.get(posmodificar).getEditorial());
                    System.out.println("Ingresa la Nueva Editorial");
                    listadeperiodicos.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Editorial: " + listadeperiodicos.get(posmodificar).getEditorial());

                    break;

                case 3:
                    //precio
                    System.out.println("\n" + "El Precio es: ");
                    System.out.println("Precio: " + listadeperiodicos.get(posmodificar).getPrecio());
                    System.out.println("Ingresa el Nuevo Precio");
                    listadeperiodicos.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Precio: " + listadeperiodicos.get(posmodificar).getPrecio());

                    break;

                case 4:
                    //fecha
                    System.out.println("\n" + "La Fecha es: ");
                    System.out.println("Fecha: " + listadeperiodicos.get(posmodificar).getFecha2());
                    System.out.println("Ingresa la Nueva Fecha");
                    listadeperiodicos.get(posmodificar).setFecha2(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Fecha: " + listadeperiodicos.get(posmodificar).getFecha2());

                default:
                    System.out.println("\n" + "Opcion Invalida");
            }
            System.out.println("\n" + "¿Quieres Cambiar Algun Otro Dato? s/n");
            resp = entrada.next().charAt(0);
        }
    }

    //para grabar el archivo
    //hacer el archivo para guardar la info de los periodicos
    public void grabar() {
        //mandando a llamar a que se cree el archivo
        getObjetoarchivoperiodicos().serializar(listadeperiodicos);
    }

    public ArrayList<Periodico> getListadeperiodicos() {
        return listadeperiodicos;
    }

    public void setListadeperiodicos(ArrayList<Periodico> listadeperiodicos) {
        this.listadeperiodicos = listadeperiodicos;
    }

    public ArchivoP getObjetoarchivoperiodicos() {
        return objetoarchivoperiodicos;
    }

    public void setObjetoarchivoperiodicos(ArchivoP objetoarchivoperiodicos) {
        this.objetoarchivoperiodicos = objetoarchivoperiodicos;
    }

}
