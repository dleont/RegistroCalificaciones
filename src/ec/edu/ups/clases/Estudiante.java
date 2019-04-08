/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Darwin
 */
public class Estudiante extends Persona {

    private Carrera carrera;

    
    //metodos:constrcutores
    public Estudiante() { 
    }
    
    public Estudiante(int codigo){
        super(codigo);
    }

    public Estudiante(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }
    
    //firma de dato: tipos de datos y orden de los mismos

    public Estudiante( int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        
    }
    
    

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
