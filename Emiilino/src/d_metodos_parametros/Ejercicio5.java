package d_metodos_parametros;

public class Ejercicio5 {

	  public static int contarVocales(String texto) {
	        int contador = 0;
	        texto = texto.toLowerCase(); // Convertimos todo a minúsculas para simplificar

	        for (int i = 0; i < texto.length(); i++) {
	            char c = texto.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                contador++;
	            }
	        }

	        return contador;
	    }

	    public static void main(String[] args) {
	        String frase = "murcielago";
	        int cantidadVocales = contarVocales(frase);
	        System.out.println("Cantidad de vocales: " + cantidadVocales);
	    }
	}