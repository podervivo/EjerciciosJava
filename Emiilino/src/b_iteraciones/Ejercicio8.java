package b_iteraciones;

public class Ejercicio8 {

	public static void main(String[] args) {
        int suma = 0;
        int numero = 1;

        while (true) {
            if (suma + numero > 20) {
                break;
            }

            suma += numero;
            numero++;
        }

        System.out.println("La suma final es: " + suma);
    }
}
