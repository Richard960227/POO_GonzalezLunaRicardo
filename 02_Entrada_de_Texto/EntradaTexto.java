class EntradaTexto{
    //Cuerpo del Programa

    public static void main(String[]args){

        //Cuerpo del Metodo Principal

        /*
        Vamos a realizar un programa en el cual podamos introducir
        texto a nuestra convenencia
        */
        //Tipo de dato, nombre de la variable
        String nombre;
        //ln el Print es para un salto de linea despues de la impresion en consola
        System.out.println("Porfavor Introduce tu nombre: ");

        nombre = System.console().readLine();

        System.out.println("Hola, " +nombre+ " Bienvenido a tu segundo programa");
    }
}