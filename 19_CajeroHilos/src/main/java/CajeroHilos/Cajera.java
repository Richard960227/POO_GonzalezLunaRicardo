/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroHilos;

/**
 *
 * @author dears
 */

// objeto el cual deve de tener: nombre, procesocompra,esperarxsegundos


public class Cajera {
    
    private String nombre;
    
    public Cajera(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(Cliente cliente, long timeStamp){
        System.out.println("La Cajera: " + this.nombre
        + " Comienza a Procesar su Compra Cliente: "
        + cliente.getNombre() + "\n En el Tiempo: "
        + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
    
        //tenemos que obtener todos los productos del carrito
        
        //recorrer la cantidad de productos
        
        for (int i = 0; i < cliente.getCarroCompra().length; i++){
            //empezar a definir los tiempos para su proceso de compra
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el Producto: " + (i+1)
                    + " -> Tiempo: "
                    + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
            
            System.out.println("La Cajera: " + this.nombre 
                    + " ha terminado de procesar a " + cliente.getNombre() 
                    + " en el tiempo " 
                    + (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
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
