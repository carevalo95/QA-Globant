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
public class Ej17ContarDigitosDeEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector;
        int tam;
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        vector = new int[tam];

        llenarVector(vector, tam);
        mostrarVector(vector, tam);
        contarDigitos(vector, tam);
    }

    public static void llenarVector(int[] vector, int tam) {
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * (20000) + 1);
            //int numero = (int)(Math.random()*(75-25+1)+25); genera números entre 25 y 75
            
            /*Random rand = new Random();
            rand.nextInt(18);
            // Numero entero entre 25 y 75
            Random numAleatorio1 = new Random();
            int n = numAleatorio.nextInt(75-25+1) + 25;
            */
        }
    }

    public static void mostrarVector(int[] vector, int tam) {
        System.out.println("El vector está conformado por:");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }

    public static void contarDigitos(int[] vector, int tam) {
        int cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        int aux;
        for (int i = 0; i < tam; i++) {
            aux = (String.valueOf(vector[i])).length();
            switch (aux) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }

        }
        System.out.println("Este es el resumen de los números:\n1 dígito: " + cont1
                + "\n2 dígitos: " + cont2 + "\n3 dígitos: " + cont3 + "\n4 dígitos: " + cont4
                + "\n5 dígitos: " + cont5);
    }
}
