/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Alumno extends Persona {
    protected String CarnetUniversitario;
    protected int Semestre;
    private String[] Materias = new String[15];

    public Alumno(String CarnetUniversitario, int Semestre, String[] Materias, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.CarnetUniversitario = CarnetUniversitario;
        this.Semestre = Semestre;
        this.Materias = Materias;
        //System.out.println("Se crea un Alumno");
    }

    
    public Alumno(String carnetUniversitario, int semestre, String[] materias) {
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.Materias = materias;
        //System.out.println("Se crea un Alumno");
    }
    
        
    public String getCarnetUniversitario() {
        return CarnetUniversitario;
    }

    public void setCarnetUniversitario(String carnetUniversitario) {
        this.CarnetUniversitario = carnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        this.Semestre = semestre;
    }
    /**
     * @return the Materias
     */
    public String[] getMaterias() {
        return Materias;
    }

    /**
     * @param materias the Materias to set
     */
    public void setMaterias(String[] materias) {
        this.Materias = materias;
    }

    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", CarnetUniversitario=" + this.CarnetUniversitario 
                + ", Semestre=" + this.Semestre + '}';
    }

    
}
