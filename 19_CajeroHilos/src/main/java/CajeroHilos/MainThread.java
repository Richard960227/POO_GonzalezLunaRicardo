/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroHilos;

/**
 *
 * @author dears
 */
public class MainThread {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Michael", new int[]{2, 2, 1, 5, 2});
        Cliente cliente2 = new Cliente("Mario", new int[]{2, 1, 1, 5, 1});
        Cliente cliente3 = new Cliente("Diana", new int[]{8, 1, 1, 7, 3});

        long initialTime = System.currentTimeMillis();

        CajeraHilo cajero1 = new CajeraHilo("Cesar", cliente1, initialTime);
        CajeraHilo cajero2 = new CajeraHilo("Dionisio", cliente2, initialTime);
        CajeraHilo cajero3 = new CajeraHilo("Pancha", cliente2, initialTime);

        cajero1.start();
        cajero2.start();
        cajero3.start();

    }
}
