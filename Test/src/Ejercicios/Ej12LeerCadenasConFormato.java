/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author DianaArevalo
 */
public class Ej12LeerCadenasConFormato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contC, contI;
        contC = 0;
        contI = 0;
        
        do {
            System.out.println("Ingrese una cadena de 5 caracteres");
            cadena = leer.nextLine();
            if (cadena.equals("&&&&&")) 
               break; 
            
            if (cadena.length() <= 5) {
                if (validarCadena(cadena)) {
                    contC++;
                }else{
                    contI++;
                }
            }else{
                contI++;
            }
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de lecturas correctas fue: "+contC+"\n"
                + "y la cantidad de lecturas incorrectas fue: "+contI);
    }

    public static boolean validarCadena(String cadena) {
        boolean FDE = false;
        int largo = cadena.length();
        if (cadena.substring(0, 1).equals("X") && cadena.substring(largo-1).equals("O")) {
            FDE = true;
        }
        return FDE;
    }
}
