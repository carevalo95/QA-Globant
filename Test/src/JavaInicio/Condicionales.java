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
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Que triste que no hayas disfrutado la peli");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantástico");
                    break;
//El equivalente a *De otro modo* es *default*
//default:
//<acciones>                    
            }
        } else if (opinion < 0) {
            System.out.println("Tu opinión fue negativa");

        } else if (opinion == 0) {
            System.out.println("El valor de la calificación debe ser entre 1 y 5");
        } else {
            System.out.println("Valor ingresado es incorrecto");
        }
        System.out.println("Hasta luego");
    }
}
