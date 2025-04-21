package c6ej1;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero c1 = new Cuadrilatero(4, 5);
        Cuadrilatero c2 = new Cuadrilatero(3, 3);
        Cuadrilatero c3 = new Cuadrilatero(6, 2);

        // Calcular perímetros y áreas
        double p1 = c1.calcularPerimetro();
        double p2 = c2.calcularPerimetro();
        double p3 = c3.calcularPerimetro();

        double a1 = c1.calcularArea();
        double a2 = c2.calcularArea();
        double a3 = c3.calcularArea();

        // Encontrar el menor perímetro
        double menorPerimetro = Math.min(p1, Math.min(p2, p3));

        // Encontrar la mayor área
        double mayorArea = Math.max(a1, Math.max(a2, a3));

        System.out.println("Menor perímetro: " + menorPerimetro);
        System.out.println("Mayor área: " + mayorArea);
    }
}

