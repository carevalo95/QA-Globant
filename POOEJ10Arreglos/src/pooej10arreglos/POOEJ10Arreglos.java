/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10arreglos;

import java.util.Arrays;

/**
 *
 * @author 57312
 */
public class POOEJ10Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        double random;

        //llenar arreglo con números aleatorios
        for (int i = 0; i < arregloA.length; i++) {
            random = Math.random() * 10 + 1;
            Arrays.fill(arregloA, i, i + 1, random);
        }

        MostrarArreglo(arregloA);
        Arrays.sort(arregloA);
        System.out.println("Arreglo A ordenado:");
        MostrarArreglo(arregloA);

        //Copiar 10 primeros números de arreglo A a B     
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }
        System.out.println("Arreglo B");
        MostrarArreglo(arregloB);
    }

    public static void MostrarArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
