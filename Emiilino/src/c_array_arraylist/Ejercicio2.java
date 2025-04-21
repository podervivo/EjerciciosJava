package c_array_arraylist;

public class Ejercicio2 {

	public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int suma = 0;
        int multiplicacion = 1;

        for (int numero : numeros) {
            suma += numero;
            multiplicacion *= numero;
        }

        System.out.println("Suma de los elementos: " + suma);
        System.out.println("Multiplicación de los elementos: " + multiplicacion);
    }
}