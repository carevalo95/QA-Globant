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
public class VectoresYMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] vector = new int[2];    
    int[] producto = new int[3];
    
    int[][] matriz = {{4,8,6},{2,1,7}};
    
        System.out.println("Ingrese los valores del vector de tamaño " + vector.length+":");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("v["+i+"]");
            vector[i] = leer.nextInt();
        }
        //multiplica vector por matriz
        int suma;
        for (int j = 0; j < matriz[0].length; j++) {
            suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i] * matriz[i][j];
            }
            producto[j] = suma;
        }
        String aux = "";
        //mostrar vector
        System.out.println("* Vector:");
        
        for (int elemento: vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        //mostrar matriz
        System.out.println("\n* Matriz");
        //para cada fila de la matriz
        for (int[] fila:  matriz) {
            aux = "";
            //para cada elemento de la fila
            for (int elemento: fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        //Mostrar resultado
        aux = "";
        System.out.println("\n* Vector x Matriz:");
        for (int elemento: producto){
            aux += " "+ elemento;            
        }
        System.out.println(aux);
    }       
}
