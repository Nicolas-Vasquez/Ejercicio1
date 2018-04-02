package ejercicio1;

/**
 * @author Nicolás Vasquez
 */
public class Bebida extends Producto {

    private float contenido;

    public Bebida(String nombre, float contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public float getContenido() {
        return contenido;
    }

    public void setContenido(float contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Litros: " + contenido + " /// Precio: $" + this.getPrecio();
    }
}
