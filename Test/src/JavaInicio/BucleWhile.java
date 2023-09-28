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
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese el valor de la nota");
        num = leer.nextInt();

        while (num < 0 || num > 10) {
            System.out.println("El valor de la nota debe estar entre 0 y 10 \nIngrese la nota");
            num = leer.nextInt();
        }
    }

}
