/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class AbordajeNutricional {
    /*
    Los datos que debe guardar esta clase son: N° de orden del
    integrante familiar, edad, peso, Eutrofico (verdadero o falso de si tiene un peso normal), BajoPeso (verdadero o
    falso si tiene menor peso al debido), SobrePeso (verdadero o falso de si tiene un peso por encima),
    */
    protected Integer numOrden, edad;
    protected Double peso;
    protected boolean eutrofico, bajoPeso, sobrePeso;

    public AbordajeNutricional() {
    }

    public AbordajeNutricional(Integer numOrden, Integer edad, Double peso, boolean eutrofico, boolean bajoPeso, boolean sobrePeso) {
        this.numOrden = numOrden;
        this.edad = edad;
        this.peso = peso;
        this.eutrofico = eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrePeso = sobrePeso;
    }
    
    
}
