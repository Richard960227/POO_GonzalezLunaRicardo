/*
21 - 40
Obtener los pagos correspondientes a los trabajadores
ingresar el nombre del trabajador
sueldo
tipo de trabajador
*/

import javax.swing.*;
import java.util.*;

public class SueldoEmpleado {
    public int id;
    public String nombre;
    public double num_horas, sueldo_hora;

    public SueldoEmpleado() {
    }

    public SueldoEmpleado(int id, int num_horas, String nombre, double sueldo_hora) {
        this.id = id;
        this.num_horas = num_horas;
        this.nombre = nombre;
        this.sueldo_hora = sueldo_hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(double num_horas) {
        this.num_horas = num_horas;
    }

    public double getSueldo_hora() {
        return sueldo_hora;
    }

    public void setSueldo_hora(double sueldo_hora) {
        this.sueldo_hora = sueldo_hora;
    }

    public void verEmpleado() {
        System.out.println("ID: " + id + " -- NOMBRE: " + nombre + " -- SUELDO HR: " + sueldo_hora + " -- NUMERO HRs: "
                + num_horas + "\n");
        System.out.println();
    }

    public void Menu() {

        int captura_id, captura_num_horas, captura_opcion, posicion_empleados;
        int opcion = 0;
        String captura_nombre, text;
        double captura_sueldo_hora;
        char letra;
        SueldoEmpleado[] arregloEmpleados;
        arregloEmpleados = new SueldoEmpleado[5];
        Scanner leer = new Scanner(System.in);
        posicion_empleados = 0;

        do {
            try {
                text = JOptionPane.showInputDialog("Selecciona la opcion deseada:" + "\n 1.- Agregar nuevo empleado"
                        + "\n 2.- Consultar empleado por ID" + "\n 3.- Consultar todos los empleados"
                        + "\n 4.- Pagar al empleado por ID" + "\n 5.- Salir");
                opcion = Integer.parseInt(text);

                switch (opcion) {
                case 1:
                    if (posicion_empleados < 5) {
                        System.out.println("Nevo Empleado");
                        System.out.print("ID: ");
                        captura_id = leer.nextInt();
                        System.out.print("Nombre del Empleado: ");
                        captura_nombre = leer.next();
                        System.out.print("Numero de Horas: ");
                        captura_num_horas = leer.nextInt();
                        System.out.print("Sueldo por Hora: ");
                        captura_sueldo_hora = leer.nextDouble();

                        arregloEmpleados[posicion_empleados] = new SueldoEmpleado(captura_id, captura_num_horas,
                                captura_nombre, captura_sueldo_hora);
                        posicion_empleados++;
                    } else {
                        System.out.print("Plantilla Completa");
                    }
                    break;

                case 2:
                    System.out.println("Buscar Empleado por ID");
                    System.out.print("ID del Empleado: ");
                    captura_id = leer.nextInt();
                    buscarIdEmpleado(captura_id, arregloEmpleados);
                    break;

                case 3:
                    System.out.println("Informacion de Empleados");
                    for (int i = 0; i < 5; i++) {
                        arregloEmpleados[i].verEmpleado();
                    }
                    break;

                case 4:
                    System.out.println("Mostrar Pago");
                    System.out.print("Selecciona una Opcion:" + "\n 1.- Pago quincenal" + "\n 2.- Pago mensual");
                    captura_opcion = leer.nextInt();
                    if (captura_opcion == 1) {
                        for (int i = 0; i < 5; i++) {
                            double sueldo_quincenal = (arregloEmpleados[i].sueldo_hora * arregloEmpleados[i].num_horas)
                                    * 15.0;
                            System.out.println("El Pago Quincenal de " + arregloEmpleados[i].nombre + " es de: $ "
                                    + sueldo_quincenal + "\n");
                        }

                    } else {
                        for (int i = 0; i < 5; i++) {
                            double sueldo_mensual = (arregloEmpleados[i].sueldo_hora * arregloEmpleados[i].num_horas)
                                    * 30.0;
                            System.out.println("El Pago Mensual de " + arregloEmpleados[i].nombre + " es de: $ "
                                    + sueldo_mensual + "\n");
                        }
                    }

                    break;

                default:
                    System.out.println("Procesando Informacion");
                }

            } catch (Exception e) {
                System.out.println("");
            } finally {
                System.out.println("\u00BFRepetir programa? Si lo desea escriba s");
            }

            letra = leer.next().charAt(0);

        } while (letra == 's' || letra == 'S');

    }

    public static int buscarIdEmpleado(int id, SueldoEmpleado[] empleados) {
        for (int i = 0; i < 5; i++) {
            if (empleados[i].id == id) {
                System.out.println("Nombre de Empleado: \n ");
                empleados[i].verEmpleado();
            }
        }
        return 0;
    }

}