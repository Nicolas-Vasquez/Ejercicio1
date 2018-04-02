package ejercicio1;

/**
 * @author Nicolás Vasquez
 */
public class Perfumeria extends Producto {

    private int contenido;

    public Perfumeria(String nombre, int contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Contenido: " + contenido + "ml /// Precio: $" + this.getPrecio();
    }
}
