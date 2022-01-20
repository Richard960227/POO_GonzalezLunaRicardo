/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

/**
 *
 * @author dears
 */


public class Tortuga extends Thread {
    
    // metodo para que corra
    
    public void run(){
        for (int i = 0;i < 10; i++){
            System.out.println("Avanza la Tortuga" + i);
            //cuando llegue a 100 se mime
            try{
                sleep(300);//recuerden son milisegundos
            }catch (InterruptedException ex){
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termino Trotuga");
    }
}
