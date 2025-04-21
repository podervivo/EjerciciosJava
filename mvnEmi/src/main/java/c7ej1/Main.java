package c7ej1;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("ElectroWorld", "Av. Siempre Viva 123", "555-1234");

        tienda.agregarProducto(new Producto("Televisor", "Electrónica", 120000, 10));
        tienda.agregarProducto(new Producto("Notebook", "Computación", 200000, 5));
        tienda.agregarProducto(new Producto("Auriculares", "Audio", 15000, 20));

        tienda.mostrarInventario();

        System.out.println("\nStock de 'Notebook': " + tienda.consultarStock("Notebook"));

        double totalVenta = tienda.realizarVenta("Notebook", 2);
        if (totalVenta != -1) {
            System.out.println("Venta realizada. Total a pagar: $" + totalVenta);
        }

        System.out.println("\nStock actualizado de 'Notebook': " + tienda.consultarStock("Notebook"));
    }
}
