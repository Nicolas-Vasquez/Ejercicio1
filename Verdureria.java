package ejercicio1;

/**
 * @author Nicolás Vasquez
 */
public class Verdureria extends Producto {

    public Verdureria(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: kilo";
    }
}
