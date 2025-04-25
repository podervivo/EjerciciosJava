package c7ej2;

public class Auto {
    private String patente;
    private int anio;
    private double precioPorDia;
    private boolean disponible;

    public Auto(String patente, int anio, double precioPorDia) {
        this.patente = patente;
        this.anio = anio;
        this.precioPorDia = precioPorDia;
        this.disponible = true; // por defecto está disponible
    }

    public String getPatente() {
        return patente;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void alquilar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public double calcularPrecio(int dias) {
        return precioPorDia * dias;
    }

    @Override
    public String toString() {
        return "Patente: " + patente + ", Año: " + anio + ", Precio por día: " + precioPorDia +
               ", Disponible: " + (disponible ? "Sí" : "No");
    }
}

