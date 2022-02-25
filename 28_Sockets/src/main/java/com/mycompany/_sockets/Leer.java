/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._sockets;

import java.io.*;
import java.net.*;

/**
 *
 * @author dears
 */
public class Leer extends Thread {

    Socket socket;

    Leer(Socket socket) {
//se debe recibir el objeto del socket para indicar que
//se ejecuta el proceso
        this.socket = socket;
        start();
    }

    public void run() {
        try {
            while (true) {
                InputStream aux = socket.getInputStream();
                DataInputStream flujo = new DataInputStream(aux);
                System.out.println("Datos: " + flujo.readUTF());
            }
        } catch (Exception e) {
            System.out.println("Error al Leer");
            System.out.println(e.getMessage());
        }
    }
}
