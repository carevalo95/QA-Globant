/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author DianaArevalo Realizar un algoritmo que rellene un vector de tamaño N
 * con valores aleatorios y le pida al usuario un numero a buscar en el vector.
 * El programa mostrará donde se encuentra el numero y si se encuentra repetido
 */
public class Ej16BuscarValorEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector;
        int tam, buscar;
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        vector = new int[tam];

        llenarVector(vector, tam);
        mostrarVector(vector, tam);
        System.out.println("Ingrese el número a buscar:");
        buscar = leer.nextInt();

        buscarValor(vector, tam, buscar);
    }

    public static void llenarVector(int[] vector, int tam) {
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 10 + 1); // el número generado estará entre 1 y 10
            //int numero = (int)(Math.random()*(75-25+1)+25); genera números entre 25 y 75
        }
    }

    public static void buscarValor(int[] vector, int tam, int num) {
        int cont = 0;
        boolean encontrado = false;
        String aux = "";
        for (int i = 0; i < tam; i++) {
            if (vector[i] == num) {
                encontrado = true;
                cont++;
                aux = aux + String.valueOf(i) + ",";
            }
        }
        if (encontrado) {
            if (cont > 1) {
                System.out.println("El valor se encuentra " + cont + " veces en las posiciones: " + aux);
            } else {
                System.out.println("El valor se encuentra en la posición " + aux);
            }
        } else {
            System.out.println("El valor no se encuentra en el vector");
        }
    }

    public static void mostrarVector(int[] vector, int tam) {
        System.out.println("El vector está conformado por:");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
