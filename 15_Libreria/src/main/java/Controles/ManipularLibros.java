/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author dears
 */
//apuntador -> nivel del acceso a la clase, porque esta separada en paquetes
import Documentos.CLibro;
import java.util.*;
import java.io.*;

public class ManipularLibros implements Serializable {

    //vamos a crear un metodo para agregar varios libros
    //los objetos que son capaces de soportar diferentes tipos de dato
    private ArrayList<CLibro> listadelibros;

    //un objeto para el archivo de mis libros;
    private ArchivoL objetoarchivolibros = new ArchivoL();

    /*
    Esta clase u objeto es la que se va a encargar de poder
    crear y leer los archivos del documento de libro
     */

    //vamos a hacer el crud de libros
    //c create, r read, u update, d delete
    public ManipularLibros() {
        //vamos a cargar la instancia de la lista de los libros
        listadelibros = new ArrayList<CLibro>();
        //vamos aplicar una sobrecarga al objeto para mandar
        //a llamar su lectura correspondiente  del archivo creado
        listadelibros = objetoarchivolibros.leer();
    }

    //crud
    public void agregarLibro() {
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        //ciclo para solicitar datos de los libros
        while (resp == 's') {
            //hago un objeto de CLibro y mando a llamar el metodo de los datos
            CLibro objlibro = new CLibro();
            objlibro.aceptarDatos();
            //lo agrego al array
            listadelibros.add(objlibro);
            System.out.println("\n" + "¿Deseas Agregar Otro Libro?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //Conaultar un libro de forma general
    public void consultaGeneral(){
        
        //si hay libros
        //y si la lista esta vacia que hago
        if(listadelibros.isEmpty()){
            System.out.println("\n" + "No Hay Libros Agregados");
        }else{
            //no esta vacia
            System.out.println("\n" + "Los Libros son: \n");
            //recorrer la lista de los libros
            for(int i = 0; i < listadelibros.size(); i++){
                System.out.println("ID del Libro: " + listadelibros.get(i));
                System.out.println("Nombre del Libro: " + listadelibros.get(i).getNombre());
                System.out.println("Autor del Libro: " + listadelibros.get(i).getAutor());
                System.out.println("Editorial del Libro: " + listadelibros.get(i).getEditorial());
                System.out.println("Precio del Libro: " + listadelibros.get(i).getPrecio() + "\n");
            }
        }
    }
    
    //Vamos a realizar una busqueda por nombre
    //sangre y fuego de juego de tronos
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista de los libros
        for(int i = 0; i < listadelibros.size(); i++){
            //busca el nombre del libro
            if(buscarNombre.equalsIgnoreCase(listadelibros.get(i).getNombre())){
                //si lo encuentra
                pos = i;
                existe = true;
            }else if (!existe){
                System.out.println("\n" + "Libro No Encontrado. Favor de Ponerse en Contacto con el Administrador");
            }
        }
        if(!existe){
            //porque esta fuera el arreglo o la lista osea no existe
            System.out.println("\n" + "No Existe Registro del Libro");
            pos = -1;
        }
        return pos;
    }
    
    //metodo de la busqueda
    //puedo buscar por nombre, editorial, precio
    public int buscar(){
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n" + "Ingresa el Nombre del Libro que Desea Buscar");
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traePosicion(nombreBuscar);
        
        //visualizo los datos
        System.out.println("\n" + "Nombre del Libro: " + listadelibros.get(posbuscar).getNombre());
        System.out.println("Autor del Libro: " + listadelibros.get(posbuscar).getAutor());
        System.out.println("Editorial del Libro: " + listadelibros.get(posbuscar).getEditorial());
        System.out.println("Precio del Libro: " + listadelibros.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
    
    public void borrar(){
        
        Scanner entrada = new Scanner(System.in);
        
        String libroborrar;
        int posborrar;
        
        try{
           //verificar que lista de libros no este vacia
        if(listadelibros.isEmpty()){
            System.out.println("\n" + "No Hay Libros Registrados");
        }else{
            System.out.println("\n" + "Buscar y Eliminar");
            posborrar = buscar();
            
            if(posborrar < listadelibros.size()){
                //si esta dentro de la lista
                listadelibros.remove(posborrar);
                System.out.println("\n" + "Libro Eliminado");
            }else{
                //esta afuera del rango
                System.out.println("\n" + "Imposible Eliminar ese Registro");
            }
        } 
        }catch (Exception obj){
            System.out.println("");
        }
        
    }
    
    //modificar
    //autor, editorial, precio
    
    public void modificar(){
        
        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        char resp = 's';
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n" + "Ingresa el Nombre del Libro que Deseas Modificar: ");
        modificar = entrada.nextLine();
        
        while (resp == 's'){
            posmodificar = traePosicion(modificar);
            
            //ya se obtuvieron los datos
            System.out.println("\n" + "¿Que Dato Deseas Modificar del Libro?"
                                + "\n 1.- Autor."
                                + "\n 2.- Editorial"
                                + "\n 3.- Precio");
            
            resmod = entrada.nextInt();
            
            switch (resmod) {
                case 1:
                    //autor
                    System.out.println("\n" + "Autor: " + listadelibros.get(posmodificar).getAutor());
                    System.out.println("Ingresa el Nuevo Autor");
                    listadelibros.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Autor: " + listadelibros.get(posmodificar).getAutor());
                    
                    break;
                    
                case 2:
                    //editorial
                    System.out.println("\n" + "Editorial: " + listadelibros.get(posmodificar).getEditorial());
                    System.out.println("Ingresa la Nueva Editorial");
                    listadelibros.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Editorial: " + listadelibros.get(posmodificar).getEditorial());
                    
                    break;
                    
                case 3:
                    //precio
                    System.out.println("\n" + "Precio: " + listadelibros.get(posmodificar).getPrecio());
                    System.out.println("Ingresa el Nuevo Precio");
                    listadelibros.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El Dato a Sido Modificado");
                    System.out.println("Precio: " + listadelibros.get(posmodificar).getPrecio());
                    
                    break;
                    
                default:
                    System.out.println("\n" + "Opcion Invalida");   
            }
            System.out.println("\n" + "¿Quieres Cambiar Algun Otro Dato? s/n");
            resp = entrada.next().charAt(0);
        }
    }
    
    //para grabar el archivo
    //hacer el archivo para guardar la info de los libros
    public void grabar(){
        //mandando a llamar a que se cree el archivo
        getObjetoarchivolibros().serializar(listadelibros);
    }

    public ArrayList<CLibro> getListadelibros() {
        return listadelibros;
    }

    public void setListadelibros(ArrayList<CLibro> listadelibros) {
        this.listadelibros = listadelibros;
    }

    public ArchivoL getObjetoarchivolibros() {
        return objetoarchivolibros;
    }

    public void setObjetoarchivolibros(ArchivoL objetoarchivolibros) {
        this.objetoarchivolibros = objetoarchivolibros;
    }
    
    

}
