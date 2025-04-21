package b_iteraciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cantidad = 0;
        int nota;

        System.out.println("Ingrese las notas del alumno (ingrese -1 para finalizar):");

        while (true) {
            System.out.print("Nota: ");
            nota = scanner.nextInt();

            if (nota == -1) {
                break;
            }

            suma += nota;
            cantidad++;
        }

        if (cantidad > 0) {
            double promedio = (double) suma / cantidad;
            System.out.println("El promedio de las notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close();
    }
}