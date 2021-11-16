//coment
/*
*Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 *+ 3 + …. + 10. 
*/

import java.util.Scanner;

class SumatoriaEntero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, sumfin, contador = 0, r;

        for (x = 1; x <= 10; x++) {
            r = x;
            contador = r + contador;
        }
        {
            sumfin = contador;
            System.out.println("La Suma Final es: " + sumfin);
        }
    }
}