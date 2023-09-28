/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopensamiento;

import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class EjercicioPensamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        int opcion = 0;
        System.out.println("Escriba la palabra o frase que desea transformar sin tildes");
        cadena = sc.nextLine();

        System.out.println("Desea convertirlo a:\n1.Mayúscula \n2.Minúscula");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(cadena.toUpperCase());
                break;
            case 2:
                System.out.println(cadena.toLowerCase());
                break;
        }
    }

}
