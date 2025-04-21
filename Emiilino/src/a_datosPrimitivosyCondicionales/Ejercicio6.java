package a_datosPrimitivosyCondicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        String categoria;

        if (edad >= 0 && edad <= 12) {
            categoria = "Niño";
        } else if (edad >= 13 && edad <= 17) {
            categoria = "Adolescente";
        } else if (edad >= 18 && edad <= 64) {
            categoria = "Adulto";
        } else if (edad >= 65) {
            categoria = "Adulto mayor";
        } else {
            categoria = "Edad inválida";
        }

        System.out.println("Perteneces a la categoría: " + categoria);
    }
}

