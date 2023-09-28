/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Juan
 */
public class Joven extends Integrante{
    protected boolean haceDeporte, trabaja;
    protected String estudia, deQueTrabaja;

    public Joven() {
    }

    public Joven(boolean haceDeporte, boolean trabaja, String estudia, String deQueTrabaja, Integer numOrden, Persona vinculo, ProblemaDeSalud probDeSalud, AbordajeNutricional abordajeNut, boolean tieneProbSalud, boolean tieneAbordajeNut, String nombre, String apellido, String sexo, Date fechaNacimiento, Integer dni) {
        super(numOrden, vinculo, probDeSalud, abordajeNut, tieneProbSalud, tieneAbordajeNut, nombre, apellido, sexo, fechaNacimiento, dni);
        this.estudia = estudia;
        this.haceDeporte = haceDeporte;
        this.trabaja = trabaja;
        this.deQueTrabaja = deQueTrabaja;
    }

    public String Estudia() {
        return estudia;
    }

    public void setEstudia(String estudia) {
        this.estudia = estudia;
    }

    public boolean isHaceDeporte() {
        return haceDeporte;
    }

    public void setHaceDeporte(boolean haceDeporte) {
        this.haceDeporte = haceDeporte;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    public String getDeQueTrabaja() {
        return deQueTrabaja;
    }

    public void setDeQueTrabaja(String deQueTrabaja) {
        this.deQueTrabaja = deQueTrabaja;
    }

    @Override
    public String toString() {
        return super.toString() + ", estudia=" + estudia + ", haceDeporte=" + haceDeporte + ", trabaja=" + trabaja + ", deQueTrabaja=" + deQueTrabaja + '}';
    }
    
    
    
}
