/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Servicios.ServiciosPersona;
import java.util.Date;

/**
 *
 * @author 57312
 */
public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public boolean menorQue(int edad) {
        ServiciosPersona sp = new ServiciosPersona();
        boolean menor = false;
        int diferencia = sp.calcularEdad(this) - edad;
        if (diferencia < 0) {
            menor = true;
        }
        return menor;
    }

}
