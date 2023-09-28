/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Familia {
    /*
    Dirección
    IDE
    N° de lote
    Barrio
    Localidad
    */
    
    protected String direccion, localidad, barrio;
    protected Integer IDE, numLote;
    private ArrayList<Integrante> integrantes;
    private InformacionVivienda infoVivienda;
    private boolean factorRiesgo;
    private ArrayList<Integer> factoresRiesgo;
    private boolean mejora;
    
    public Familia() {
    }

    public Familia(String direccion, String localidad, String barrio, Integer IDE, Integer numLote, ArrayList<Integrante> integrantes, InformacionVivienda infoVivienda, boolean factorRiesgo, ArrayList<Integer> factoresRiesgo) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.barrio = barrio;
        this.IDE = IDE;
        this.numLote = numLote;
        this.integrantes = integrantes;
        this.infoVivienda = infoVivienda;
        this.factorRiesgo = factorRiesgo;
        this.factoresRiesgo = factoresRiesgo;
    }

    public Familia(String direccion, String localidad, String barrio, Integer IDE, Integer numLote, ArrayList<Integrante> integrantes, InformacionVivienda infoVivienda, boolean factorRiesgo, boolean mejora) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.barrio = barrio;
        this.IDE = IDE;
        this.numLote = numLote;
        this.integrantes = integrantes;
        this.infoVivienda = infoVivienda;
        this.factorRiesgo = factorRiesgo;
        this.mejora = mejora;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public InformacionVivienda getInfoVivienda() {
        return infoVivienda;
    }

    public void setInfoVivienda(InformacionVivienda infoVivienda) {
        this.infoVivienda = infoVivienda;
    }

    public boolean isFactorRiesgo() {
        return factorRiesgo;
    }

    public void setFactorRiesgo(boolean factorRiesgo) {
        this.factorRiesgo = factorRiesgo;
    }

    public ArrayList<Integer> getFactoresRiesgo() {
        return factoresRiesgo;
    }

    public void setFactoresRiesgo(ArrayList<Integer> factoresRiesgo) {
        this.factoresRiesgo = factoresRiesgo;
    }

    public boolean isMejora() {
        return mejora;
    }

    public void setMejora(boolean mejora) {
        this.mejora = mejora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getIDE() {
        return IDE;
    }

    public void setIDE(Integer IDE) {
        this.IDE = IDE;
    }

    public Integer getNumLote() {
        return numLote;
    }

    public void setNumLote(Integer numLote) {
        this.numLote = numLote;
    }
    
    
}
