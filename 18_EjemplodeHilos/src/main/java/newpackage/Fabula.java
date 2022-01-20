/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author dears
 */
public class Fabula {
    
    public static void main(String[] args){
        
        Tortuga tortugui = new Tortuga();
        Liebre tony = new Liebre();
        
        //inicializar el hilo
        tortugui.start();
        tony.start();
    }
}
