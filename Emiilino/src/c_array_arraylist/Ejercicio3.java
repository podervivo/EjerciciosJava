package c_array_arraylist;

import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.5);
        numeros.add(30.5);
        numeros.add(40.5);
        numeros.add(50.5);

        double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

        double promedio = suma / numeros.size();

        System.out.println("El promedio es: " + promedio);
    }
}