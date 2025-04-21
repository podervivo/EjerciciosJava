package c7ej1;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public String nombre;
    public String direccion;
    public String telefono;
    public List<Producto> inventario;

    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public int consultarStock(String nombreProducto) {
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                return p.getStock();
            }
        }
        return -1; 
    }

    public double realizarVenta(String nombreProducto, int cantidad) {
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                if (p.getStock() >= cantidad) {
                    double total = p.getPrecio() * cantidad;
                    p.descontarStock(cantidad);
                    return total;
                } else {
                    System.out.println("No hay suficiente stock de " + nombreProducto);
                    return -1;
                }
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
        return -1;
    }

    public void mostrarInventario() {
        for (Producto p : inventario) {
            System.out.println(p);
        }
    }
}

