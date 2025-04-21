package a_datosPrimitivosyCondicionales;
import java.util.Scanner;

	public class Ejercicio2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        int numero = scanner.nextInt();
	        scanner.close();

	        
	        if (numero % 2 == 0) {
	            System.out.print("El número es par");
	        } else {
	            System.out.print("El número es impar");
	        }

	        
	        if (numero > 0) {
	            System.out.println(" y positivo.");
	        } else if (numero < 0) {
	            System.out.println(" y negativo.");
	        } else {
	            System.out.println(" y es cero.");
	        }
	    }
	}
