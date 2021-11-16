//coment
/*
*Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. El *algoritmo debe imprimir cual es el mayor y cuál es el menor. Recuerde constatar que los tres valores introducidos por el *teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte la introducción de valores *iguales. 
*/

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        System.out.println("Introduce Primer Numero: ");
        a = entrada.nextInt();
        System.out.println("Introduce Segundo Numero: ");
        b = entrada.nextInt();

        while (a == b) {

            System.out.println("Número Igual, Ingrese un Número Diferente");

            b = entrada.nextInt();
        }

        System.out.println("Introduce Tercer Numero: ");
        c = entrada.nextInt();

        while (c == b || c == a) {
            System.out.println("Número Igual, Ingrese un Número Diferente");

            c = entrada.nextInt();
        }

        if (a > b && a > c) {
            System.out.println("El numero mayor es: " + a);
        }

        else {
            if (b > a && b > c) {
                System.out.println("El numero mayor es: " + b);
            }

            else {
                System.out.println("El numero mayor es: " + c);
            }

            if (a < b && a < c) {
                System.out.println("El numero menor es: " + a);
            }

            else {
                if (b < a && b < c) {
                    System.out.println("El numero menor es: " + b);
                }

                else {
                    System.out.println("El numero menor es: " + c);
                }
            }
        }
    }
}
