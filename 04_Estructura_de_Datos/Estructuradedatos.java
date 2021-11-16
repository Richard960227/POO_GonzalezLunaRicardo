/*
*Vamos a crear un programaque se encargue de realizar las siguientes operaciones

1.-Bono o descuento po edad
2.-Convertir numeros decimales a binarios
3.-Convertir temperaturas Celsius, Kelvine y Rankine
4.-Numero de positivos y negativos
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigos
12.- Diamante de codigo
13.- Calculadora
14.- Salir


*/

import java.util.Scanner;

class Estructuradedatos {

    // Programa 1
    /*
     * EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, AL
     * PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. SI LA EDAD ES MENOR QUE
     * 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS. SI LA RESPUESTA ES
     * AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 45%; EN CASO CONTRARIO, SE LES
     * APLICA UN 25%.
     * 
     * variable edad condiciones
     */

    public static void main(String[] args) {

        // objetos
        Scanner entrada = new Scanner(System.in);
        // Scanner letra = new Scanner(System.in);

        // variables
        int edad, opcion, socio, numbinario, n, i, k, total, numerototal, a, b, figura;
        int positivos = 0;
        int negativos = 0;
        double bono, altura, base, area, perimetro, lado, radio, volumen;
        double factorial = 1;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";
        // Equivalentes a 1 grado
        double celsius = 1.00, fahrenheit = 1.00, kelvin = 1.00, rankine = 1.00, grados = 1.00;
        double ce, fa, ke, ra;

        // cuerpo del programa

        // menu de las opciones de arriba

        try {
            do {

                System.out.println("Bienvenido a tu primer programa de estructuras.");
                System.out.println("Porfavor elija la opci\u00f3n deseada:");
                System.out.println("1.-Descuento por Edad");
                System.out.println("2.-Convertir N\u00famero Decimal a Binario");
                System.out.println("3.-Converisones de Temperatura");
                System.out.println("4.-N\u00fameros Positivos y Negativos");
                System.out.println("5.-Tienda");
                System.out.println("6.-\u00c1rea y Per\u00edmetros");
                System.out.println("7.-Tabla");
                System.out.println("8.-Factorial");
                System.out.println("9.-Dibujos de C\u00f3digo");
                System.out.println("10.-Figura Hueca");
                System.out.println("11.-Patrones de C\u00f3digo");
                System.out.println("12.-Diamante");
                System.out.println("13.-Calculadora");
                System.out.println("14.-Salir");

                // Condicion Switch para el menu

                opcion = entrada.nextInt();

                switch (opcion) {
                case 1:

                    // problema1
                    System.out.println("Ingresa el Bono a Cobrar");
                    bono = entrada.nextDouble();
                    System.out.println("Ingresa la Edad");
                    edad = entrada.nextInt();
                    // La estructura de condiciones
                    // SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%
                    if (edad >= 65) {
                        // proceso
                        bono = bono * .6;
                        System.out.println("Su descuento es del 40%");
                        System.out.println("El total a pagar es de: $" + bono);
                    }
                    /*
                     * SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS.
                     * SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 45%; EN CASO
                     * CONTRARIO, SE LES APLICA UN 25%.
                     */
                    else if (edad <= 21) {
                        System.out.println("Si tus Padres son Socios Ingresa 1; Sino lo son Ingresa 2");
                        socio = entrada.nextInt();

                        switch (socio) {
                        case 1:
                            bono = bono * .55;
                            System.out.println("Su descuento fue del 45%");
                            System.out.println("El total a pagar es de: $" + bono);
                            break;
                        case 2:
                            bono = bono * .75;
                            System.out.println("Su descuento fue del 75%");
                            System.out.println("El total a pagar es de: $" + bono);
                            break;
                        default:
                            // es el caso por defecto osea los demas casos
                            System.out.println("Opci\u00f3n no valida");
                        }
                    } else {
                        System.out.println("Tu edad es de: " + edad);
                        System.out.println("El total a pagar es: $" + bono);
                    }

                    break;

                case 2:

                    System.out.println("Ingrese un N\u00famero Positivo Entero que desee convertir");
                    numbinario = entrada.nextInt();
                    /*
                     * Tengo que comprobar que sea positvo? condicion donde numbinario > 0 entonces
                     * aplico el algoritmo de convertir a binario si no no se puede convertir
                     */

                    if (numbinario > 0) {
                        /*
                         * Como el algoritmo para convertir un numero a decimal en binario aplicar el
                         * numbinario mod 2
                         */
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "No se pudo convertir el n\u00famero, ingrese solo positivos";
                    }
                    System.out.println("El n\u00famero convertido a binario es: " + binario);

                    break;

                case 3: // tarea

                    /**
                     * ELABORA UN PROGRAMA QUE CONVIERTA TEMPERATURA EN GRADOS FAHRENHEIT, EN GRADOS
                     * CELSIUS, KELVINE Y RANKINE ( SE PODRa ELEGIR QUE CONVERSIoN DESEA REALIZAR)
                     */
                    System.out.println("Seleccione la cantidad que desee convertir: ");
                    System.out.println("1. Celsius a Fahrenheit, Kelvin y Rankine");
                    System.out.println("2. Fahrenheit a Celsius, Kelvin y Rankine");
                    System.out.println("3. Kelvin a Celsius, Fahrenheit y Rankine");
                    System.out.println("4. Rankine a Celsius, Fahrenheit y Kelvin");

                    opcion = entrada.nextInt();

                    switch (opcion) {
                    case 1:
                        System.out.println("Ingresa los Grados Centigrados: ");
                        grados = entrada.nextDouble();

                        grados = grados * celsius;
                        // celsius a fahrenheit
                        fa = (grados * 1.8) + 32;

                        // celsius a kelvin
                        ke = grados + 273.15;

                        // celsius a rankine
                        ra = grados * 1.8 + 491.67;

                        System.out.println("La cantidad en Celsius es: " + grados + " \u00B0C; a Fahrenheit son: " + fa
                                + " \u00B0F; a Kelvin son: " + ke + " \u00B0K; a Rankine son: " + ra + " \u00B0R");
                        break;

                    case 2:
                        System.out.println("Ingresa los Grados Fahrenheit: ");
                        grados = entrada.nextDouble();

                        grados = grados * fahrenheit;
                        // fahrenheit a celsius
                        ce = (grados - 32) * (.555555556);

                        // fahrenheit a kelvin
                        ke = (grados - 32) * (.555555556) + 273.15;

                        // farenheit a rankine
                        ra = grados + 459.67;

                        System.out.println("La cantidad en Fahrenheit es: " + grados + " \u00B0F; a Celsius son: " + ce
                                + " \u00B0C; a Kelvin son: " + ke + " \u00B0K; a Rankine son: " + ra + " \u00B0R");
                        break;

                    case 3:
                        System.out.println("Ingresa los Grados Kelvin: ");
                        grados = entrada.nextDouble();

                        grados = grados * kelvin;
                        // kelvin a celsius
                        ce = (grados - 273.15);

                        // kelvin a fahrenheit
                        fa = (grados - 273.15) * (1.8) + 32;

                        // kelvin a rankine
                        ra = grados * 1.8;

                        System.out.println("La cantidad en Kelvin es: " + grados + " \u00B0K; a Celsius son: " + ce
                                + " \u00B0C; a Fahrenheit son: " + fa + " \u00B0F; a Rankine son: " + ra + " \u00B0R");
                        break;

                    case 4:
                        System.out.println("Ingresa los Grados Rankine: ");
                        grados = entrada.nextDouble();

                        grados = grados * rankine;
                        // rankine a celsius
                        ce = (grados - 491.67) * (.555555556);

                        // rankine a fahrenheit
                        fa = (grados - 459.67);

                        // rankine a kelvin
                        ke = grados * .555555556;

                        System.out.println("La cantidad en Rankine es: " + grados + " \u00B0R; a Celsius son: " + ce
                                + " \u00B0C; a Fahrenheit son: " + fa + " \u00B0F; a Kelvin son: " + ke + " \u00B0K");
                        break;

                    default:
                        System.out.println("Opcion  Invalida");
                        break;

                    }
                    break;

                case 4:

                    /*
                     * Un numero positivo y un numero negativo entonces para poder identificar si un
                     * numero positivo o debo de poder diferenciar si es num > 0
                     */

                    System.out.println("\u00BFCu\u00e1ntos n\u00fameros va a Ingresar?");
                    total = entrada.nextInt();

                    do {
                        System.out.println("Inserte el N\u00famero");
                        numerototal = entrada.nextInt();

                        // condicion
                        if (numerototal == 0) {
                            // contar cuantos positivos hubo
                            // vamos a ir acumulando el numero de positivos
                            positivos = positivos + 0;

                        } else {
                            if (numerototal > 0) {
                                positivos = positivos + 1;
                            } else {
                                negativos = negativos + 1;
                            }
                        }

                        // saber el total
                        total = total - 1;

                    } while (total != 0);

                    System.out.println("El Total de Positivos es: " + positivos);
                    System.out.println("El Total de Negativos es: " + negativos);

                    break;

                case 5:
                    System.out.println("\u00BFCu\u00e1ntos elementos vas a ingresar?");
                    total = entrada.nextInt();

                    for (i = 1; i <= total; i++) {
                        System.out.println("Ingresa el Precio del Producto");
                        precios = entrada.nextFloat();
                        System.out.println("Ingresa la Cantidad del Producto");
                        cantidad = entrada.nextInt();

                        resultado = precios * cantidad;
                    }

                    System.out.println("El resultado es: $" + resultado);

                    break;

                case 6: // tarea
                        // ELABORA UN PROGRAMA QUE REALICE A. EL aREA Y PERiMETRO DE UN RECTaNGULO, B.
                        // EL PERiMETRO Y aREA DE UN TRIaNGULO, C. EL VOLUMEN DE UNA ESFERA Y VOLUMEN DE
                        // UN CILINDRO.

                    System.out.println("\u00BFQu\u00e9 Deseas Calcular? 1. \u00c1rea y Per\u00edmetro; 2. Volumen");
                    opcion = entrada.nextInt();

                    switch (opcion) {

                    case 1:

                        System.out.println("Ingrese Altura");
                        altura = entrada.nextDouble();
                        System.out.println("Ingrese Base");
                        base = entrada.nextDouble();

                        System.out.println("Elige una Figura: 1. Rect\u00e1ngulo; 2. Tri\u00e1ngulo Rectangulo");
                        figura = entrada.nextInt();

                        switch (figura) {
                        case 1:
                            area = base * altura;
                            perimetro = 2 * (altura + base);

                            System.out.println("El \u00c1rea es: " + area + " cm^2");
                            System.out.println("El Per\u00edmetro es: " + perimetro + " cm");

                            break;

                        case 2:
                            area = (base * altura) / 2;
                            lado = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
                            perimetro = base + lado + altura;

                            System.out.println("El \u00c1rea es: " + area + " cm^2");
                            System.out.println("El Per\u00edmetro es: " + perimetro + " cm");

                            break;
                        default:
                            System.out.println("Opci\u00f3n  Invalida");
                        }
                        break;

                    case 2:

                        System.out.println("Ingrese Altura");
                        altura = entrada.nextDouble();
                        System.out.println("Ingrese Radio");
                        radio = entrada.nextDouble();

                        System.out.println("Elige una Figura: 1. Esfera; 2. Cilindro");
                        figura = entrada.nextInt();

                        switch (figura) {
                        case 1:

                            volumen = (4 * (Math.PI) * Math.pow(radio, 3)) / 3;
                            System.out.println("El Volumen es: " + volumen + " cm^3");

                            break;

                        case 2:

                            volumen = (Math.PI) * Math.pow(radio, 2) * altura;
                            System.out.println("El Volumen es: " + volumen + " cm^3");

                            break;
                        default:
                            System.out.println("Opci\u00f3n  Invalida");
                        }
                        break;
                    default:
                        System.out.println("Opci\u00f3n  Invalida");
                    }
                    break;

                case 7:
                    for (n = 1; n <= 10; n++) {
                        System.out.println(n + " " + (n * 10) + " " + (n * 100) + " " + (n * 1000));
                    }

                    break;

                case 8: // tarea

                    System.out.println("Introduce un N\u00famero: ");
                    n = entrada.nextInt();
                    for (i = n; i > 0; i--) {
                        factorial = factorial * i;
                    }
                    System.out.println("El Factorial de " + n + " es: " + factorial);

                    break;

                case 9:

                    /*
                     * ESCRIBA UN PROGRAMA QUE LEA EL LADO DE UN CUADRADO Y A CONTINUACIoN LO
                     * IMPRIMA EN FORMA DE ASTERISCOS. SU PROGRAMA DEBERa PODER FUNCIONAR PARA
                     * CUADRADOS DE TODOS TAMAnOS ENTRE 1 Y 20.
                     */

                    System.out.println("Cuadrado M\u00e1gico");
                    System.out.println("Inserta el N\u00famero de Lados");
                    n = entrada.nextInt();

                    if (n >= 1 && n <= 20) {
                        // se puede imprimir
                        // aqui tengo las filas
                        for (i = 1; i <= n; i++) {
                            // columnas
                            for (k = 1; k <= n; k++) {
                                System.out.print("* ");
                            }
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("Error, el rango debe ser entre 1 y 20, intente de nuevo");
                    }

                    break;

                case 10:

                    System.out.println("Cuadrado M\u00e1gico Hueco (Como tu ex as\u00ed dejo tu kokoro)");
                    System.out.println("Inserta el N\u00famero de Lados");
                    n = entrada.nextInt();

                    if (n >= 1 && n <= 20) {
                        // se puede imprimir

                        // Imprima la linea superior
                        for (i = 0; i < n; i++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                        // Lo de enmedio solo quiero las esquinas
                        // aqui tengo las filas
                        for (i = 0; i < n - 2; i++) {
                            System.out.print(" * ");
                            // columnas
                            for (k = 0; k < n - 2; k++) {
                                System.out.print("  ");
                            }
                            System.out.println("    * ");
                        }

                        // Imprimir la linea inferior
                        for (i = 0; i < n; i++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Error, el rango debe ser entre 1 y 20, intente de nuevo");
                    }

                    break;

                case 11: // tarea

                    System.out.println("Cuadrado M\u00e1gico con Espacio Inicial y Final");
                    System.out.println("Inserta el N\u00famero de Columnas");
                    n = entrada.nextInt();

                    if (n >= 1 && n <= 20) {
                        // se puede imprimir

                        // Imprima la linea superior
                        for (i = 0; i < n; i++) {
                            System.out.print(" *");
                        }
                        System.out.println();

                        // Imprimir la linea inferior
                        for (i = 0; i < n; i++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Error, el rango debe ser entre 1 y 20, intente de nuevo");
                    }

                    break;

                case 12: // tarea

                    System.out.println("Elige un N\u00famero");
                    n = entrada.nextInt();

                    for (i = 0; i < n; i++) {// Filas
                        for (k = n - 1 - i; k >= 0; k--) {// Columnas
                            System.out.print(" ");
                        }
                        for (k = 0; k <= i; k++) {// Columnas
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    for (i = 0; i <= n; i++) {// Filas
                        for (k = 0; k <= i + 1; k++) {// Columnas
                            System.out.print(" ");
                        }
                        for (k = n - 2 - i; k >= 0; k--) {// Columnas
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    break;

                case 13:

                    System.out.println("Calculadora maizoro");
                    System.out.println("Ingresar un N\u00famero");
                    a = entrada.nextInt();
                    System.out.println("Ingresar un Segundo N\u00famero");
                    b = entrada.nextInt();
                    System.out.println("Ingresa el tipo de operaci\u00f3n que deseas realizar: (+, -, *, /)");
                    operacion = entrada.next().charAt(0);

                    /*
                     * switch case+ case- case* case/
                     */

                    switch (operacion) {
                    case '+':
                        resultado = a + b;
                        System.out.println("La Suma es de: " + resultado);
                        break;

                    case '-':
                        resultado = a - b;
                        System.out.println("La Resta es de: " + resultado);
                        break;

                    case '*':
                        resultado = a * b;
                        System.out.println("La Multiplicaci\u00f3n es de: " + resultado);
                        break;

                    case '/':

                        if (b != 0) {
                            resultado = a / b;
                            System.out.println("La Divisi\u00f3n es de: " + resultado);
                        } else {
                            System.out.println("No es posible dividir entre 0");
                        }

                    default:
                        System.out.println("Operaci\u00f3n Invalida");
                    }
                    break;
                }
             
                System.out.println("\u00BFDeseas repetir el programa? Si lo desea escriba s");
                /*
                 * para recibir la respuesta debo obtener un caracter s para cuando se reciben
                 * char se utiliza '' para cuando se reciben String se utiliza ""
                 */

                letras = entrada.next().charAt(0);

                // Si el usuario ingresa si solo detecta la s es la posicion del caracter que
                // queremos

            } while (letras == 's');
            // aqui se cierra el do
        } catch (Exception e) {
            System.out.println("No me diste un Valor N\u00famerico");
        } finally {
            System.out.println("Gracias por ver este hermoso programa :3");
        }

    }
}