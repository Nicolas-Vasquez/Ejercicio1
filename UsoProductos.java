package ejercicio1;

import java.util.ArrayList;

/**
 * @author Nicolás Vasquez
 */
public class UsoProductos {

    public ArrayList<Producto> listaProductos = new ArrayList<>();

    public UsoProductos() {

        listaProductos.add(new Bebida("Coca-Cola Zero", 1.5f, 20));
        listaProductos.add(new Bebida("Coca-Cola", 1.5f, 18));
        listaProductos.add(new Perfumeria("Shampoo Sedal", 500, 19));
        listaProductos.add(new Verdureria("Frutilla", 64));
        listaProductos.trimToSize();
    }

    public void ImprimirLista() {
        for (Producto i : listaProductos) {
            System.out.println(i.toString() + "\n");
        }
    }

    public void ImprimirMasCaro() {
        int indcaro = 0;
        for (int i = 1; i < listaProductos.size(); i++) {
            if (listaProductos.get(indcaro).compareTo(listaProductos.get(i)) < 0) {
                indcaro = i;
            }
        }
        System.out.println("\nProducto más caro: " + listaProductos.get(indcaro).getNombre());
    }

    public void ImprimirMasBarato() {
        int indbara = 0;
        for (int i = 1; i < listaProductos.size(); i++) {
            if (listaProductos.get(indbara).compareTo(listaProductos.get(i)) > 0) {
                indbara = i;
            }
        }
        System.out.println("\nProducto más barato: " + listaProductos.get(indbara).getNombre());
    }
}
