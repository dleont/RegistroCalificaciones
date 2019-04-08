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
public class Grupo {

    private int codigo;
    private String nombre;
    private int cupo;
    
    public Grupo(){
        
    }

    public Grupo(int codigo, String nombre, int cupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupo = cupo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCupo(int codigo) {
        this.cupo = cupo;
    }

    /**
     * metodo combierte un objeto en cadena de texto
     * @return grupo
     */
    @Override
    public String toString() {
        return "Grupo{ " + "Codigo= " + codigo + ", Nombre= " + nombre + ", Cupo= " + cupo + '}';
    }
 
    
    
    
}
