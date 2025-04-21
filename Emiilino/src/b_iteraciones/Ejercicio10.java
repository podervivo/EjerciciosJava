package b_iteraciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1; // número entre 1 y 10
        int intento;

        System.out.println("Adivina el número del 1 al 10:");

        do {
            System.out.print("Tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
            }

        } while (intento != numeroSecreto);

        scanner.close();
    }
}