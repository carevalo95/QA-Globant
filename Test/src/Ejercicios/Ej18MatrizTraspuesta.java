/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

//import java.util.Scanner;
/**
 *
 * @author DianaArevalo
 */
public class Ej18MatrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        int tam = 4;
        int[][] matriz = new int[tam][tam];
        llenarMatriz(matriz, tam);
        mostrarMatriz(matriz, tam);
        TrasponerMatriz(matriz, tam);

    }

    public static void llenarMatriz(int[][] matriz, int tam) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = (int) (Math.random() * (99 - 10) + 10);
                //int numero = (int)(Math.random()*(75-25+1)+25); genera números entre 25 y 75
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, int tam) {
        System.out.println("El vector está conformado por:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void TrasponerMatriz(int[][] matriz, int tam) {
        int[][] traspuesta = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz traspuesta");
        mostrarMatriz(traspuesta, tam);
    }
}
