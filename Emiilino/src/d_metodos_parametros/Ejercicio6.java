package d_metodos_parametros;

public class Ejercicio6 {

	public static int sumarDigitos(int numero) {
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;  // Obtiene el último dígito
            numero = numero / 10; // Quita el último dígito
        }

        return suma;
    }

    public static void main(String[] args) {
        int numero = 1990;
        int resultado = sumarDigitos(numero);
        System.out.println("La suma de los dígitos es: " + resultado);
    }
}
