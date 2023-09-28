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
public class Ej21MatrizContenidaEnOtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz10x10 = new int[10][10];
        int[][] matriz3x3 = new int[3][3];

        LlenarMatrizAleatorio(matriz10x10, 10);
        mostrarMatriz(matriz10x10, 10);
        LlenarMatrizManual(matriz3x3, 3);
        mostrarMatriz(matriz3x3, 3);
        BuscarMatrizContenida(matriz10x10, 10, matriz3x3, 3);

    }

    public static void LlenarMatrizAleatorio(int[][] matriz, int tam) {
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

    public static void LlenarMatrizManual(int[][] matriz, int tam) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Ingrese el valor para la posición: [" + i + ":" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void BuscarMatrizContenida(int[][] matriz, int tam1, int[][] matrizB, int tam2) {
        int filaP = 0;
        int filaAux = 0;
        int posicion = 0;
        int aux = 0;
        boolean igual = false;
        String posiciones = "";

        do {
            if (posicion <= (tam1 - tam2)) {
                filaAux = filaP;
                for (int i = 0; i < tam2; i++) {
                    aux = posicion;
                    for (int j = 0; j < tam2; j++) {
                        if (matrizB[i][j] == matriz[filaAux][aux]) {
                            igual = true;
                            posiciones = posiciones.concat("["+Integer.toString(filaAux)+","+Integer.toString(aux)+"]");
                            aux++;
                        } else {
                            igual = false;
                            break;
                        }
                    }
                    if (igual) {
                        filaAux++;
                    } else {
                        break;
                    }
                }
                if (igual) {
                    break;
                }
                posicion++;
            } else {
                filaP++;
                posicion = 0;
            }
        } while (filaP <= (tam1 - tam2) && !igual);
        if (igual) {
            System.out.println("La matriz 2 está contenida dentro de la matriz principal en las posiciones "+posiciones);
        }else{
            System.out.println("La matriz 2 no está contenida dentro de la matriz principal");
        }
    }
}
