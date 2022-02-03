/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13_ventana;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author dears
 */
public class Usuarios {
    
    public void Grabar(String cadena){
        
        try{
            FileWriter usuario = new FileWriter("Usuarios.txt", true);
            try(BufferedWriter almacen = new BufferedWriter(usuario)){
            usuario.write(cadena + "\n");
            usuario.close();
            }
            usuario.close();
        }catch(Exception ex){}
    }
    
}
