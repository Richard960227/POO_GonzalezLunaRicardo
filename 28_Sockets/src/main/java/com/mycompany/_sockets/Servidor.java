/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._sockets;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author dears
 */
public class Servidor {

    AtenderClientes cte;
    ArrayList<Socket> listaClientes = new ArrayList();

    public Servidor() {
        try {
            //socket unico del servidor
            ServerSocket ss = new ServerSocket(5000);
            Socket cliente;
            //tener en fila a los clientes
            while (true) {
                cliente = ss.accept();
                System.out.println("Conexion exitosa");
                listaClientes.add(cliente);
                cte = new AtenderClientes(listaClientes, cliente);
            }
        } catch (Exception e) {
            System.out.println("Eror, servidor caido");
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new Servidor();
    }
}
