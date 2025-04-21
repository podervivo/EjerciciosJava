package b_iteraciones;

public class Ejercicio9 {

	 public static void main(String[] args) {
	        int i = 1;

	        do {
	            if (i % 4 == 0) {
	                i++;
	                continue; // Salta los múltiplos de 4
	            }

	            System.out.println(i);
	            i++;
	        } while (i <= 20);
	    }
	}