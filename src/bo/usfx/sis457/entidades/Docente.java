/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Docente extends Persona {
    private String Titulo;
    private int AñosExperiencia;
    private String Asignaturas[];
    
    
    
 
    public Docente(String titulo, int añosExperiencia,  String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.AñosExperiencia = añosExperiencia;
        this.Titulo = titulo;
        
    }

    public Docente(String titulo, int añosExperiencia, String[] asignaturas) {
        this.Titulo = titulo;
        this.AñosExperiencia = añosExperiencia;
        this.Asignaturas = asignaturas;
    }

    

    public Docente() {
        
    }

    
    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return this.Titulo;
    }

    /**
     * @param titulo the Titulo to set
     */
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    /**
     * @return the AñosExperiencia
     */
    public int getAñosExperiencia() {
        return this.AñosExperiencia;
    }

    /**
     * @param añosExperiencia the AñosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.AñosExperiencia = añosExperiencia;
    }

    /**
     * @return the Asignaturas
     */
    public String[] getAsignaturas() {
        return this.Asignaturas;
    }

    /**
     * @param asignaturas the Asignaturas to set
     */
    public void setAsignaturas(String[] asignaturas) {
        this.Asignaturas = asignaturas;
    }
    

    @Override
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Experiencia=" + this.AñosExperiencia + ", Titulo=" + getTitulo()+
                
                '}';
    }

}
