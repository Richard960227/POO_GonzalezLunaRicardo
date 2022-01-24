/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroHilos;

/**
 *
 * @author dears
 */
public class Cliente {
    
    private String Nombre;
    private int[] CarroCompra;
    
    public Cliente(){
        
    }

    public Cliente(String Nombre, int[] CarroCompra) {
        super();
        this.Nombre = Nombre;
        this.CarroCompra = CarroCompra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int[] getCarroCompra() {
        return CarroCompra;
    }

    public void setCarroCompra(int[] CarroCompra) {
        this.CarroCompra = CarroCompra;
    }
    
    
    
}
