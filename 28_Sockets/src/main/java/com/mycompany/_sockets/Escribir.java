/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._sockets;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author dears
 */
public class Escribir extends Thread {

    Socket socket;
    String nombre;
    Scanner entrada;

    Escribir(Socket socket, String nombre) {
        /*
Recibe objeto tipo socket
para identificar el socket que se esta ejecutando
en el proceso entre el cliente y el servidor
         */
        entrada = new Scanner(System.in);
        this.socket = socket;
        this.nombre = nombre;

//inicializa
        start();
        //al metodo run

    }

    public void run() {
        try {
            boolean terminar = false;
            String mensaje;

            while (!terminar) {
                OutputStream os = socket.getOutputStream();
                DataOutputStream flujoDOS = new DataOutputStream(os);
                System.out.println("Escribe tu mensaje" + nombre + "");
                mensaje = entrada.nextLine();
//un bucle para ingresar toda las palabras
                if (mensaje.equals("salir")) {
                    terminar = true;
                } else {
//escribir el flujo de datos de salida
                    flujoDOS.writeUTF(nombre + " dice: " + mensaje);
                }
            }
//se cierra el socket
            socket.close();
        } catch (Exception e) {
            System.out.println("Error al Conectar");
            System.out.println(e.getMessage());
        }
    }
}
