//java
/*
*Desarrolle un algoritmo que permita determinar el área y volumen de un cilindro dado su radio (R) y altura (H). 
*/
import java.util.Scanner;
import java.lang.Math;

class AreaVolumenCilindro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double r, h, area, volumen;

        System.out.println("Introduce el radio: ");
        r = entrada.nextDouble();
        System.out.println("Introduce la altura: ");
        h = entrada.nextDouble();

        area = ((2) * (Math.PI) * (r)) * (h + r);
        volumen = (Math.PI) * Math.pow(r, 2) * h;

        System.out.println("La Area es: " + area + " cm^2");
        System.out.println("El Volumen es: " + volumen + " cm^3");
    }
}