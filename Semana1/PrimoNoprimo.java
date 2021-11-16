//coment
/*
*Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no. 
*/

import java.util.Scanner;

public class PrimoNoprimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador, i, numero;

        System.out.print("Ingresa un numero: ");
        numero = entrada.nextInt();

        contador = 0;

        for (i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println("El Numero es Primo");
        } else {
            System.out.println("El Numero No es Primo");
        }
    }
}
