//coment
/*
Realice un algoritmo que calcule el monto a pagar por el servicio de estacionamiento, teniendo en cuenta que por la primera hora de estadía se tiene una tarifa de 10 pesos   y las restantes tienen un costo de 60 pesos Se tiene como datos: hora de entrada, hora de salida (formato militar), iniciada una hora se contabiliza como hora total. 
*/

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definir hora_entrada,hora_salida,minuto_entrada,minuto_salida,total_horas
        // Como Entero
        // Definir monto Como Real
        int horaentrada, horasalida, minutoentrada, minutosalida, totalhoras, monto;

        /*
         * Escribir "Ingresa la hora de Entrada" Leer hora_entrada Escribir
         * "Ingresa los minutos de Entrada" Leer minuto_entrada Escribir
         * "Ingresa la hora de Salida" Leer hora_salida Escribir
         * "Ingresa los minutos de Salida" Leer minuto_salida
         */
        System.out.println("Ingresa Hora de Entrada: ");
        horaentrada = entrada.nextInt();
        System.out.println("Ingresa Minutos de Entrada: ");
        minutoentrada = entrada.nextInt();
        System.out.println("Ingresa Hora de Salida: ");
        horasalida = entrada.nextInt();
        System.out.println("Ingresa Minutos de Salida: ");
        minutosalida = entrada.nextInt();

        if (horaentrada > 24 || horasalida > 24 || minutoentrada > 60 || minutosalida > 60) {
            System.out.println("La Hora es Incorrecta");
        } else {
            if (horaentrada > horasalida) {
                System.out.println("Ingresa la Hora de Salida Correctamente");
            } else {
                if (horaentrada == horasalida) {
                    if (minutosalida > minutoentrada) {
                        totalhoras = 1;
                        monto = 10;
                    } else {
                        System.out.println("Ingresa la Hora de Salida Correctamente");
                    }
                } else {
                    totalhoras = horasalida - horaentrada;
                    // teniendo en cuenta que por la primera hora de estadía se tiene una tarifa de
                    // 10 pesos y las restantes tienen un costo de 60 pesos
                    if (minutosalida > minutoentrada) {
                        totalhoras = totalhoras + 1;
                        monto = ((totalhoras - 1) * 60) + 10;
                    } else {
                        monto = ((totalhoras - 1) * 60) + 10;
                    }
                    System.out.println("El monto a pagar por " + totalhoras + " horas es: $" + monto);
                }
            }
        }
    }
}
