package d_metodos_parametros;

public class Ejercicio7 {

	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si tiene algún divisor, no es primo
            }
        }

        return true; // Si no encontró divisores, es primo
    }

    public static void main(String[] args) {
        int numero = 17;
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
}
