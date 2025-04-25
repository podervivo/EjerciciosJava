package c7ej2;

import java.util.ArrayList;

public class AgenciaAlquiler {
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Auto> autos;

    public AgenciaAlquiler(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public double alquilarAuto(String patente, int dias) {
        for (Auto auto : autos) {
            if (auto.getPatente().equalsIgnoreCase(patente) && auto.isDisponible()) {
                auto.alquilar();
                return auto.calcularPrecio(dias);
            }
        }
        return -1; // auto no disponible o no encontrado
    }

    public boolean devolverAuto(String patente) {
        for (Auto auto : autos) {
            if (auto.getPatente().equalsIgnoreCase(patente) && !auto.isDisponible()) {
                auto.devolver();
                return true;
            }
        }
        return false; // auto no encontrado o ya disponible
    }

    public void mostrarAutos() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}

