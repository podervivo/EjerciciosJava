package c6ej2;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private List<Double> calificaciones;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    // Método para agregar una calificación
    public void agregarCalificacion(double nota) {
        calificaciones.add(nota);
    }

    // Método 1: Calcular promedio con for tradicional
    public double calcularPromedio1() {
        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        return calificaciones.isEmpty() ? 0 : suma / calificaciones.size();
    }

    // Método 2: Calcular promedio con for-each
    public double calcularPromedio2() {
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return calificaciones.isEmpty() ? 0 : suma / calificaciones.size();
    }

    // Método opcional para mostrar info del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificaciones: " + calificaciones);
    }
}