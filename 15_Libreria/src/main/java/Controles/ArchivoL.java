/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

/**
 *
 * @author dears
 */

import Documentos.CLibro;
import java.util.*;
import java.io.*;

//implementr la seializacion de los archivos
class ArchivoL implements Serializable {
    
    /*
    vamos a crear el objeto que vamos a serializar
    de la lista de los libros
    */
    
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    
    //metodo para generar la lectura del archivo
    
    public ArrayList<CLibro> leer(){
        try{
            //primero tenemos que crear la lectura del buffer de objetos
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Se origino: " + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    //el metodo que serializa
    
    void serializar(ArrayList<CLibro> listaserializada){
        try{
            //generar el archivo de salida
            FileOutputStream out = new FileOutputStream("libro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            
            //ya que tenemos la generacion de la salidada la escribimos
            
            objout.writeObject(listaserializada);
            
            objout.close();
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Se origino: " + e.getStackTrace());
        }
    }
}
