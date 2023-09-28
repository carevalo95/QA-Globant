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
public class FuncionCodificarFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una cadena de caracteres");
        frase = leer.nextLine();
        System.out.println(codificarFrase(frase));
    }
    
    public static String codificarFrase (String frase){
        String fraseCod = "";
        String caracter;
        for (int i = 0; i < frase.length(); i++) {
            
            caracter = frase.substring(i,i+1);
            switch (caracter) {
                case "a":
                case "A":
                    caracter = "@";
                    break;
                case "e":
                case "E":
                    caracter = "#";
                    break;
                case "i":
                case "I":
                    caracter = "$";
                    break;
                case "o":
                case "O":
                    caracter = "%";
                    break;
                case "u":
                case "U":
                    caracter = "*";
                    break;
            }
            fraseCod = fraseCod.concat(caracter);
        }
        return fraseCod;
        
    }    
}