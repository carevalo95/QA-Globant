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
public class Ej13CuadradoDeAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado;
        System.out.println("Ingrese el tamaño del lado del cuadrado");
        lado = leer.nextInt();
        LlenarMatriz(lado);
    }

    public static void LlenarMatriz(int tam) {
        char[][] matriz = new char[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == 0 || i == (tam - 1) || j == 0 || j == (tam - 1)) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
