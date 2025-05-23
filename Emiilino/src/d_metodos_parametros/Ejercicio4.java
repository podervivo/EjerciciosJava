package d_metodos_parametros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

	public static List<Integer> obtenerCuadrados(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        for (Integer numero : numeros) {
            cuadrados.add(numero * numero);
        }
        return cuadrados;
    }

    public static void main(String[] args) {
        // Lista de entrada
        List<Integer> muestra = Arrays.asList(1, 2, 3, 4, 5);
        
        // Llamada al método
        List<Integer> resultado = obtenerCuadrados(muestra);
        
        // Mostrar resultado
        System.out.println("Resultado: " + resultado);
    }
}
