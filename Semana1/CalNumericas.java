//coment
/*
Desarrolle un algoritmo que permita convertir calificaciones numéricas, según la siguiente tabla: A = 19 y 20, B =16, 17 y 18, C = 13, 14 y 15, D = 10, 11 y 12, E = 1 hasta el 9. Se asume que la nota está comprendida entre 1 y 20. 
*/

import java.util.Scanner;

public class CalNumericas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("A=19 y 20; B =16, 17 y 18, C = 13, 14 y 15, D = 10, 11 y 12, E = 1 hasta el 9");

        System.out.println("Ingresa un Numero entre 1 y 20");
        n = entrada.nextInt();

        while (n > 0 && n > 20) {
            System.out.println("Ingrese un Numero Correcto");
            n = entrada.nextInt();
        }

        if (n <= 9) {
            System.out.println("Tu calificacion es E");
        } else {
            if (n <= 12) {
                System.out.println("Tu calificacion es D");
            } else {
                if (n <= 15) {
                    System.out.println("Tu calificacion es C");
                } else {
                    if (n <= 18) {
                        System.out.println("Tu calificacion es B");
                    } else {
                        System.out.println("Tu calificacion es A");
                    }
                }
            }
        }
    }
}
