package c_array_arraylist;

import java.util.Arrays;

public class Ejercicio1 {

	 public static void main(String[] args) {
	        int[] numeros = {10, 5, 20, 30, 15};

	        Arrays.sort(numeros); // Ordena el array de menor a mayor

	        int minimo = numeros[0];
	        int maximo = numeros[numeros.length - 1];

	        System.out.println("El número mínimo es: " + minimo);
	        System.out.println("El número máximo es: " + maximo);
	    }
	}