package d_metodos_parametros;

public class Ejercicio8 {

	public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("\\s+", ""); // Minusculas y sin espacios

        int izquierda = 0;
        int derecha = texto.length() - 1;

        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palabra = "Neuquen";

        if (esPalindromo(palabra)) {
            System.out.println("\"" + palabra + "\" es palíndromo.");
        } else {
            System.out.println("\"" + palabra + "\" no es palíndromo.");
        }
    }
}
