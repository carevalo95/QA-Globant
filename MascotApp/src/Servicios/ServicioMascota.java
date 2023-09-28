/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author 57312
 */
public class ServicioMascota {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("Ingrese el nombre de la mascota");
        String nombre = leer.next();
        System.out.println("Ingrese el apodo de la mascota");
        String apodo = leer.next();
        System.out.println("Ingrese el tipo de la mascota");
        String tipo = leer.next();
        System.out.println("Ingrese el color de la mascota");
        String color = leer.next();
        System.out.println("Ingrese la edad de la mascota");
        int edad = leer.nextInt();
        System.out.println("Ingrese la raza de la mascota");
        String raza = leer.next();

        return new Mascota(nombre, apodo, tipo, color, edad, true, raza);

        /*
        Mascota m = new Mascota(nombre, apodo, tipo, color, edad, true, raza);
        return m;
         */
    }

}
