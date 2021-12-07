/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dears
 */
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        final int PUNTACION_SUPERAR = 3;
        final int NUMERO_ERRORES = 6;

        // Variables y Arrays

        String jugadores[] = new String[2];
        int puntos[] = new int[2];
        int turno = 0;
        String palabraElegida;
        String pista;
        char abecedario[] = generaCaracteres();
        boolean caracteresInsertados[] = new boolean[26];
        int numeroErrores = NUMERO_ERRORES;
        String palabraAdivinar;
        String palabraUsuario;

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = pedirString(sn, "Nombre de Jugador: " + (i + 1));
        }

        while (!fin(puntos, PUNTACION_SUPERAR)) {

            palabraElegida = validar(sn, "Escribe Palabra Sin Espacios y Solo Caracteres " + jugadores[turno],
                    "Escribe Palabra Sin Espacios y Solo Letras");

            pista = validar(sn, "Escribe Pista Sin Espacios y Solo Caracteres " + jugadores[turno],
                    "Escribe Pista Sin Espacios y Solo Letras");

            espacios(30);
            palabraAdivinar = rellenaGuiones(palabraElegida);

            while (!palabraCorrecta(palabraElegida, palabraAdivinar) && numeroErrores > 0) {

                System.out.println("Pista: " + pista);
                mostrarPalabra(palabraAdivinar);
                mostrarRepetidos(abecedario, caracteresInsertados);

                palabraUsuario = pedirString(sn, "Escribe una letra, si escribes una palabra sera como una solucion").toLowerCase();

                if (palabraUsuario.length() == 1) {

                    if (Character.isAlphabetic(palabraUsuario.charAt(0))) {

                        if (caracteIntroducido(caracteresInsertados, palabraUsuario.charAt(0))) {
                            System.out.println("Caracter Insetado, Elige Otro");
                        } else if (numRemplazos(palabraElegida, palabraUsuario.charAt(0)) > 0) {
                            palabraAdivinar = remplazar(palabraElegida, palabraAdivinar, palabraUsuario.charAt(0));
                        } else {
                            numeroErrores--;
                            System.out.println("INTENTOS, " + numeroErrores + " Intentos te quedan");
                        }
                        actualizarInsertados(caracteresInsertados, palabraUsuario.charAt(0));
                    }
                } else {
                    if (!palabraCorrecta(palabraElegida, palabraUsuario)) {
                        numeroErrores--;
                        System.out.println("Palabra Incorrecta");
                    } else {
                        palabraAdivinar = palabraUsuario;
                        System.out.println("Correcto, le Atinaste");
                    }
                }
            }

            if (numeroErrores > 0) {
                sumaPuntosOtroJugador(puntos, 1, turno);
                turno = cambiaTurno(turno, jugadores.length - 1);
            } else {
                puntos[turno]++;
            }

            mostrarPuntuaciones(jugadores, puntos);
            actualizarInsertados(caracteresInsertados);
            
            numeroErrores = NUMERO_ERRORES;

        }

        mostrarGanador(puntos, jugadores, PUNTACION_SUPERAR);

        System.out.println("Fin");

    }

    public static String pedirString(Scanner sn, String mensaje) {
        System.out.println(mensaje);
        return sn.next();
    }

    public static char[] generaCaracteres() {
        char[] caracteres = new char[26];
        for (int i = 0, j = 97; i < caracteres.length; i++, j++) {
            caracteres[i] = (char) j;
        }
        return caracteres;
    }

    public static boolean comprobarAlfabeticos(String cadena) {
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (Character.isAlphabetic(caracter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean fin(int puntos[], int puntuacionSuperar) {
        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] >= puntuacionSuperar) {
                return true;
            }
        }
        return false;
    }

    public static String validar(Scanner sn, String mensaje, String mensajeError) {

        String palabra;

        do {
            palabra = pedirString(sn, mensaje).toLowerCase();

            if (comprobarAlfabeticos(palabra) && palabra.length() <= 1) {
                System.out.println(mensajeError);
            }
        } while (!comprobarAlfabeticos(palabra));

        return palabra;
    }

    public static void espacios(int numSaltos) {
        for (int i = 0; i < numSaltos; i++) {
            System.out.println(" ");
        }
    }

    public static String rellenaGuiones(String cadena) {
        String palabra = "";
        for (int i = 0; i < cadena.length(); i++) {
            palabra += "_";
        }
        return palabra;
    }

    public static void mostrarPalabra(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");
        }
        System.out.println("");
    }

    public static boolean palabraCorrecta(String palabraOriginal, String palabraUsuario) {

        return palabraOriginal.equals(palabraUsuario);
    }

    public static void mostrarRepetidos(char[] abecedario, boolean insertados[]) {

        System.out.print("Palabras Repetidas ");
        for (int i = 0; i < insertados.length; i++) {
            if (insertados[i]) {
                System.out.print(abecedario[i]);
            }
        }
        System.out.println(" ");
    }

    public static void sumaPuntosOtroJugador(int[] puntos, int puntosSuperar, int pos_excluida) {

        for (int i = 0; i < puntos.length; i++) {
            if (i != pos_excluida) {
                puntos[i]++;
            }
        }

    }

    public static int numRemplazos(String cadenaOriginal, char caracter) {
        int reemplazos = 0;
        char caracterCadena;
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            caracterCadena = cadenaOriginal.charAt(i);

            if (caracterCadena == caracter) {
                reemplazos++;
            }
        }
        return reemplazos;
    }

    public static String remplazar(String cadenaOriginal, String cadenaRemplazar, char caracter) {
        String cadenaRemplazo = "";
        char caracterCadena;
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            caracterCadena = cadenaOriginal.charAt(i);

            if (caracterCadena == caracter) {
                cadenaRemplazo += caracter;
            } else {
                cadenaRemplazo += cadenaRemplazar.charAt(i);
            }
        }
        return cadenaRemplazo;
    }

    public static boolean caracteIntroducido(boolean[] insertados, char caracter) {
        return insertados[caracter - 'a'];
    }

    public static void actualizarInsertados(boolean[] insertados, char caracter) {
        insertados[caracter - 'a'] = true;
    }

    public static int cambiaTurno(int turnoActual, int limite) {

        if (turnoActual == limite) {
            return 0;
        } else {
            return ++turnoActual;
        }
    }

    public static void mostrarPuntuaciones(String[] jugadores, int[] puntos) {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(jugadores[i] + ": " + puntos[i]);
        }
        System.out.println("");
    }

    public static void mostrarGanador(int[] puntos, String jugadores[], int puntosSuperar) {

        int indiceGanador = 0;
        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] >= puntosSuperar) {
                indiceGanador = i;
                break;
            }
        }
        System.out.println("El Ganador es " + jugadores[indiceGanador]);
    }

    public static void actualizarInsertados(boolean insertados[]){
        for(int i = 0; i < insertados.length; i++){
            insertados[i]=false;
        }
    }
}
