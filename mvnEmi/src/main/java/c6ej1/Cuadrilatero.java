package c6ej1;

public class Cuadrilatero {
    private double base;
    private double lado;

    // Constructor
    public Cuadrilatero(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return base * lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (base + lado);
    }

    // Getters para acceder desde el main si es necesario
    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }
}
