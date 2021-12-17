/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consola;

/**
 *
 * @author dears
 */
public class Pelicula {
    
    private String Nombre;
    private int Sala;
    private String Horario[];
    private String Tipo;
    private double General;
    private double Estud;
    private double AMayor;
    private double MEdad;
    
    public Pelicula(){
        
    }

    public Pelicula(String Nombre, int Sala, String[] Horario, String Tipo, double General, double Estud, double AMayor, double MEdad) {
        
        this.Nombre = Nombre;
        this.Sala = Sala;
        this.Horario = Horario;
        this.Tipo = Tipo;
        this.General = General;
        this.Estud = Estud;
        this.AMayor = AMayor;
        this.MEdad = MEdad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }

    public String[] getHorario() {
        return Horario;
    }

    public void setHorario(String[] Horario) {
        this.Horario = Horario;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getGeneral() {
        return General;
    }

    public void setGeneral(double General) {
        this.General = General;
    }

    public double getEstud() {
        return Estud;
    }

    public void setEstud(double Estud) {
        this.Estud = Estud;
    }

    public double getAMayor() {
        return AMayor;
    }

    public void setAMayor(double AMayor) {
        this.AMayor = AMayor;
    }

    public double getMEdad() {
        return MEdad;
    }

    public void setMEdad(double MEdad) {
        this.MEdad = MEdad;
    }
    
    

}
