/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author DianaArevalo
 */
public class Alumno {
    
    private String nombre;
    private List<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    
    
}
