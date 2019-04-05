/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author Darwin
 */
public class Principal {
    
    public static void main(String[] args){
        
        System.out.println("Iniciando programa de Registro de Calificaciones");
        
        Estudiante est = new Estudiante();
        
        //asignamos valores a los atributos de la clase Estudiante y Perosna
        est.setCodigo(1);
        est.setNombre("juan quispe");
        est.setCedula("0106993835");
        est.setDireccion("Baños");
        est.setTelefono("4040706");
        est.setCorreo("jquispe@est.ups.edu.ec");
        //est.setSede(Sede);
        //est.setCarrera(carrera);
        
        //obtenemos el valor para imprimir en consola
        System.out.println("Codigo: "+est.getCodigo());
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Cedula: "+est.getCedula());
        System.out.println("Diireccion: "+est.getDireccion());
        System.out.println("Telefono: "+est.getTelefono());
        System.out.println("Correo: "+est.getCorreo());
        System.out.println("Sede: "+est.getSede());
        //System.out.println("Carrera: "est.getCarrera());
    }
    
}
