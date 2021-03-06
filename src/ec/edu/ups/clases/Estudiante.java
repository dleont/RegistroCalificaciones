/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author Darwin
 */
public class Estudiante extends Persona {

    private Carrera carrera;
    List<HistorialCalificacionEstudiante> notas;

    //metodos:constrcutores
    public Estudiante() {
    }

    public Estudiante(int codigo) {
        super(codigo);
    }

    public Estudiante(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    //firma de dato: tipos de datos y orden de los mismos
    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);

    }

    //metodo agrgar notas al estufiste
    public void agregarCalificacionEst(HistorialCalificacionEstudiante nota) {
        notas.add(nota);
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
