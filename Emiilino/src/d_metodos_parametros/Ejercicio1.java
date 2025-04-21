package d_metodos_parametros;

import java.util.Scanner;

public class Ejercicio1 {

	 public static int contarPalabras(String texto) {
	        if (texto == null || texto.trim().isEmpty()) {
	            return 0;
	        }

	        // Divide el texto por espacios en blanco (uno o más)
	        String[] palabras = texto.trim().split("\\s+");
	        return palabras.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese una frase:");
	        String entrada = scanner.nextLine();

	        int cantidad = contarPalabras(entrada);
	        System.out.println("Número de palabras: " + cantidad);

	        scanner.close();
	    }
	}