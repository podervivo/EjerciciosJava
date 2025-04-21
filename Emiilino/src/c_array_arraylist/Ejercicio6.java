package c_array_arraylist;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 2, 5, 2, 6, 2, 3, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroBuscado = scanner.nextInt();

        int contador = 0;

        for (int num : numeros) {
            if (num == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscado + " se repite " + contador + " veces en el vector.");

        scanner.close();
    }
}