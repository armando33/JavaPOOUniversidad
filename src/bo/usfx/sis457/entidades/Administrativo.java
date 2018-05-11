/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Marcelo
 */
public class Administrativo extends Persona {
    
    private String Cargo;
    private String LugarTrabajo;
    private Calendar FechaIngreso;

    public Administrativo(String cargo, String lugarTrabajo, Calendar fechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.LugarTrabajo = lugarTrabajo;
        this.FechaIngreso = fechaIngreso;
    }

    
    
    
    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param cargo the Cargo to set
     */
    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    /**
     * @return the LugarTrabajo
     */
    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    /**
     * @param lugarTrabajo the LugarTrabajo to set
     */
    public void setLugarTrabajo(String lugarTrabajo) {
        this.LugarTrabajo = lugarTrabajo;
    }

    /**
     * @return the FechaIngreso
     */
    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param fechaIngreso the FechaIngreso to set
     */
    public void setFechaIngreso(Calendar fechaIngreso) {
        this.FechaIngreso = fechaIngreso;
    }
    
    
    
}
