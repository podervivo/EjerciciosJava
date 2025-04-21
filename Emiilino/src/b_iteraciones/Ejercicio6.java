package b_iteraciones;

public class Ejercicio6 {

	   public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) {
	            if (i == 7) {
	                System.out.println("Se encontró el número 7. ¡Bucle detenido!");
	                break;
	            }
	            System.out.println("Índice: " + i);
	        }
	    }
	}