package c7ej3;

public class Paciente {
    private String dni;
    private String nombre;
    private int edad;

    public Paciente(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ", Edad: " + edad + ")";
    }
}

