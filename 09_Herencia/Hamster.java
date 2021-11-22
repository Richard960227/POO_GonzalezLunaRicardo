public class Hamster extends Animal {
    /**
     * Aqui deberia de colocar cada atributo 
     * nombre, raza, edad, tipo_alimento, sexo
     */

    String mov_corporal;

    public Hamster() {
        // Constructor de la clase
    }

    // sobrecarga para obtener y enviar el ladrido
    public Hamster(String nombre, String raza, String tipo_alimento, 
    int edad, char sexo, String mov_corporal) {
        // para poder obtener los atributos por herencia
        // se debe colocar super
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.mov_corporal = mov_corporal;

    }
    // recibir
    public String getMov_corporal() {
        return mov_corporal;
    }

    // enviar
    public void setMov_corporal(String mov_corporal) {
        this.mov_corporal = mov_corporal;
    }

    // metodo para mostra la informacion del Perro
    public void mostrarHamster() {
        System.out.println("El nombre del hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n" + "Tiene la edad: " + getEdad() + "\n" + "Su sexo es: "
                + getSexo() + "\n" + "Su movimientp corporal es: " + mov_corporal + "\n");
    }
}