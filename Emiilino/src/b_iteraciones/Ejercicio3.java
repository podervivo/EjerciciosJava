package b_iteraciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);

        System.out.println("Cantidad de números positivos ingresados: " + positivos);
        System.out.println("Cantidad de números negativos ingresados: " + negativos);

        scanner.close();
    }
}
