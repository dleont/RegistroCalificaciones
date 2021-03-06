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
public class Carrera {

    private int codigo;
    private String nombre;
    private List<Materia> materias;
    private int numSemestres;
    private int numEstudiantes;
    private String titulo;
    
    public Carrera(){
        
    }

    public Carrera(int codigo, String nombre, int numSemestres, int numEstudiantes, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numSemestres = numSemestres;
        this.numEstudiantes = numEstudiantes;
        this.titulo = titulo;
    }
    
    //metodo agregar materia a las carreras
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getNumSemestres() {
        return numSemestres;
    }

    public void setNumSemestres(int numSemestres) {
        this.numSemestres = numSemestres;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo to String combierte un objeto en cadena de texto
     * @return carrera 
     */
    @Override
    public String toString() {
        return "Carrera{ " + "Codigo= " + codigo + ", Nombre= " + nombre + ", Materias= " + materias + 
                ", Numero de Semestres= " + numSemestres + ", Numero de Estudiantes=" + numEstudiantes + ", Titulo=" + titulo + '}';
    }
    
    

}
