/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej08cadena;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author 57312
 */
public class POOEJ08Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Cadena c = new Cadena();
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        c.setFrase(frase);
        c.setLongitud(frase.length());
        System.out.println(c);

    }

}
