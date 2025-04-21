package c_array_arraylist;

import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Duplicar cada elemento
        for (int i = 0; i < numeros.size(); i++) {
            int duplicado = numeros.get(i) * 2;
            numeros.set(i, duplicado);
        }

        System.out.println("Elementos duplicados: " + numeros);
    }
}