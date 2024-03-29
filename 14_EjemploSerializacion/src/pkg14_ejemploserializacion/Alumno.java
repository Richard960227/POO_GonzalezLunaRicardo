/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_ejemploserializacion;

/**
 *
 * @author dears
 */
//herencia
public class Alumno extends Persona {

    private int boleta;

    public Alumno() {
    }

    public Alumno(int boleta) {
        this.boleta = boleta;
    }

    public Alumno(int boleta, String nombre, int edad) {
        super(nombre, edad);
        this.boleta = boleta;
    }

    @Override
    String tipoPersona() {
        return ("Alumno");
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

}
