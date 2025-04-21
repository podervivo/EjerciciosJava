package a_datosPrimitivosyCondicionales;
import java.util.Scanner;

	
public class Ejercicio5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa tu renta anual en euros: ");
	        double renta = scanner.nextDouble();
	        scanner.close();

	        double impuesto;
	        double tasa;

	        if (renta < 10000) {
	            tasa = 0.05;
	        } else if (renta < 20000) {
	            tasa = 0.15;
	        } else if (renta < 35000) {
	            tasa = 0.20;
	        } else if (renta < 60000) {
	            tasa = 0.30;
	        } else {
	            tasa = 0.45;
	        }

	        impuesto = renta * tasa;

	        System.out.println("Tu tipo impositivo es del " + (tasa * 100) + "%.");
	        System.out.println("Debes pagar " + impuesto + "€ en impuestos.");
	    }
	}
