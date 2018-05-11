/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import java.util.Calendar;

/**
 *
 * @author armando
 */
public class DocenteContrato extends Docente{
    
    private String NumeroContrato;

    public DocenteContrato(String NumeroContrato, String titulo, int añosExperiencia, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, carnetIdentidad, nombre, fechaNacimiento);
        this.NumeroContrato = NumeroContrato;
    }

    public DocenteContrato(String NumeroContrato, String titulo, int añosExperiencia, String[] asignaturas) {
        super(titulo, añosExperiencia, asignaturas);
        this.NumeroContrato = NumeroContrato;
    }

    public DocenteContrato(String NumeroContrato) {
        this.NumeroContrato = NumeroContrato;
    }
    
    
    
    
}
