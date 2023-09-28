/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11clasedate;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 57312
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class POOEJ11ClaseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int dia;
        int mes;
        int anio;
        Date fechaUsuario = new Date();
        Date fechaActual = new Date();
        
        System.out.println("Ingrese el día");
        fechaUsuario.setDate(leer.nextInt());
        System.out.println("Ingrese el mes");
        fechaUsuario.setMonth(leer.nextInt()-1);
        System.out.println("Ingrese el año");
        fechaUsuario.setYear(leer.nextInt()-1900);
        
        
        System.out.println("La fecha ingresada es: "+fechaUsuario);
        
        int diferencia = (fechaActual.getYear())-fechaUsuario.getYear();
        System.out.println("Los años de diferencia entre la fecha actual y la fecha ingresada es: "+diferencia);
    }
    
}
