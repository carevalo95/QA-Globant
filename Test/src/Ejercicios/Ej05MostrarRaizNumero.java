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
public class Ej05MostrarRaizNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        dobleTripleYRaiz(num);
    }
    
    public static void dobleTripleYRaiz(double num){
        double doble = num*2;
        double triple = num*3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble de "+num+" es: "+doble);
        System.out.println("El triple de "+num+" es: "+triple);
        System.out.println("La raíz cuadrada de "+num+" es: "+raiz);
        
    }    
}
