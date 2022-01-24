/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroHilos;

/**
 *
 * @author dears
 */


public class CajeraHilo extends Thread{
    
    private String Nombre;
    private Cliente Cliente;
    private long initialTime;
    
    public CajeraHilo(){
        
    }

    public CajeraHilo(String Nombre, Cliente Cliente, long initialTime) {
        super();
        this.Nombre = Nombre;
        this.Cliente = Cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    //el metodo para correr el hilo
    @Override
    public void run(){
        System.out.println("La Cajera: " + this.Nombre
        + " Comienza a Procesar su Compra Cliente: "
        + Cliente.getNombre() + "\n En el Tiempo: "
        + (System.currentTimeMillis() - initialTime) / 1000 + " segundos");
    
        //tenemos que obtener todos los productos del carrito
        
        //recorrer la cantidad de productos
        
        for (int i = 0; i < Cliente.getCarroCompra().length; i++){
            //empezar a definir los tiempos para su proceso de compra
            this.esperarXsegundos(Cliente.getCarroCompra()[i]);
            System.out.println("Procesando el Producto: " + (i+1)
                    + " -> Tiempo: "
                    + (System.currentTimeMillis() - initialTime) / 1000 + " segundos");
            
            System.out.println("La Cajera: " + this.Nombre 
                    + " a terminado de procesar a " + Cliente.getNombre() 
                    + " en el tiempo " 
                    + (System.currentTimeMillis() - initialTime) / 1000 + " segundos");
        }
    }
    
    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos * 1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
