package b_iteraciones;

public class Ejercicio7 {

	 public static void main(String[] args) {
	        for (int i = 1; i <= 15; i++) {
	            if (i % 3 == 0) {
	                continue; // Salta esta iteración si el número es divisible por 3
	            }
	            System.out.println(i);
	        }
	    }
	}
