package d_metodos_parametros;

public class Ejercicio3 {
	  public static long calcularFactorial(int numero) {
	        long factorial = 1;

	        for (int i = 1; i <= numero; i++) {
	            factorial *= i; // Es igual a factorial = factorial * i
	        }

	        return factorial;
	    }

	    public static void main(String[] args) {
	        int numero = 6;
	        long resultado = calcularFactorial(numero);
	        System.out.println("El factorial de " + numero + " es: " + resultado);
	    }
	}