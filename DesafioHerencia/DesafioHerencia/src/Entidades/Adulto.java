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
public class Adulto extends Integrante {
    protected boolean estudia, practicaDeporte, empleoFormal, obraSocial;

    public Adulto() {
    }

    public Adulto(boolean estudia, boolean practicaDeporte, boolean empleoFormal, boolean obraSocial, Integer numOrden, Persona vinculo, ProblemaDeSalud probDeSalud, AbordajeNutricional abordajeNut, boolean tieneProbSalud, boolean tieneAbordajeNut, String nombre, String apellido, String sexo, Date fechaNacimiento, Integer dni) {
        super(numOrden, vinculo, probDeSalud, abordajeNut, tieneProbSalud, tieneAbordajeNut, nombre, apellido, sexo, fechaNacimiento, dni);
        this.estudia = estudia;
        this.practicaDeporte = practicaDeporte;
        this.empleoFormal = empleoFormal;
        this.obraSocial = obraSocial;
    }

    public boolean isEstudia() {
        return estudia;
    }

    public void setEstudia(boolean estudia) {
        this.estudia = estudia;
    }

    public boolean isPracticaDeporte() {
        return practicaDeporte;
    }

    public void setPracticaDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    public boolean isEmpleoFormal() {
        return empleoFormal;
    }

    public void setEmpleoFormal(boolean empleoFormal) {
        this.empleoFormal = empleoFormal;
    }

    public boolean isObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return super.toString()+ "Adulto{" + "estudia=" + estudia + ", practicaDeporte=" + practicaDeporte + ", empleoFormal=" + empleoFormal + ", obraSocial=" + obraSocial + '}';
    }   
    
}
