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
public class Materia {

    private int codigo;
    private String nombre;
    private int numCreditos;
    private int numHoras;
    private int nivel;
    private Grupo grupo;
    private Profesor profesor;
    
    public Materia(){
        
    }

    public Materia(int codigo, String nombre, int numCreditos, int numHoras, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.numHoras = numHoras;
        this.nivel = nivel;
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

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * metodo regresa un objeto en forma de cadena de texto
     * @return materia
     */
    @Override
    public String toString() {
        return "Materia{ " + "Codigo= " + codigo + ", Nombre= " + nombre + ", Numero de Creditos= " + numCreditos + ", Numero de Horas=" + numHoras
                + ", Nivel= " + nivel + ", Grupo= " + grupo + ", Profesor= " + profesor + '}';
    }

}
