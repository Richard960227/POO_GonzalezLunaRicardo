
public class Libro {
    private String titulo,autor;
    private int cantidadEjemplares, cantidadPrestados;

    public Libro(){}

    public Libro(String titulo,String autor, int cantidadEjemplares, int cantidadPrestados)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadPrestados = cantidadPrestados;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    public int getCantidadPrestados() {
        return cantidadPrestados;
    }
    public void setCantidadPrestados(int cantidadPrestados){
        this.cantidadPrestados = cantidadPrestados;
    }
    public boolean darPrestamo() {
        boolean prestado=true;
        if(cantidadPrestados<cantidadEjemplares){
            cantidadPrestados++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    public boolean devuelveLibros(){
        boolean devuelto=true;
        if(cantidadPrestados==0){
            devuelto=false;
        }else{
            cantidadPrestados--;
        }
        return devuelto;
    }
}
