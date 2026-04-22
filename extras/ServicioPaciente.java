package com.clinica.servicios;

import java.util.ArrayList;
import com.clinica.modelos.Paciente;

public class PacienteService {

    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public ArrayList<Paciente> listarPacientes() {
        return pacientes;
    }

    public Paciente buscarPorId(int id) {
        for (Paciente p : pacientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
