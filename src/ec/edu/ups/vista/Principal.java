/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificacionEstudiante;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author Darwin
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Iniciando programa de Registro de Calificaciones");

        Estudiante est = new Estudiante();
        /**
         * //asignamos valores a los atributos de la clase Estudiante y Perosna
         * est.setCodigo(1); est.setNombre("juan quispe");
         * est.setCedula("0106993835"); est.setDireccion("Baños");
         * est.setTelefono("4040706"); est.setCorreo("jquispe@est.ups.edu.ec");
         * //est.setSede(Sede); //est.setCarrera(carrera);
         *
         * //obtenemos el valor para imprimir en consola
         * System.out.println("Codigo: "+est.getCodigo());
         * System.out.println("Nombre: "+est.getNombre());
         * System.out.println("Cedula: "+est.getCedula());
         * System.out.println("Diireccion: "+est.getDireccion());
         * System.out.println("Telefono: "+est.getTelefono());
         * System.out.println("Correo: "+est.getCorreo());
         * System.out.println("Sede: "+est.getSede());
         * //System.out.println("Carrera: "est.getCarrera());*
         */

        //instanciamos mediante un constructor y no es necesario setiar; asignamos valores directamente
        //(crear constructoren la clase instanciada)
        Sede cuenca = new Sede(1, "Sede Cuenca", "Calle vieja", "777123");

        Carrera computacion = new Carrera(001, "Computacion", 10, 40, "Ing. Ciencias de la computacion");
        Carrera electronica = new Carrera(002, "Electronica", 10, 35, "Ing. Electronico");
        Carrera telematica = new Carrera(003, "Telematica", 10, 40, "Ing. en Telematica");

        //6 materias
        Materia calculoVa = new Materia(004, "Calculo de una Variable", 3, 240, 1);
        Materia mateAvan = new Materia(006, "Matematicas Avanzadas en Ingeniería", 3, 160, 3);
        Materia electro = new Materia(007, "Electronica", 3, 120, 3);
        Materia sistOper = new Materia(8, "Sistemas Operativos", 3, 160, 2);
        Materia ecuaciones = new Materia(9, "Ecaciones Diferenciales", 3, 160, 2);
        Materia prograApli = new Materia(010, "Programacion Aplicada", 3, 240, 3);

        //2 profesores
        Persona profe1 = new Profesor("Ing. en Sistemas", 1500, "profesor", 011, "Andrea Plaza", "0102551448", "09665412872", "El vergel", "pandrea@ups.edu.ec");
        Persona profe2 = new Profesor("Ing. en Telecomunicacion", 1200, "Dir. carrera", 012, "Pedro Songor", "01154851448", "0954871458", "Miraflores", "psongor@ups.edu.ec");

        //4 esttidiantes
        Persona est1 = new Persona(013, "Esteban Barrera", "0105884847", "0963225414", "Baños", "ebarrera@est.ups.edu.ec");
        Persona est2 = new Persona(014, "Cristian Jacome", "0105884557", "0952144875", "Checa", "cjacome@est.ups.edu.ec");
        Persona est3 = new Persona(015, "Brayan Barbecho", "0156998554", "0985215487", "Cuenca", "bbarcbecho@est.ups.edu.ec");
        Persona est4 = new Persona(016, "Esteban Quinde", "0105884847", "0954216598", "Deleg", "equinde@est.ups.edu.ec");

        //2 grupos
        Grupo grup1 = new Grupo(17, "Grupo 1", 40);
        Grupo grup2 = new Grupo(18, "Grupo 2", 35);

        
        // 6 notas 
        HistorialCalificacionEstudiante nota1 = new HistorialCalificacionEstudiante(35, 10, 35, 10, "Sistemas Operativos");
        HistorialCalificacionEstudiante nota2 = new HistorialCalificacionEstudiante(35, 15, 35, 15, "Calculo de una Varible");
        HistorialCalificacionEstudiante nota3 = new HistorialCalificacionEstudiante(30, 10, 30, 10, "Electronica");
        HistorialCalificacionEstudiante nota4 = new HistorialCalificacionEstudiante(30, 10, 30, 10, "Programacion Aplicada");
        HistorialCalificacionEstudiante nota5 = new HistorialCalificacionEstudiante(30, 10, 30, 10, "Ecuaciones Diferenciales");
        HistorialCalificacionEstudiante nota6 = new HistorialCalificacionEstudiante(30, 10, 30, 10, "Matematica Avanzada");
        
        // agregar objetos a los objetos
        cuenca.agregarCarrera(electronica);
        cuenca.agregarCarrera(computacion);
        cuenca.agregarCarrera(telematica);
        
        //asignamos materias a las carreras
        electronica.agregarMateria(electro);
        electronica.agregarMateria(calculoVa);
        
        computacion.agregarMateria(mateAvan);
        computacion.agregarMateria(prograApli);
        
        telematica.agregarMateria(sistOper);
        telematica.agregarMateria(ecuaciones);
        
        
        
        
        System.out.println("Sede Cuenca"+ cuenca);
        
    }

}
