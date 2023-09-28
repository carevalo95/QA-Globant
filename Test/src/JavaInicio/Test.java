/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInicio;

import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        char caracter;
        System.out.println("Ingresa un caracter");
        caracter = leer.next().charAt(0);
        System.out.println("Hola, soy " + nombre + " y estoy programando con el caracter " + caracter);

 
    //Detección de errores
    /*public static void main(String[] args) {
        String nombre;
        boolean bandera;
        char color;
    }*/
    }
    


}
