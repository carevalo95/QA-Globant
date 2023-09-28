/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Juan
 */
public class Integrante extends Persona {
    /*
    Numero de orden (Cada integrante tiene un numero de orden)
    Apellido
    Nombre
    Fecha de nacimiento
    DNI
    Sexo
    Vinculo (Si es Madre, Padre, Hijo/a, Abuelo/a).
    */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer numOrden;
    protected Persona vinculo;
    protected ProblemaDeSalud probDeSalud;
    protected AbordajeNutricional abordajeNut;
    protected boolean tieneProbSalud, tieneAbordajeNut;

    public Integrante() {
    }

    public Integrante(Integer numOrden, Persona vinculo, ProblemaDeSalud probDeSalud, AbordajeNutricional abordajeNut, boolean tieneProbSalud, boolean tieneAbordajeNut, String nombre, String apellido, String sexo, Date fechaNacimiento, Integer dni) {
        super(nombre, apellido, sexo, fechaNacimiento, dni);
        this.numOrden = numOrden;
        this.vinculo = vinculo;
        this.probDeSalud = probDeSalud;
        this.abordajeNut = abordajeNut;
        this.tieneProbSalud = tieneProbSalud;
        this.tieneAbordajeNut = tieneAbordajeNut;
    }


    public Integer getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(Integer numOrden) {
        this.numOrden = numOrden;
    }

    public Persona getVinculo() {
        return vinculo;
    }

    public void setVinculo(Persona vinculo) {
        this.vinculo = vinculo;
    }

    public boolean isTieneProbSalud() {
        return tieneProbSalud;
    }

    public void setTieneProbSalud(boolean tieneProbSalud) {
        this.tieneProbSalud = tieneProbSalud;
    }

    public boolean isTieneAbordajeNut() {
        return tieneAbordajeNut;
    }

    public void setTieneAbordajeNut(boolean tieneAbordajeNut) {
        this.tieneAbordajeNut = tieneAbordajeNut;
    }
    
    private void cargarProb(){
        if(this.tieneProbSalud)
            this.probDeSalud = cargarProbSalud();
        
        if(this.tieneAbordajeNut)
            this.abordajeNut = cargarAbordajeNut();
    }
    
    public ProblemaDeSalud cargarProbSalud(){
        System.out.println("Diabetes (s/n):");
        String resDbt = leer.next().toLowerCase();
        System.out.println("Hipertension (s/n)");
        String resHta = leer.next().toLowerCase();
        boolean DBT, HTA;
        DBT = resDbt.equals("s");
        HTA = resHta.equals("s");
        
        return new ProblemaDeSalud(this.numOrden, super.dni, HTA, DBT);
    }
    
    public AbordajeNutricional cargarAbordajeNut(){
        Double imc = super.peso/Math.pow(super.altura,2);
        boolean eutrofico = false, sobrePeso = false , bajoPeso = false;
        if(imc < 18.5){
            bajoPeso = true;
        } if (imc >= 18.5 && imc <= 24.9){
            eutrofico = true;
        } else 
            sobrePeso = true;
        
        return new AbordajeNutricional(this.numOrden, super.dni, super.peso, eutrofico, bajoPeso, sobrePeso);
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "numOrden=" + numOrden + ", vinculo=" + vinculo + '}';
    }
    
    
    
}
