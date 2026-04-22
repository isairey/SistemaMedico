package com.clinica.servicios;

import java.util.ArrayList;
import com.clinica.modelos.Cita;

public class CitaService {

    private ArrayList<Cita> citas = new ArrayList<>();

    public void agregarCita(Cita c) {
        citas.add(c);
    }

    public ArrayList<Cita> listarCitas() {
        return citas;
    }
}
