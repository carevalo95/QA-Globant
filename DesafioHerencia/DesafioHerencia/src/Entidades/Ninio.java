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
public class Ninio extends Integrante{

    public Ninio() {
    }

    public Ninio(Integer numOrden, Persona vinculo, ProblemaDeSalud probDeSalud, AbordajeNutricional abordajeNut, boolean tieneProbSalud, boolean tieneAbordajeNut, String nombre, String apellido, String sexo, Date fechaNacimiento, Integer dni) {
        super(numOrden, vinculo, probDeSalud, abordajeNut, tieneProbSalud, tieneAbordajeNut, nombre, apellido, sexo, fechaNacimiento, dni);
    }

    
}
