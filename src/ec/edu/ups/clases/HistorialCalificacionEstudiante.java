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
public class HistorialCalificacionEstudiante {

    private int codigo;
    private int aprovechamiento1;
    private int exmanen1;
    private int aprovechamiento2;
    private int examne2;
    //private Estudiante estudiante;
     
    List<Estudiante>estudiante;
    
    
    public HistorialCalificacionEstudiante(int codigo, Estudiante estudiante){
        List<Estudiante>estudiantes = null;
        
    }
     
    /**
    public void agregarEstudiante(int codigo, Carrera carrera){
      estudiante.add(002, estudiante());
    }**/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAprovechamiento1() {
        return aprovechamiento1;
    }

    public void setAprovechamiento1(int aprovechamiento1) {
        this.aprovechamiento1 = aprovechamiento1;
    }

    public int getExmanen1() {
        return exmanen1;
    }

    public void setExmanen1(int exmanen1) {
        this.exmanen1 = exmanen1;
    }

    public int getAprovechamiento2() {
        return aprovechamiento2;
    }

    public void setAprovechamiento2(int aprovechamiento2) {
        this.aprovechamiento2 = aprovechamiento2;
    }

    public int getExamne2() {
        return examne2;
    }

    public void setExamne2(int examne2) {
        this.examne2 = examne2;
    }

   
    
    //crear lista con el metodo agregar... para adanestudiante : materia►notas

}
