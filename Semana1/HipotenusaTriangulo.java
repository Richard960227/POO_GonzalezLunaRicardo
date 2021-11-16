//coment
/*
*Determinar la hipotenusa de un triángulo rectángulo conocidas las longitudes de sus dos catetos. Desarrolle el algoritmo *correspondiente. 
*/

import java.util.Scanner;

class HipotenusaTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cateto1, cateto2;

        System.out.println("Introduce Valor del Cateto 1: ");
        cateto1 = sc.nextDouble();
        System.out.println("Introduce Valor del Cateto 2: ");
        cateto2 = sc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La Hipotenusa es: " + hipotenusa);
    }
}