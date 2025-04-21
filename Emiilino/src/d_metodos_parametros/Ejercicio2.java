package d_metodos_parametros;

public class Ejercicio2 {

	public static void imprimirEnReversa(String cadena) {
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println(); // Para que salte de línea al final
    }

    public static void main(String[] args) {
        imprimirEnReversa("Hola mundo"); // Resultado: odnum aloH
    }
}