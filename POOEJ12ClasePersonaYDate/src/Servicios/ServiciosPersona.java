/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el día de nacimiento");
        int dia = (leer.nextInt());
        System.out.println("Ingrese el mes de nacimiento");
        int mes = (leer.nextInt() - 1);
        System.out.println("Ingrese el año de nacimiento");
        int anio = (leer.nextInt() - 1900);
        Date fecha = new Date(anio, mes, dia);
        p1.setFechaNacimiento(fecha);
        System.out.println(p1);
        return p1;

    }

    public int calcularEdad(Persona p) {
        Date fechaActual = new Date();
        Date fechaP = p.getFechaNacimiento();
        int anio = fechaActual.getYear() - fechaP.getYear();
        int mes = fechaActual.getMonth() - fechaP.getMonth();
        int dia = fechaActual.getDay() - fechaP.getDay();

        if (mes < 0) {
            anio -= 1;
        } else if (mes == 0 && dia < 0) {
            anio -= 1;
        }
        return anio;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("El nombre de la persona es "+p.getNombre()+" y su fecha de nacimiento es: "+p.getFechaNacimiento());
    }

}
