package c7ej3;

import java.util.ArrayList;

public class ConsultorioMedico {
	public String nombre;
    public String direccion;
    public String telefono;
    public ArrayList<Paciente> pacientes;
    public ArrayList<Medico> medicos;
    public ArrayList<Cita> citas;

    public ConsultorioMedico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void registrarCita(String pacienteDni, String medicoDni, String fecha) {
        citas.add(new Cita(pacienteDni, medicoDni, fecha));
    }

    public void listarCitasPorMedico(String medicoDni) {
        System.out.println("Citas del médico DNI " + medicoDni + ":");
        for (Cita cita : citas) {
            if (cita.getMedicoDni().equalsIgnoreCase(medicoDni)) {
                System.out.println(cita);
            }
        }
    }
}

