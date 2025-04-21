package c6ej2;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lucía", 20);

        estudiante.agregarCalificacion(8.5);
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.5);

        estudiante.mostrarInfo();

        System.out.println("Promedio (método 1): " + estudiante.calcularPromedio1());
        System.out.println("Promedio (método 2): " + estudiante.calcularPromedio2());
    }
}
