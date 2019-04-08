package ec.edu.ups.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Darwin
 */
public class Profesor extends Persona{

    private String titulo;
    private double salario;
    private String cargo;
    
    public Profesor(){
        
    }

    public Profesor(int codigo) {
        super(codigo);
    }

    public Profesor(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }

    
   //set's
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //get's
    public String getTitulo() {
        return titulo;
    }

    public double getSalario() {
        return salario;
    }
    
    public double getSalario(int horasTrabajadas, double valorHora) {
        return salario+ (horasTrabajadas *valorHora);
    }
    
    public double getSalario(double comision) {
        return salario+ comision;
    }
    
    
    public String getCargo(){
        return cargo;
    }

   

}
