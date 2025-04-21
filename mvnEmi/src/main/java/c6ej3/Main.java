package c6ej3;

public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("Tech Solutions");

        Empleado e1 = new Empleado("Ana", 50000);
        Empleado e2 = new Empleado("Luis", 60000);
        Empleado e3 = new Empleado("Carla", 55000);

        miEmpresa.agregarEmpleado(e1);
        miEmpresa.agregarEmpleado(e2);
        miEmpresa.agregarEmpleado(e3);

        miEmpresa.mostrarEmpleados();

        double promedio = miEmpresa.calcularSalarioPromedio();
        System.out.println("Salario promedio: $" + promedio);
    }
}

