//coment
/*
*Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar. 
*/

import java.util.Scanner;

class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Ingresa un Numero: ");
        n = entrada.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " es un Numero Par.");

        } else {
            System.out.println(n + " es un Numero Impar.");
        }
    }
}