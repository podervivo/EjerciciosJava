package c7ej2;

public class Main {
    public static void main(String[] args) {
        AgenciaAlquiler agencia = new AgenciaAlquiler("Autos Express", "Av. Siempre Viva 123", "123456789");

        Auto auto1 = new Auto("ABC123", 2015, 5000);
        Auto auto2 = new Auto("XYZ789", 2018, 7000);

        agencia.agregarAuto(auto1);
        agencia.agregarAuto(auto2);

        agencia.mostrarAutos();

        System.out.println("\nAlquilando auto ABC123 por 3 días...");
        double monto = agencia.alquilarAuto("ABC123", 3);
        if (monto != -1) {
            System.out.println("Monto total: $" + monto);
        } else {
            System.out.println("Auto no disponible.");
        }

        agencia.mostrarAutos();

        System.out.println("\nDevolviendo auto ABC123...");
        boolean devuelto = agencia.devolverAuto("ABC123");
        if (devuelto) {
            System.out.println("Auto devuelto correctamente.");
        } else {
            System.out.println("Error al devolver el auto.");
        }

        agencia.mostrarAutos();
    }
}
