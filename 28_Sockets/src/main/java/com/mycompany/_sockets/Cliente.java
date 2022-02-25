/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._sockets;

import java.io.*;
import java.util.*;
import java.net.*;

/**
 *
 * @author dears
 */
public class Cliente {

    Scanner entrada = new Scanner(System.in);

    Cliente() {
        try {
            Socket skcliente = new Socket("10.125.21.135",5000);
            System.out.println("Introduce Nombre: ");
            String nombre = entrada.next();
//se debe de crear un hilo que atienda las peticiones del cliente
            Escribir hilo1 = new Escribir(skcliente, nombre);
//se envia el hilo que escribe el nombre del cliente
//debo de leer
            Leer hilo2 = new Leer(skcliente);
        } catch (Exception e) {
            System.out.println("Error de Comunicación");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
