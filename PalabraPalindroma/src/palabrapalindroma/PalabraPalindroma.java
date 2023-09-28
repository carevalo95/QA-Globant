/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrapalindroma;

import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class PalabraPalindroma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        String palabra = "";
        System.out.println("Escriba la palabra");
        palabra = sc.nextLine();
        //System.out.println(palabra.length());
        String palabra2 = "";
        for (int i = palabra.length(); i > 0; i--) {
            palabra2 += palabra.charAt(i - 1);
        }
        //System.out.println(palabra2);
        if (palabra.equals(palabra2)) {
            System.out.println("La palabra es palíndromo");
        } else {
            System.out.println("La palabra no es palíndromo");
        }
    }
}
