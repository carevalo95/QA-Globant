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
public class Ej19MatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 3;
        int[][] matriz = new int[tam][tam];
        llenarMatriz(matriz, tam);
        mostrarMatriz(matriz, tam);
        ValidarAntiSimetrica(matriz, tam);

    }

    public static void llenarMatriz(int[][] matriz, int tam) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Ingrese el valor para la posición: [" + i + ":" + j + "]");
                matriz[i][j] = leer.nextInt();
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

    public static void ValidarAntiSimetrica(int[][] matriz, int tam) {
        int[][] traspuesta = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz traspuesta");
        mostrarMatriz(traspuesta, tam);

        boolean anti = false;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (((traspuesta[i][j]) * (-1)) == matriz[i][j]) {
                    anti = true;
                } else {
                    anti = false;
                    break;
                }
            }if (!anti) {
                break;
            }
        }

        if (anti) {
            System.out.println("La matriz es anti simétrica");
        } else {
            System.out.println("La matriz NO es anti simétrica");
        }
    }
}
