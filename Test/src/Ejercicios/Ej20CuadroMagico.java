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
public class Ej20CuadroMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 3;
        int[][] matriz = new int[tam][tam];

        LlenarMatriz(matriz, tam);
        ValidarCuadroMagico(matriz, tam);

    }

    public static void LlenarMatriz(int[][] matriz, int tam) {
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                do {
                    System.out.println("Ingrese el valor para la posición: [" + i + ":" + j + "]");
                    num = leer.nextInt();
                } while (num > 10 || num < 1);
                matriz[i][j] = num;
            }
        }
    }

    public static void ValidarCuadroMagico(int[][] matriz, int tam) {
        int sumaIgual = 0;
        int suma = 0;
        boolean igual = true;
        //validar horizontal
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                suma = suma + matriz[i][j];
            }
            if (i > 0) {
                if (sumaIgual != suma) {
                    igual = false;
                    break;
                } else {
                    suma = 0;
                }
            } else {
                sumaIgual = suma;
                suma = 0;
            }
        }
        //validar vertical
        if (igual) {
            suma = 0;
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    suma = suma + matriz[j][i];
                }
                if (i > 0) {
                    if (sumaIgual != suma) {
                        igual = false;
                        break;
                    } else {
                        suma = 0;
                    }
                } else {
                    suma = 0;
                }
            }
        }
        //validar diagonal principal
        if (igual) {
            suma = 0;
            int j = 0;
            for (int i = 0; i < tam; i++) {
                suma = suma + matriz[i][j];
                j++;
            }
            //validar diagonal secundaria
            if (sumaIgual == suma) {
                suma = 0;
                j = tam - 1;
                for (int i = 0; i < tam; i++) {
                    suma = suma + matriz[i][j];
                    j--;
                }
            } else {
                igual = false;
            }
        }
        if (igual) {
            System.out.println("La matriz es un cuadro mágico");
        } else {
            System.out.println("La matriz NO es un cuadro mágico");
        }
    }
}
