package c7ej1;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void descontarStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }

    @Override
    public String toString() {
        return nombre + " - " + categoria + " - $" + precio + " - Stock: " + stock;
    }
}

