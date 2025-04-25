package c7ej3;

public class Cita {
    private String pacienteDni;
    private String medicoDni;
    private String fecha;

    public Cita(String pacienteDni, String medicoDni, String fecha) {
        this.pacienteDni = pacienteDni;
        this.medicoDni = medicoDni;
        this.fecha = fecha;
    }

    public String getMedicoDni() {
        return medicoDni;
    }

    public String getPacienteDni() {
        return pacienteDni;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Cita: Paciente DNI " + pacienteDni + " con Médico DNI " + medicoDni + " en " + fecha;
    }
}

