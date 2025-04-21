package a_datosPrimitivosyCondicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una nota (0 a 10): ");
        int nota = scanner.nextInt();
        scanner.close();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println("Nota sobresaliente");
            } else if (nota >= 4) {
                System.out.println("Nota regular");
            } else {
                System.out.println("Desaprobado");
            }
        } else {
            System.out.println("Error: La nota ingresada está fuera de rango.");
        }
    }
}
