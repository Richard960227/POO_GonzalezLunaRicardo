public class Huron extends Animal {
    /**
     * Aqui deberia de colocar cada atributo 
     * nombre, raza, edad, tipo_alimento, sexo
     */

    String sociable;

    public Huron() {
        // Constructor de la clase
    }

    // sobrecarga para obtener y enviar el ladrido
    public Huron(String nombre, String raza, String tipo_alimento, 
    int edad, char sexo, String sociable) {
        // para poder obtener los atributos por herencia
        // se debe colocar super
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.sociable = sociable;

    }
    // recibir
    public String getSociable() {
        return sociable;
    }

    // enviar
    public void setSociable(String sociable) {
        this.sociable = sociable;
    }

    // metodo para mostra la informacion del Perro
    public void mostrarHuron() {
        System.out.println("El nombre del huron es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Tiene la edad: " + getEdad() + "\n" + "Su sexo es: "
                + getSexo() + "\n" + "Es sociable porque: " + sociable + "\n");
    }
}