package b_iteraciones;

import java.util.Scanner;

public class Ejercicio4 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int mayor = Integer.MIN_VALUE;

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Ingrese el número " + i + ": ");
	            int numero = scanner.nextInt();

	            if (numero > mayor) {
	                mayor = numero;
	            }
	        }

	        System.out.println("El mayor de los 5 números ingresados es: " + mayor);

	        scanner.close();
	    }
	}