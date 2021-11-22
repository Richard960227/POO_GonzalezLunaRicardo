


public class Principal {


    public static void main(String[] args) {

        //gracias al constructor poder hacer las instancias de las clases
        Perro dog = new Perro("Pulgas", "de la calle", "Croquetas dogcaut", 1, 'M', "hace guau guau");
        Gato cat = new Gato("Michi", "de colores", "Wiscas", 2, 'F', 7);
        Hamster hamster = new Hamster("Hamtaro", "ruso", "tofu", 1, 'M', "estira y bosteza");
        Huron huron = new Huron("Buck", "Arlequin", "bayas", 4, 'F',"comparte momentos de ocio");


        // vamos a mostrar los datos del perro y del gator
        dog.mostrarPerro();
        cat.mostrarGato();
        hamster.mostrarHamster();
        huron.mostrarHuron();

        /*
         * Quiero que se imprima el sexo de los animales
         * Quiero que agreguen la clase hamster
         * quiero una clase mas de otro animal domestico
         * 
         */
    }
}