import java.util.Scanner;

public class Arreglos {

    Scanner entrada = new Scanner(System.in);

    char op, letra;
    int i;
    int[] numeros = new int[10]; // array que contendrá los números leídos por teclado

    public void menu() {
        // menu del programa

        do {

            System.out.println("Arreglos");
            System.out.println("a.- Promedio Positivos y Negativos");
            System.out.println("b.- Promedio de los N\u00fameros");
            System.out.println("c.- Calificaciones");
            System.out.println("d.- Suma de Matriz");
            System.out.println("e.- Palindromo");
            System.out.println("f.- Salir");

            op = entrada.next().charAt(0);

            switch (op) {
            case 'a':
                Arreglo1();
                break;

            case 'b':
                Arreglo2();
                break;

            case 'c':
                Arreglo3();
                break;

            case 'd':
                Arreglo4();
                break;

            case 'e':
                Arreglo5();
                break;

            default:
                System.out.println("Hasta Luego");

            }

            System.out.println("\u00BFDeseas repetir el programa? Si lo desea escriba s");

            letra = entrada.next().charAt(0);

        } while (letra == 's' || letra == 'S');

        // aqui se cierra el do
        System.out.println("Gracias por ver este hermoso programa :3");
    }

    public void Arreglo1() {

        /*
         * Programa que lea por teclado 10 números enteros y los guarde en un array.
         * posteriormente que calcule y muestre el promedio de los valores positivos y
         * de los negativos.
         */
        int pos = 0, neg = 0; // contadores de los números positivos y negativos
        double sumaPos = 0, sumaNeg = 0; // acumuladores para las sumas de positivos y negativos

        // lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("N\u00fameros[" + i + "]= ");
            numeros[i] = entrada.nextInt();
        }

        // recorrer el array para sumar por separado los números positivos
        // y los negativos
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0) { // sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) { // sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }

        // Calcular y mostrar promedios
        if (pos != 0) {
            System.out.println("Promedio de los Valores Positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha Introducido N\u00fameros Positivos");
        }
        if (neg != 0) {
            System.out.println("Promedio de los Valores Negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha Introducido N\u00fameros Negativos");
        }
    }

    public void Arreglo2() {
        /*
         * Elabore un programa que lea 10 números enteros por teclado y los guarde en un
         * array. Calcula y muestre el promedio de los números que estén en las
         * posiciones pares del array.
         */
        double media = 0;

        // lectura de datos y llenar el array
        System.out.println("Lectura de los Elementos del Array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("N\u00fameros[" + i + "]= ");
            numeros[i] = entrada.nextInt();
        }

        // Recorrer el array y calcular la media
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) { // si la posición actual es par
                media = media + numeros[i]; // se suma el valor de esa posición
            }
        }
        // Calcular y mostrar la media
        System.out.println("Promedio de los Valores que se encuentran en Posiciones Pares: " + media / 5);
    }

    public void Arreglo3() {

        /*
         * Realice un programa que permita leer 10 calificaciones de una asignatura los
         * guarde en un array para que muestre: Imprimir todas las calificaciones.
         * Promedio de las calificaciones. La calificación más alta y la más baja. El
         * número de calificaciones superiores al promedio.
         */
        double suma = 0, media;

        // lectura de Calificaciones y llenar el array
        System.out.println("Lectura de Calificaciones del Array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("Calificaci\u00f3n[" + i + "]= ");
            numeros[i] = entrada.nextInt();
        }

        // Sumar todas las notas
        for (i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        // Calcular promedio
        media = suma / numeros.length;

        // Mostrar promedio
        System.out.println("Promedio de Calificaciones: " + media);

        // Mostrar los valores superiores al promedio
        if (media < i) {
            System.out.println("Calificaciones Superiores al Promedio: ");

            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] > media) {
                    System.out.println("Array[" + i + "] Calificaci\u00f3n: " + numeros[i]);
                }
            }
        } else {
            System.out.println("Todas las Calificaciones son Superiores");
        }

        int mayor, menor;
        mayor = menor = numeros[0];

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("La Calificaci\u00f3n Mayor es: " + mayor);
        System.out.println("La Calificaci\u00f3n Menor es: " + menor);
    }

    public void Arreglo4() {

        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];

        // Primer Matriz
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno[i].length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        // Segunda Matriz
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos[i].length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }

        // Sumar
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos[i].length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
            }
        }

        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno[i].length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }

            System.out.println("");
        }

    }

    public void Arreglo5() {

        // Programas una clase que se encargue de verificar si una palabra o una oración
        // es un palíndromo

        Scanner pal = new Scanner(System.in);

        String palabra;
        char[] palindromo;
        int izq, der;

        System.out.println("Ingresa la Palabra");
        palabra = pal.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        palindromo = palabra.toCharArray();
        izq = 0;
        der = palindromo.length - 1;

        while (izq < der) {
            if (palindromo[izq] == palindromo[der]) {
                der--;
                izq++;
            } else {
                System.out.println("La Palabra no es un Palindromo");
                break;
            }
        }
        if (izq == der) {
            System.out.println("La Palabra es un Palindromo");
        }

    }
}
