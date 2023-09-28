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
public class VectorEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 5;
        String[] vectorEquipo = new String[tam];
        llenarVector(vectorEquipo, tam);
        mostrarVector(vectorEquipo, tam);
        
    }
    
    public static void llenarVector(String[] vector, int tam) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el nombre del integrante número " + (i + 1));
            vector[i] = leer.nextLine();
        }
        
    }
    
    public static void mostrarVector(String[] vector, int tam) {
        System.out.println("El equipo está conformado por:");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
}
