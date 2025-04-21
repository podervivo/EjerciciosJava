package c_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre que desea eliminar: ");
        String nombre = scanner.nextLine();

        if (listaNombres.contains(nombre)) {
            listaNombres.remove(nombre);
            System.out.println("El nombre \"" + nombre + "\" fue eliminado con éxito.");
        } else {
            System.out.println("El nombre \"" + nombre + "\" no se encuentra en la lista.");
        }

        System.out.println("Lista actualizada: " + listaNombres);

        scanner.close();
    }
}