package c7ej3;

public class Medico {
    private String dni;
    private String nombre;
    private String especialidad;

    public Medico(String dni, String nombre, String especialidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ", Especialidad: " + especialidad + ")";
    }
}

