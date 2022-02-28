/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat; //para dar formato a textos

/**
 *
 * @author dears
 */
public class Servidor {
    //id

    private static int uniqueID;

//una lista de clientes
    private ArrayList<ClienteThread> a1;

//para visualizar la fecha
    private SimpleDateFormat fecha;

//definir el puerto de conexion
    private int port;

//saber si el servidor esta corriendo
    private boolean keepgoing;

//tener notificaciones wiii
    private String notificaciones = " *** ";

//constructor del servidor
    public Servidor(int port) {
        this.port = port;
        fecha = new SimpleDateFormat("HH:mm:ss");
        a1 = new ArrayList<ClienteThread>();
    }

//vamos a inicializarlo
    public void start() {
        keepgoing = true;
//hay que crear el socket de conexiones
        try {
            ServerSocket serversocket = new ServerSocket(port);
//que sea infinito para esperar conexiones
            while (keepgoing) {
                display("Servidor Esperando por Client en Puerto: " + port + ".");
//aceptando conexciones
                Socket socket = serversocket.accept();
                if (!keepgoing) {
                    break;
                }
                ClienteThread t = new ClienteThread(socket);
                a1.add(t);
                t.start();
                try {
//cuando se detien el servidor
                    serversocket.close();
                    for (int i = 0; i < a1.size(); ++i) {
                        ClienteThread tc = new ClienteThread(socket);
                        tc.in.close();
                        tc.os.close();
                        tc.socket.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error No se Puede Cerrar el Cliente");
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Nadie te quiere, Solo juguito contigo ");
            System.out.println(e.getMessage());
        }
    }

//detener el servidor
protected void stop(){
keepgoing = false;
try{
new Socket ("localhost", port);
}catch(Exception e){
    System.out.println("No se quiere mudar el server");
    System.out.println(e.getMessage());
}
}

    private void display(String string) {
String tiempo = fecha.format(new Date() +" "+ msg);
        System.out.println(tiempo);
    }

//sincronizar los mensajes

//declarar la calse para que ya no mas error
    class ClienteThread extends Thread {

        Socket socket;
        ObjectInputStream in;
        ObjectOutputStream os;
        int id;
        String username;
//objeto para los ChatMessage
        ChatMessage cm;
        String dato;

//constructor
        public ClienteThread(Socket socket) {
            id = ++uniqueID;
            this.socket = socket;
            System.out.println("Creacioon del Hilo de los flujos del input/output");
            try {
                in = new ObjectInputStream(socket.getInputStream());
                os = new ObjectOutputStream(socket.getOutputStream());
                username = (String) in.readObject();
//me faltaria saber si se conoce para obtener la notificacion

            } catch (IOException e) {
                System.out.println("Error al Conectar");
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException ce) {
                System.out.println("Error de Clase");
                System.out.println(ce.getMessage());
            }
            dato = new Date().toString() + "\n";
        }

        public String getusername() {
            return username;
        }

        public void setusername(String username) {
            this.username = username;
        }
    }
}
